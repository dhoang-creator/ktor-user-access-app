package example.com

import example.com.plugins.*
import example.com.repository.UserRepository
import example.com.routing.configureRouting
import example.com.service.UserService
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val userRepository = UserRepository()
    val userService = UserService(userRepository)

    configureSerialization()
    configureRouting(userService)
}
