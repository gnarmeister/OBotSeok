import discord


async def play_audio(source: discord.AudioSource, channels: list[discord.VoiceChannel]):
    for i in range(len(channels)):
        if len(channels[i].members) > 0:
            voice_channel = channels[i]

    voice_client: discord.VoiceClient = await voice_channel.connect()
    source: discord.AudioSource = discord.FFmpegPCMAudio()
    await voice_client.play(source)
    await voice_client.disconnect()
