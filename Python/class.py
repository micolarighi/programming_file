import random
# creating class
class Hero () :
  def __init__(self, name, health, atk): # class constructor
    self.name = name
    self.health = health
    self.atk = atk
  # hero attacking mechanics & printing info
  def attack (self, enemy) :
    enemy.health -= self.atk
    print('\n======== UPDATES ========\n')
    print(self.name, "attacking", enemy.name)
    print(f'{enemy.name} health - {self.atk}')
    print(f'{enemy.name} current health : {enemy.health}\n')
    if enemy.health <= 0 :
      print(f'{enemy.name} has been slain by {self.name}\n')
  # showing hero info
  def showInfo (self) :
    print('\n =*10 HERO INFORMATION =*10\n')
    print('Name:', self.name)
    print('Health :', self.health)
    print('Attack :', self.atk)
  # getting hero name
  def getName (self) :
    print(self.name)
  # getting hero health
  def getHealth (self) :
    print(self.health)
  # getting hero attack
  def getAtk(self) :
    print(self.atk)
  # random power up mechanics
  def powerUp (self) :      
    random_pow = random.randint(1, 4)
    if random_pow == 1 :
      self.atk += 20
      print(self.name, "attack has been increased by 20")
    elif random_pow == 2 :
      self.health += 40
      print(self.name, "health has been increased by 40")
    elif random_pow == 3 :
      self.atk += 10
      print(self.name, "attack has been increased by 10")
    elif random_pow == 4 :
      self.health += 20
      print(self.name, "healh has been increased by 20")

# creating class objects
luna = Hero('Luna', 100, 20)
azel = Hero('Azel', 120, 15)
lucian = Hero('Lucian', 200, 60)

# making program loops
run = True
while run :
  # getting user input
  attack_input_a = int(input('\nMasukkan id hero yang akan menyerang : '))
  attack_input_b = int(input('Masukkan id hero yang akan di serang : '))
  # defining which hero should attack and should be attacked depends on user input
  if attack_input_a == 1 and attack_input_b == 2 :
    luna.attack(azel)
  elif attack_input_a == 1 and attack_input_b == 3 :
    luna.attack(lucian)
  elif attack_input_a == 2 and attack_input_b == 1 :
    azel.attack(luna)
  elif attack_input_a == 2 and attack_input_b == 3 :
    azel.attack(lucian)
  elif attack_input_a == 3 and attack_input_b == 1 :
    lucian.attack(luna)
  elif attack_input_a == 3 and attack_input_b == 2 :
    lucian.attack(azel)
  else :
    print('id yang dimasukkan invalid')
    print('jawaban invalid')
  print(f'Perintah tersedia : \n 1. Show Hero Info\n 2. Show Hero Name\n 3. Show Hero Health\n 4. Show Hero Attack\n 5. Power Up\n 6. Quit Game\n')
  command = int(input("Jalankan Perintah No : "))
  if command == 1 :
    choose_hero_info = int(input("Masukkan id hero yang akan ditampilkan infonya : "))
    if choose_hero_info == 1 :
      luna.showInfo()
    elif choose_hero_info == 2:
      azel.showInfo()
    elif choose_hero_info == 3:
      lucian.showInfo()
    else :
      print('perintah invalid')
  elif command == 2 :
    choose_get_hero_name = int(input('Masukkan id hero yang akan ditampilkan namanya : '))
    if choose_get_hero_name == 1 :
      luna.getName()
    elif choose_get_hero_name == 2 :
      azel.getName()
    elif choose_get_hero_name == 3 :
      lucian.getName()
    else :
      print('perintah invalid')
  elif command == 3 :
    choose_get_hero_health = int(input('Masukkan id hero yang akan ditampilkan namanya : '))
    if choose_get_hero_health== 1 :
      luna.getHealth()
    elif choose_get_hero_health== 2 :
      azel.getHealth()
    elif choose_get_hero_health== 3 :
      lucian.getHealth()
    else :
      print('perintah invalid')
  elif command == 4 :
    choose_get_hero_attack = int(input('Masukkan id hero yang akan ditampilkan namanya : '))
    if choose_get_hero_attack == 1 :
      luna.getHealth()
    elif choose_get_hero_attack == 2 :
      azel.getHealth()
    elif choose_get_hero_attack == 3 :
      lucian.getHealth()
    else :
      print('perintah invalid')
  elif command == 5 :
    choose_hero_pow = int(input('Masukkan id hero yang akan di power up : '))
    if choose_hero_pow == 1 :
      luna.powerUp()
    elif choose_hero_pow == 2 :
      azel.powerUp()
    elif choose_hero_pow == 3 :
      lucian.powerUp()
    else :
      print('perintah invalid')
  elif command == 6 :
    run = False
