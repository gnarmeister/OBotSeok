from bot.client import OBotSeok
import os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv("TOKEN")


def main():
    client = OBotSeok()
    client.run(TOKEN)


if __name__ == "__main__":
    main()
