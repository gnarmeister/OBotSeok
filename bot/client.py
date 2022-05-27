import discord
from .handle_event import handle_message


class OBotSeok(discord.Client):
    async def on_message(self, message: discord.Message):
        if message.author == self.user:
            return
        await handle_message(message)
