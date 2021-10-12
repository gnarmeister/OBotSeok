package obotseok

object Launcher {
    @JvmStatic
    fun main(args: Array<String>) {
        val token = try {
            ClassLoader.getSystemResource("bot-token.txt").readText().trim()
        } catch (error: Exception) {
            throw RuntimeException("Failed to load bot token. Make sure to create a file named bot-token.txt in" +
                    " src/main/resources and paste the bot token into that file.", error)
        }

        val bot = Bot(token)
        bot.start()
    }
}