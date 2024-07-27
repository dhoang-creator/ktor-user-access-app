import java.util.UUID

data class Task(
    val user: String,
    val password: String,
    val id: UUID
)