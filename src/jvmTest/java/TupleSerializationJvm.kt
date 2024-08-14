import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.hocon.Hocon
import kotlinx.serialization.serializer
import net.orandja.kt.tuple.Tuple3
import net.orandja.kt.tuple.tuple
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalSerializationApi::class)
class TupleSerializationJvm {

    @Serializable
    data class TestData(val data: String)
    @Serializable
    data class TestTuple(val tuple: Tuple3<String, Int, TestData>)


    @Test
    fun serialize() {
        val data = TestTuple(tuple("a", 23, TestData("b")))
        val config = ConfigFactory.parseString("""{"tuple":["a",23,{"data":"b"}]}""")
        assertHoconSerialization(data, config)
    }

    private inline fun <reified T> assertHoconSerialization(
        value: T,
        valueBytes: Config,
        serializer: KSerializer<T> = serializer(),
        codec: Hocon = Hocon,
    ) {
        val encoded = codec.encodeToConfig(serializer, value)
        assertEquals(valueBytes, encoded)
        val decoded = codec.decodeFromConfig(serializer, encoded)
        assertEquals(value, decoded)
    }
}