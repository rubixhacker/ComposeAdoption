package com.hackedcube.composeadoption.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.hackedcube.composeadoption.data.Breed
import com.hackedcube.composeadoption.data.Dog
import com.hackedcube.composeadoption.data.dogs
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DogListScreen(doggoSelected: (Dog) -> Unit) {
    val dogs: Map<Breed, List<Dog>> = remember { dogs.groupBy { it.breed } }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Compose Adoption", color = Color.Black)
                },
            )
        }
    ) {
        LazyColumn(contentPadding = PaddingValues(bottom = 32.dp, top = 16.dp)) {
            dogs.forEach { (breed, dogList) ->
                item {
                    BreedHeader(breed = breed)
                }
                item {
                    LazyRow(contentPadding = PaddingValues(start = 16.dp, end = 16.dp)) {
                        items(dogList) { dog ->
                            DogCard(dog = dog, modifier = Modifier.padding(8.dp), dogClicked = doggoSelected)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BreedHeader(breed: Breed) {
    Text(
        text = breed.displayName,
        modifier = Modifier.padding(
            horizontal = 16.dp,
            vertical = 8.dp
        ),
        style = MaterialTheme.typography.h5
    )
}

@Composable
fun DogCard(dog: Dog, dogClicked: (Dog) -> Unit, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .requiredSize(width = 150.dp, height = 150.dp)
            .clickable { dogClicked(dog) },
        elevation = 2.dp
    ) {
        ConstraintLayout {
            val (name) = createRefs()

            CoilImage(
                data = dog.uri,
                contentDescription = "My content description",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )


            Text(
                text = dog.name,
                modifier = Modifier
                    .constrainAs(name) {
                        width = Dimension.fillToConstraints
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = .9f)
                            )
                        )
                    )
                    .padding(bottom = 4.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.body1.copy(color = Color.White)


            )

        }
    }
}

@Preview(group = "Components")
@Composable
fun DogCardPreview() {
    MaterialTheme {
        DogCard(dog = dogs.filter { it.uri.isNotBlank() }.random(), {})
    }
}

@Preview(showSystemUi = true, showBackground = true, group = "Screen")
@Composable
fun DogListPreview() {
    MaterialTheme {
        DogListScreen { dog ->

        }
    }

}