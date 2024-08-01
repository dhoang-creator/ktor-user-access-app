package example.com.routing.response

import example.com.util.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class UserResponse(
    // why have we included a serializer within here?
    @Serializable(with = UUIDSerializer::class)
    val id: UUID,
    val username: String,
)
