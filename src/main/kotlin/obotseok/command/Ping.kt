package obotseok.command

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent

class Ping : Command("!ping") {
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Pong").queue()
    }
}