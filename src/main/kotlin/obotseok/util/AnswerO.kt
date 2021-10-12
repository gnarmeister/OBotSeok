package obotseok.util

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent

fun answerO(event: GuildMessageReceivedEvent) : Boolean {
    val content = event.message.contentRaw
    return if (content.contains(Regex("[Oo오]"))) {
        event.channel.sendMessage("오? 범석.").queue()
        true
    } else {
        false
    }
}
