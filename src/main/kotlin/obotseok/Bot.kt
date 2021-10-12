package obotseok

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.OnlineStatus

class Bot(private val token: String) {
    fun start() {
        val builder = JDABuilder.createDefault(token)
            .setAutoReconnect(true)
            .setStatus(OnlineStatus.ONLINE)
            .build()
    }
}