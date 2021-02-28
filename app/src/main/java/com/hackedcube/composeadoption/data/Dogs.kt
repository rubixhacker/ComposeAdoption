package com.hackedcube.composeadoption.data

import android.os.Parcelable
import androidx.compose.runtime.Immutable
import kotlinx.parcelize.Parcelize

@Immutable
@Parcelize
data class Dog(val name: String, val breed: Breed, val uri: String) : Parcelable

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
    Dog("Lexi", Breed.LabradorRetriever, "https://images.dog.ceo/breeds/labrador/n02099712_3698.jpg"),
    Dog("Cookie", Breed.LabradorRetriever, "https://images.dog.ceo/breeds/labrador/n02099712_4354.jpg"),
    Dog("Roscoe", Breed.LabradorRetriever, "https://images.dog.ceo/breeds/labrador/n02099712_4960.jpg"),
    Dog("Whiskey", Breed.LabradorRetriever, "https://images.dog.ceo/breeds/labrador/n02099712_6446.jpg"),
    Dog("Shadow", Breed.LabradorRetriever, "https://images.dog.ceo/breeds/labrador/n02099712_1866.jpg"),
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
    Dog("Maya", Breed.GoldenRetriever, "https://images.dog.ceo/breeds/retriever-golden/n02099601_864.jpg"),
    Dog("Brady", Breed.GoldenRetriever, "https://images.dog.ceo/breeds/retriever-golden/n02099601_2295.jpg"),
    Dog("Tyson", Breed.GoldenRetriever, "https://images.dog.ceo/breeds/retriever-golden/n02099601_8181.jpg"),
    Dog("Bailey", Breed.GoldenRetriever, "https://images.dog.ceo/breeds/retriever-golden/n02099601_7037.jpg"),
    Dog("Jeter", Breed.GoldenRetriever, "https://images.dog.ceo/breeds/retriever-golden/n02099601_100.jpg"),
    Dog("Polo", Breed.GoldenRetriever, "https://images.dog.ceo/breeds/retriever-golden/n02099601_6772.jpg"),
    Dog("Sandy", Breed.GoldenRetriever, "https://images.dog.ceo/breeds/retriever-golden/Z6A_4650_200812.jpg"),
    Dog("Ace", Breed.FrenchBulldog, "https://images.dog.ceo/breeds/bulldog-french/n02108915_8604.jpg"),
    Dog("Copper", Breed.FrenchBulldog, "https://images.dog.ceo/breeds/bulldog-french/n02108915_9457.jpg"),
    Dog("Bentley", Breed.FrenchBulldog, "https://images.dog.ceo/breeds/bulldog-french/n02108915_3129.jpg"),
    Dog("Lola", Breed.FrenchBulldog, "https://images.dog.ceo/breeds/bulldog-french/n02108915_7266.jpg"),
    Dog("Alex", Breed.FrenchBulldog, "https://images.dog.ceo/breeds/bulldog-french/n02108915_2545.jpg"),
    Dog("Chester", Breed.Beagle, "https://images.dog.ceo/breeds/beagle/n02088364_2652.jpg"),
    Dog("Lucky", Breed.Beagle, "https://images.dog.ceo/breeds/beagle/n02088364_11458.jpg"),
    Dog("Bandit", Breed.Beagle, "https://images.dog.ceo/breeds/beagle/n02088364_13572.jpg"),
    Dog("Annie", Breed.Beagle, "https://images.dog.ceo/breeds/beagle/n02088364_2143.jpg"),
    Dog("Foster", Breed.Beagle, "https://images.dog.ceo/breeds/beagle/n02088364_9849.jpg"),
    Dog("Chewy", Breed.Beagle, "https://images.dog.ceo/breeds/beagle/n02088364_852.jpg"),
    Dog("Leo", Breed.Poodle, "https://images.dog.ceo/breeds/poodle-standard/n02113799_2280.jpg"),
    Dog("Zeus", Breed.Poodle, "https://images.dog.ceo/breeds/poodle-standard/n02113799_7649.jpg"),
    Dog("Hazel", Breed.Corgi, "https://images.dog.ceo/breeds/pembroke/n02113023_3998.jpg"),
    Dog("Roxie", Breed.Corgi, "https://images.dog.ceo/breeds/pembroke/n02113023_6567.jpg"),
    Dog("Rudy", Breed.Corgi, "https://images.dog.ceo/breeds/pembroke/n02113023_3601.jpg"),
    Dog("Sophie", Breed.Corgi, "https://images.dog.ceo/breeds/pembroke/n02113023_2919.jpg"),
    Dog("Harley", Breed.Corgi, "https://images.dog.ceo/breeds/pembroke/n02113023_2971.jpg"),
)

const val doggoIpsum = """Come great dance chow chow vet milk bone bulldog, heel lab down squeak toy. Bark take it puppies down, bell beagle down sit paw poodle lap dog leash. Tail dog bowl dog pomsky roll over heel sit. Dachshund german shephard fetch sit leap, spin pomeranian chew toy shih tzu shake vet tail german shephard puppies. Lap dog pomsky husky paw bulldog sit pretty pit bull.

Tail poodle fetch jump, stay leash speak poodle release boxer vet lap dog. Beagle tennis ball tail chihuahua chew toy bark vet. Catch chase tail milk bone leap shih tzu, tennis ball boxer leap leave it come. Peanut butter yorkshire terrier dog house pomsky leash dog play dead yorkshire terrier pomsky. Chase tail bring it leash dog toy beagle bell, bulldog peanut butter greyhound rottweiler squeak toy peanut butter greyhound speak. Poodle paw bulldog chow chow bring it take it leash tail. Bring it leap bulldog stand puppy beagle kibbles leash. Chow chow pug puppy, bite yorkshire terrier squeak toy jump roll over leap fetch shake leash english mastiff dog house. Chow chow husky take it bring it pug puppy leash.


Leash leap release bulldog leash bulldog kibbles. Greyhound dachshund bite dog squirrel puppy dog bowl. Leash leap jump great dance squirrel poodle sit squeak toy.

Bell boxer tug husky sit pretty play dead pomeranian tennis ball squeak toy pomeranian, growl shih tzu release paw. Tail Morkie lap dog play dead leash poodle stay collar. Release dog bone husky sit vet shake bark leave it, bite dachshund down dog house poodle boxer. Stay dachshund dog house speak, bite sit speak poodle chihuahua come great dance leash take it chihuahua. Pomsky heel yorkshire terrier play dead husky kibbles, down tug chow chow dog toy.

Greyhound tail bring it, speak sit pit bull english mastiff vet milk bone lap dog. Squeak toy dog bone catch german shephard pit bull dog bowl pit bull. Pomeranian dog bowl dog, bring it heel chihuahua dachshund growl leash greyhound maltese greyhound. Dog house pomeranian sit, lap dog leash kibbles bark down vet stay boxer peanut butter roll over dog. Poodle boxer pug pomsky dog bowl tail sit poodle.

Milk bone bring it st bernard growl great dance take it english mastiff catch. Take it kibbles husky kibbles, poodle growl tail pit bull pomsky Morkie yorkshire terrier. Stand pomeranian dog bowl dog bone poodle maltese growl k9 boxer. Pit bull dog house bring it, jump tail collar catch pomeranian growl milk bone. Play dead roll over greyhound puppy roll over sit pretty english mastiff.

Jump kibbles k9 peanut butter play dead dachshund rottweiler. Sit pug catch growl, dog house play dead chew toy play dead catch leash. Bite bark down, bite yorkshire terrier pomsky puppy german shephard pit bull heel sit pretty beagle german shephard shake. Dog bowl release dog bone beagle spin roll over pomeranian. Puppies boxer release speak poodle come english mastiff chew toy catch. Puppies puppy chow chow bulldog take it puppies maltese. Down lab dachshund chew toy squirrel, take it down lap dog paw dog house pomeranian. Leap boxer shih tzu, Morkie paw leash catch tail bulldog dog bone bark. Pomeranian stand maltese fetch growl fetch, dog toy great dance lap dog sit pretty.

Greyhound fetch st bernard kibbles, dog bowl peanut butter poodle growl peanut butter dog toy dog dog bowl release shih tzu. K9 lap dog rottweiler, lab play dead play dead leash tail speak maltese bulldog. Pug bark leave it, squirrel puppy come bark milk bone bark paw. Tail paw tennis ball squeak toy bulldog milk bone, leave it leash pomsky spin bark puppy tail. Growl release pomeranian poodle spin dog bowl spin stay dog bowl. Sit pretty k9 tug leap pomsky maltese pug. Dachshund peanut butter roll over husky, puppy boxer sit pretty dog squirrel puppies fetch squeak toy greyhound squeak toy. Shake bring it stand st bernard leap bell husky shih tzu doberman pinscher shake, dachshund spin leash great dance. Poodle come pug, shih tzu speak chew toy pit bull spin vet growl release beagle dog toy.

Tennis ball leap dog house stand lab chew toy tail. Kibbles play dead bulldog doberman pinscher bite boxer release pomsky sit. Pit bull squirrel sit puppy squeak toy chew toy rottweiler, bite bulldog great dance husky husky. Heel peanut butter bite pomsky pit bull poodle leash pomeranian, chow chow chihuahua dog house bring it tug. St bernard roll over german shephard doberman pinscher husky pug poodle squirrel yorkshire terrier, leash lab paw dog toy."""
