# Tuples for kotlinx-serialization

This package provides basic kotlin tuples classes which are serializable with kotlinx-serialization.
The tuples are encoded like an ordered typed list.

```kotlin
var tup4 = tuple(1, "a", 2, "b")
val json = Json.encodeToString(tup4)
assert("""[1,"a",2,"b"]""" == json)
```

You can create tuples up to 12 elements with the function `tuple` or their classes `Tuple1` to `Tuple12`.

# Gradle

Add the dependency to your Gradle dependency like so:

```kotlin
dependencies {
    implementation("net.orandja.kt:tuple:1.0.1")
}
```

Or in your multiplatform project:

```kotlin
kotlin {
    // config
    sourceSets {
        getByName("commonMain") {
            dependencies {
                implementation("net.orandja.kt:tuple:1.0.1")
            }
        }
    }
}
```

## Custom class serialization

If you need to serialize your own class into tuple, you can use the associated serializer. (like `Tuple3.Serializer`)

```kotlin
@Serializable(UserSerializer::class)
data class User(val name: String, val age: Int)

class UserSerializer : KSerializer<User> {
    private val delegate = Tuple2.Serializer(
        String.serializer(),
        Int.serializer()
    )

    override fun deserialize(decoder: Decoder): User {
        val tuple = delegate.deserialize(decoder)
        return User(tuple.first, tuple.second)
    }

    override fun serialize(encoder: Encoder, value: User) {
        val tuple = tuple(value.name, value.age)
        delegate.serialize(encoder, tuple)
    }
}

fun main() {
    val json = Json.encodeToString(User("John", 23))
    assert("""["John",23]""" == json)
}
```

## More than 12 value tuples?

I don't know if it's useful at this point, but you can copy the way the tuple classes are made and create your own
Tuple32 class.

This is how the Tuple4 class is created:

```kotlin
fun <T1, T2, T3, T4> tuple(
    first: T1, second: T2, third: T3, fourth: T4
) = Tuple4(first, second, third, fourth)

@Serializable(Tuple4.Serializer::class)
data class Tuple4<T1, T2, T3, T4>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
) : Tuple {
    class Serializer<T1, T2, T3, T4>(
        private val t1Serializer: KSerializer<T1>,
        private val t2Serializer: KSerializer<T2>,
        private val t3Serializer: KSerializer<T3>,
        private val t4Serializer: KSerializer<T4>,
    ) : AbstractTupleSerializer<Tuple4<T1, T2, T3, T4>>(
        t1Serializer.descriptor,
        t2Serializer.descriptor,
        t3Serializer.descriptor,
        t4Serializer.descriptor,
    ) {
        override fun CompositeDecoder.deserializeTuple(): Tuple4<T1, T2, T3, T4> = tuple(
            decode(0, t1Serializer),
            decode(1, t2Serializer),
            decode(2, t3Serializer),
            decode(3, t4Serializer)
        )

        override fun CompositeEncoder.serializeTuple(value: Tuple4<T1, T2, T3, T4>) {
            encode(0, t1Serializer, value.first)
            encode(1, t2Serializer, value.second)
            encode(2, t3Serializer, value.third)
            encode(3, t4Serializer, value.fourth)
        }
    }
}
```