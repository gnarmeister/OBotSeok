package obotseok.listner

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.api.hooks.EventListener
import obotseok.Bot

class EventListener(private val bot: Bot) : EventListener {
    private fun onMessageReceived(event: GuildMessageReceivedEvent) {
        for (command in bot.commands) {
            if (command.handle(event)) {
                return
            }
        }
    }

    override fun onEvent(event: GenericEvent) {
        if (event is GuildMessageReceivedEvent) {
            onMessageReceived(event)
        }
    }
}