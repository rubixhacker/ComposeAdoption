package com.hackedcube.composeadoption.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hackedcube.composeadoption.data.Dog
import com.hackedcube.composeadoption.data.doggoIpsum
import com.hackedcube.composeadoption.data.dogs
import com.hackedcube.composeadoption.ui.theme.ComposeAdoptionTheme
import dev.chrisbanes.accompanist.coil.CoilImage
import kotlin.math.min

const val maxScroll = 700

@Composable
fun DogDetailsScreen(dog: Dog, onClose: () -> Unit) {
    val scrollState = rememberScrollState()

    val current =  min(scrollState.value, maxScroll)
    val tranparency = current / maxScroll.toFloat()

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colors.primary.copy(alpha = tranparency),
                title = {
                    Text(text = dog.name, modifier = Modifier.alpha(tranparency), color = Color.Black)
                },

                navigationIcon = {
                    IconButton(onClick = onClose) {
                        Icon(Icons.Default.Close, "close", tint = Color.Black)
                    }
                },
                elevation = 0.dp
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            CoilImage(
                data = dog.uri,
                contentDescription = "My content description",
                modifier = Modifier
                    .padding(top = 30.dp)
                    .clip(CircleShape)
                    .fillMaxWidth(.5f)
                    .aspectRatio(1.0f),
                contentScale = ContentScale.Crop
            )

            Text(
                text = dog.name,
                style = MaterialTheme.typography.h4
            )

            Text(text = doggoIpsum, modifier = Modifier.padding(top= 16.dp, bottom = 48.dp))
        }
    }
}


@Preview
@Composable
fun DogDetails_Preview() {
    ComposeAdoptionTheme {
        DogDetailsScreen(dog = dogs.filter { it.uri.isNotBlank() }.random()) {}
    }
}