import discord
import os
import time


async def play_audio(filename: str, message: discord.Message):
    # select non-empty voice channel
    channels = message.guild.voice_channels
    voice_channel = channels[0]
    for i in range(len(channels)):
        if len(channels[i].members) > 0:
            voice_channel = channels[i]

    # connect to voice channel
    voice_client: discord.VoiceClient = await voice_channel.connect()
    message.channel.send("connected")

    # play audio file through FFmpeg
    src_path = os.path.join(os.getcwd(), "sound", filename)
    message.channel.send(src_path)
    source: discord.AudioSource = discord.FFmpegPCMAudio(src_path)
    voice_client.play(source)
    message.channel.send("playing")

    # disconnect after playing
    while voice_client.is_playing():
        time.sleep(1)
    await voice_client.disconnect()
    message.channel.send("done")
