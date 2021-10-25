import pyautogui
import tkinter
import time
time.sleep(7)
f = open("script", "r")
index = 0
for word in f:
    if index > 1:
        time.sleep(20)
    index += 1
    if word == ";sell\n":
        print(f"Mining...")
    elif word == ";up b\n":
        print(f"Upgrading backpack..")
    elif word == ";up p\n":
        print(f"Upgrading pickaxe..")
    elif word == ";profile\n":
        print(f"Showing Profile..")
    pyautogui.typewrite(word)
    pyautogui.press("enter")
