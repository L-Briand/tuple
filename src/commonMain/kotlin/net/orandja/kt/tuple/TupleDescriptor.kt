package net.orandja.kt.tuple

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.descriptors.StructureKind

class TupleDescriptor(private val descriptors: Array<out SerialDescriptor>) : SerialDescriptor {
    @ExperimentalSerializationApi
    override val kind: SerialKind get() = StructureKind.LIST

    @ExperimentalSerializationApi
    override val serialName: String = "${TupleDescriptor::class.simpleName}"

    @ExperimentalSerializationApi
    override val elementsCount: Int = descriptors.size

    override val isInline: Boolean = false

    @ExperimentalSerializationApi
    override fun getElementName(index: Int): String = index.toString()

    @ExperimentalSerializationApi
    override fun getElementIndex(name: String): Int =
        name.toIntOrNull() ?: throw IllegalArgumentException("$name is not a valid list index")

    @ExperimentalSerializationApi
    override fun isElementOptional(index: Int): Boolean {
        require(index >= 0) { "Illegal index $index, $serialName expects only non-negative indices" }
        return false
    }

    @ExperimentalSerializationApi
    override fun getElementAnnotations(index: Int): List<Annotation> {
        require(index >= 0) { "Illegal index $index, $serialName expects only non-negative indices" }
        return descriptors[index].annotations
    }

    @ExperimentalSerializationApi
    override fun getElementDescriptor(index: Int): SerialDescriptor {
        require(index >= 0) { "Illegal index $index, $serialName expects only non-negative indices" }
        return descriptors[index]
    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun toString(): String = "$serialName[${descriptors.joinToString { it.serialName }}]"
}