package com.hackedcube.composeadoption.data

import androidx.compose.runtime.Immutable

@Immutable
data class Dog(val name: String, val breed: Breed, val uri: String)

enum class Breed(val displayName: String) {
    LabradorRetriever("Labrador"),
    GermanShepard("German Shepard"),
    GoldenRetriever("Golden Retriever"),
    FrenchBulldog("French Bulldog"),
    Bulldog("Bulldog"),
    Poodle("Poodle"),
    Beagle("Beagle"),
    Rottweilers("Rottweiler"),
    Pointer("Pointer"),
    Corgi("Corgi"),
    Dachshund("Dachshund"),
    YorkshireTerrier("Yorkshire Terrier"),
    AustralianShepherd("Australian Shepherds"),
    Boxer("Boxer"),
    Huskies("Huskies")
}

val dogs = listOf<Dog>(
    Dog("Lexi", Breed.LabradorRetriever, ""),
    Dog("Cookie", Breed.LabradorRetriever, ""),
    Dog("Roscoe", Breed.LabradorRetriever, ""),
    Dog("Whiskey", Breed.LabradorRetriever, ""),
    Dog("Shadow", Breed.LabradorRetriever, ""),
    Dog(
        "Ginger",
        Breed.GermanShepard,
        "https://images.dog.ceo/breeds/germanshepherd/Bagira_site.jpg"
    ),
    Dog("Benny", Breed.GermanShepard, "https://images.dog.ceo/breeds/germanshepherd/Hannah.jpg"),
    Dog(
        "Bud",
        Breed.GermanShepard,
        "https://images.dog.ceo/breeds/germanshepherd/IMG_20200801_005825_408.jpg"
    ),
    Dog(
        "Sadie",
        Breed.GermanShepard,
        "https://images.dog.ceo/breeds/germanshepherd/IMG_20200801_005827_704.jpg"
    ),
    Dog(
        "Allie",
        Breed.GermanShepard,
        "https://images.dog.ceo/breeds/germanshepherd/IMG_20200801_005830_387.jpg"
    ),
    Dog(
        "Macy",
        Breed.GermanShepard,
        "https://images.dog.ceo/breeds/germanshepherd/IMG_20200801_005834_050.jpg"
    ),
    Dog(
        "Gigi",
        Breed.GermanShepard,
        "https://images.dog.ceo/breeds/germanshepherd/n02106662_10122.jpg"
    ),
    Dog("Maya", Breed.GoldenRetriever, ""),
    Dog("Brady", Breed.GoldenRetriever, ""),
    Dog("Tyson", Breed.GoldenRetriever, ""),
    Dog("Bailey", Breed.GoldenRetriever, ""),
    Dog("Jeter", Breed.GoldenRetriever, ""),
    Dog("Polo", Breed.GoldenRetriever, ""),
    Dog("Sandy", Breed.GoldenRetriever, ""),
    Dog("Ace", Breed.FrenchBulldog, ""),
    Dog("Copper", Breed.FrenchBulldog, ""),
    Dog("Bentley", Breed.FrenchBulldog, ""),
    Dog("Lola", Breed.FrenchBulldog, ""),
    Dog("Alex", Breed.FrenchBulldog, ""),
    Dog("Rosie", Breed.FrenchBulldog, ""),
    Dog("Beau", Breed.FrenchBulldog, ""),
    Dog("Chewy", Breed.Bulldog, ""),
    Dog("Luna", Breed.Bulldog, ""),
    Dog("Marley", Breed.Bulldog, ""),
    Dog("Kahlua", Breed.Bulldog, ""),
    Dog("Sammy", Breed.Bulldog, ""),
    Dog("Bella", Breed.Bulldog, ""),
    Dog("Stella", Breed.Bulldog, ""),
    Dog("Chester", Breed.Pointer, ""),
    Dog("Lucky", Breed.Pointer, ""),
    Dog("Bandit", Breed.Pointer, ""),
    Dog("Annie", Breed.Pointer, ""),
    Dog("Foster", Breed.Pointer, ""),
    Dog("Oreo", Breed.Pointer, ""),
    Dog("Bear", Breed.Pointer, ""),
    Dog("Leo", Breed.Poodle, ""),
    Dog("Zeus", Breed.Poodle, ""),
    Dog("Brewster", Breed.Pointer, ""),
    Dog("Buddy", Breed.Pointer, ""),
    Dog("Toby", Breed.Pointer, ""),
    Dog("Hazel", Breed.Corgi, ""),
    Dog("Roxie", Breed.Corgi, ""),
    Dog("Rudy", Breed.Corgi, ""),
    Dog("Sophie", Breed.Corgi, ""),
    Dog("Harley", Breed.Corgi, ""),
)