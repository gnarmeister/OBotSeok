import re
import discord


async def handle_message(message: discord.Message):
    regexp = re.compile("[Oo오]")
    if regexp.search(message.content):
        await message.channel.send("오? 범석.")
