package net.xenotime.network.proto

import net.xenotime.network.proto.codec.NetworkProtoReader
import net.xenotime.network.proto.codec.NetworkProtoWriter

abstract class NetworkPacket<R: NetworkProtoReader , W: NetworkProtoWriter>(private val id: Byte) {
    abstract fun encode(writer: W)
    abstract fun decode(reader: R)

    fun id(): Byte {
        return this.id
    }
}
