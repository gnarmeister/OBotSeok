from bot.client import OBotSeok
import os

TOKEN = os.environ.get("TOKEN")


def main():
    client = OBotSeok()
    client.run(TOKEN)


if __name__ == "__main__":
    main()
