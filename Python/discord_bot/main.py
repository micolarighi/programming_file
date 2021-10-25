import discord
import random

from discord import message

TOKEN = 'ODk5OTIxMDM1MjA0MzkwOTgy.YW5yxg.P9u6nPDjEVwQipSKtAaeVtU7bH0'

client = discord.Client()


@client.event
async def on_ready():
    print('We have logged in as {0.user} '.format(client))


@client.event
async def on_message(message):
    username = str(message.author).split('#')[0]
    user_message = str(message.content)
    channel = str(message.channel.name)
    print(f'{username} : {user_message} ({channel})')
    mention = message.author.mention
    print(mention)

    if message.author == client.user:
        return
    if message.content.startswith("mico!"):
        if user_message.lower() == "mico!help":
            pass

client.run(TOKEN)
