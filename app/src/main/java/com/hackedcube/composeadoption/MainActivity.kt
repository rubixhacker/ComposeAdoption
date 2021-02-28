package com.hackedcube.composeadoption

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.hackedcube.composeadoption.data.Dog
import com.hackedcube.composeadoption.ui.screens.DogDetailsScreen
import com.hackedcube.composeadoption.ui.screens.DogListScreen
import com.hackedcube.composeadoption.ui.theme.ComposeAdoptionTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            ComposeAdoptionTheme {
                NavHost(navController, startDestination = "doggos") {
                    composable("doggos") {
                        DogListScreen { dog ->
                            navController.currentBackStackEntry?.arguments?.putParcelable(
                                "doggo",
                                dog
                            )
                            navController.navigate("doggo")
                        }
                    }
                    composable("doggo") {
                        navController.previousBackStackEntry?.arguments?.getParcelable<Dog>("doggo")?.let { dog ->
                            DogDetailsScreen(dog = dog) {
                                navController.popBackStack()
                            }
                        }
                    }
                }
            }
        }
    }
}