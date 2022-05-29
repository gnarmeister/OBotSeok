import discord


async def command_github(message: discord.Message):
    await message.channel.send("https://github.com/gnarmeister/OBotSeok/")


async def command_help(message: discord.Message):
    s = ""
    for command in command_dict:
        s += "`!{}`\t{}\n".format(command, command_dict[command]["description"])
    await message.channel.send(s)


command_dict = {
    "깃허브": {"function": command_github, "description": "깃허브 저장소 주소"},
    "도움말": {"function": command_help, "description": "도움말"},
}


async def handle_command(message: discord.Message):
    command = message.content[1:]
    try:
        await command_dict[command]["function"](message)
    except (KeyError):
        await message.channel.send("유효하지 않은 명령어입니다. 사용 가능한 명령어를 확인하려면 `!도움말`을 입력하세요.")
