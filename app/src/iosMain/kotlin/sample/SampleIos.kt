package sample

import cocoapods.AFNetworking.AFHTTPRequestSerializer

actual class Sample {
    actual fun checkMe(): Int {
        AFHTTPRequestSerializer.serializer()
        return 7
    }
}

actual object Platform {
    actual val name: String = "iOS"
}