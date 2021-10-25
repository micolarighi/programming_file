import random
import time
playlist = ["Luke Chiang - Shouldn't Be",
            "keshi - Beside You", "Luke Chiang - Paragraph", "RINI - Meet me in amsterdam"]
played_songs = []

for i in range(len(playlist)):
    time.sleep(5)
    r = random.randint(0, len(playlist) - 1)

    if playlist[r] not in played_songs:
        print("Now Playing", playlist[r])
        played_songs.append(playlist[r])
    else:
        continue
