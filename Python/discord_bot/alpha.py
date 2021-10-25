import discord
import random

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
        if username == "paradoxicalinsomniac" and user_message.lower() == "hello":
            await message.channel.send(f'Hello **My Creator**')
        elif username == "paradoxicalinsomniac" and user_message.lower() == "bot pintar":
            await message.channel.send(f'Thank You **My Creator**')
        elif username == "kotek058" and user_message.lower() == "hello":
            await message.channel.send(f'Hello **Ya Habibie Ihsan**')
        else:
            if message.channel.name == 'general' or message.channel.name == 'bot-terminal':
                if user_message.lower() == "hello" or user_message.lower() == "halo":
                    await message.channel.send(f'Hello **{username}**')
                    return
                elif user_message.lower() == 'bye':
                    await message.channel.send(f'Dadahh {username}')
                    return
                elif user_message.lower() == "mico!info":
                    await message.channel.send("== Micola Bot Ver Alpha 0,1==")
                elif user_message.lower() == "mico!ship":
                    await message.channel.send("`Ship hari ini` : **Dapin** & **Dino**")
                elif user_message.lower() == "mico!help":
                    await message.channel.send("> **== Micola Bot Helper Ver 0.1 ==**\n1. `mico!ship` : untuk melihat ship hari ini dari kelas **1DC01**\n2. `mico!kabar` : untuk menanyakan kabar dari **Micola**\n2. `mico!call` : untuk memanggil **Micola**")
                elif user_message.lower() == "mico!kabar":
                    await message.channel.send(f"**micola** dalam keadaan baik, terima kasih atas perhatiannya **{username}**")
                elif user_message.lower() == "mico!call":
                    await message.channel.send(f"{username} are **calling** you, <@!719492949485944894>")
            elif user_message.lower() == "bot pintar":
                await message.channel.send(f'Shut up **Mere humans**')
client.run(TOKEN)
