# imporing the random module
import random
rand = random.randint(0, 2)

guardians_list = ["Wolf", "Eagle", "Owl"]
in_name = input('Input your name : ')
print(f'{in_name}, your guardians are {guardians_list[rand]}')