import pygame
from pygame import mixer
import time

while True:
    # initializing the mixer
    mixer.init()
    # creating the main menu input then check its value
    main_menu = input("Play [p] | Quit [q] : ")
    if main_menu == "q":
        break
    elif main_menu == "p":
        mixer.music.load(
            "/home/paradoxicalinsomniac/Documents/code/Python/musicplayer/dir/Fly Me To The Moon.mp3")
        mixer.music.play()
        while mixer.music.get_busy():
            time.sleep(1)
            music_control = input(
                "Stop [s] | Pause [p] | Quit [q] : ")
            if music_control == "p":
                mixer.music.pause()
            elif music_control == "s":
                mixer.music.stop()
            elif music_control == "q":
                quit()
