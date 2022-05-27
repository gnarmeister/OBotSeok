from bot.client import OBotSeok

TOKEN = ""


def main():
    client = OBotSeok()
    client.run(TOKEN)


if __name__ == "__main__":
    main()
