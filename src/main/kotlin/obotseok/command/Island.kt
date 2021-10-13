package obotseok.command

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent
import obotseok.util.getIslandInfo

class Island: Command("!모험섬") {
    override fun run(event: GuildMessageReceivedEvent) {
        runBlocking {
            launch {
                var result: String = ""
                val islandInfo: List<String> = getIslandInfo()
                for (i: Int in 0..4 step(2)) {
                    result += islandInfo[i] + ": " + islandInfo[i+1] + "\n"
                }
                event.channel.sendMessage(result).queue()
            }
        }
    }
}