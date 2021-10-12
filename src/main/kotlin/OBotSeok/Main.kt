package OBotSeok

import com.jessecorbett.diskord.bot.bot
import com.jessecorbett.diskord.bot.classicCommands

private val BOT_TOKEN = try {
    ClassLoader.getSystemResource("bot-token.txt").readText().trim()
} catch (error: Exception) {
    throw RuntimeException("Failed to load bot token. Make sure to create a file named bot-token.txt in" +
            " src/main/resources and paste the bot token into that file.", error)
}

suspend fun main(args: Array<String>) {
    bot(BOT_TOKEN) {
        classicCommands {
            command("ping") { message ->
                message.respond("Pong!")
            }
        }
    }
}
