package obotseok.listner

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.api.hooks.EventListener
import obotseok.Bot
import obotseok.util.answerO

class EventListener(private val bot: Bot) : EventListener {
    private fun onMessageReceived(event: GuildMessageReceivedEvent) {
        if (event.author.isBot) {
            return
        }

        for (command in bot.commands) {
            if (command.handle(event)) {
                return
            }
        }

        if (answerO(event)) {
            return
        }
    }

    override fun onEvent(event: GenericEvent) {
        if (event is GuildMessageReceivedEvent) {
            onMessageReceived(event)
        }
    }
}