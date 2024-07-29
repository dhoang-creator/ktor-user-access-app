package example.com.routing.response

import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class UserResponse(
    val id: UUID,
    val username: String,
)
