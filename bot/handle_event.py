import re
import discord
from .handle_command import handle_command


async def handle_message(message: discord.Message):
    if message.content.startswith("!"):
        await handle_command(message)
        return

    regexp = re.compile("[Oo오]")
    if regexp.search(message.content):
        await message.channel.send("오? 범석.")
