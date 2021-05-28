import pygame as engine
engine.init()

sc_width = 800
sc_height = int(sc_width * 0.8)
screen = engine.display.set_mode((sc_width, sc_height))
engine.display.set_caption('Zero')

mo_right = False
mo_left = False
bg_color = (0, 0, 0)
clock = engine.time.Clock()
fps = 60
def draw_bg() :
  screen.fill(bg_color)

class entities(engine.sprite.Sprite) :
  def __init__(self, char_type, x, y, scale, speed):
    engine.sprite.Sprite.__init__(self)
    self.char_type = char_type
    self.x = x
    self.y = y
    self.scale = scale
    self.speed = speed
    self.animation_list = []
    self.update_time = engine.time.get_ticks()
    self.action = 0
    self.fr_index = 0
    self.flip = False
    self.direction = 1
    temp = []
    for i in range(5):
      img = engine.image.load(f'img/{self.char_type}/Idle/{i}.png')
      img = engine.transform.scale(img, (int(img.get_width() * scale), int(img.get_height() * scale)))
      temp.append(img)
    self.animation_list.append(temp)
    temp = []
    for i in range(6):
      img = engine.image.load(f'img/{self.char_type}/Run/{i}.png')
      img = engine.transform.scale(img, (int(img.get_width() * scale), int(img.get_height() * scale)))
      temp.append(img)
    self.animation_list.append(temp)
    self.image = animation_list[self.action][self.fr_index]
    self.rect = self.image.get_rect()
    self.rect.center = (x, y)

  def move (self) :
    dx = 0
    dy = 0
    if mo_right :
      dx = -self.speed
      self.flip = True
      self.direction = -1
    if mo_left :
      dx = self.speed
      self.flip = False
      self.direction = 1
    self.rect.x += dx

  def draw (self) :
    screen.blit(engine.transform.flip(self.image, self.flip, False), self.rect)

  def update_animation (self) :
    animation_cooldown = 100
    self.image = self.animation_list[self.action][self.fr_index]
    if engine.time.get_ticks() - self.update_time > animation_cooldown :
      self.update_time = engine.time.get_ticks()
      self.fr_index += 1
    if self.fr_index >= len(self.animation_list[self.action]):
      self.fr_index = 0

  def update_action (self, new_action) :
    if new_action != self.action :
      self.action = new_action
      self.fr_index = 0
      self.update_time = engine.time.get_ticks()

engine_isRunning = True
player = entities('player', 200, 200, 3, 5)
while engine_isRunning :
  clock.tick(fps)
  draw_bg()
  player.move()
  player.draw()
  if mo_left or mo_right :
    player.update_action(1)
  else :
    player.update_action(0)
  for event in engine.event.get() :
    if event.type == engine.QUIT :
      engine_isRunning = False
    if event.type == engine.KEYDOWN :
      if event.key == engine.K_a :
        mo_right = True
      if event.key == engine.K_d :
        mo_left = True
    if event.type == engine.KEYUP :
      if event.key == engine.K_a :
        mo_right = False
      if event.key == engine.K_d :
        mo_left = False
  engine.display.update()

engine.quit()