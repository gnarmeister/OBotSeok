package obotseok

import net.dv8tion.jda.api.JDABuilder
import obotseok.command.Ping
import obotseok.listner.EventListener

class Bot(private val token: String) {
    val commands = listOf(
        Ping()
    )

    fun start() {
        val builder = JDABuilder.createDefault(token)
            .setAutoReconnect(true)
            .addEventListeners(EventListener(this))
            .build()
    }
}