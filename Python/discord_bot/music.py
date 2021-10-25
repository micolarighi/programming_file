from discord.ext import commands
bot = commands.Bot(command_prefix="mi.")

bot.lava_nodes = [
    {
        'host': 'lava.link',
        'port': 80,
        'rest_uri': f'http://lava.link:80',
        'identifier': 'MAIN',
        'password': 'argonaut',
        'region': 'singapore'
    }
]


@bot.event
async def on_ready():
    print("bot ready..")
    bot.load_extension('dismusic')
bot.run('ODk5OTIxMDM1MjA0MzkwOTgy.YW5yxg.P9u6nPDjEVwQipSKtAaeVtU7bH0')
