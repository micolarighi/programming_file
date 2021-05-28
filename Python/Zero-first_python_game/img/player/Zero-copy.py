import pygame as game
game.init()
SCREEN_WIDTH = 800
SCREEN_HEIGHT = int(SCREEN_WIDTH * 0.8) 
screen = game.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
game.display.set_caption("Zero")
clock = game.time.Clock()
FPS = 60
BG = (39, 140, 253)

moving_right = False
moving_left = False

def draw_bg () :
  screen.fill(BG)

class Soldier (game.sprite.Sprite) :
  def __init__(self, x, y, scale, speed):
    game.sprite.Sprite.__init__(self)
    self.x = x
    self.y = y
    self.scale = scale
    self.speed = speed
    
    img = game.image.load('img/player/Idle/0.png')
    self.image = game.transform.scale(img, (int(img.get_width() * scale) , int(img.get_height() * scale )))
    self.rect = self.image.get_rect()
    self.rect.center = (x, y)
  
  def draw (self) :
    screen.blit(self.image, self.rect)

  def move (self, moving_right, moving_left) :
    dx = 0
    dy = 0
    if moving_right :
      dx = -self.speed
    if moving_left :
      dx = self.speed
    self.rect.x += dx
    self.rect.y += dy

player = Soldier(200, 200, 3, 5)

game_run = True
while game_run:
  clock.tick(FPS)
  player.move(moving_right, moving_left)
  draw_bg()
  player.draw()
  for event in game.event.get():
    if event.type == game.QUIT:
      game_run = False
    if event.type == game.KEYDOWN:
      if event.key == game.K_a:
       moving_right = True
      if event.key == game.K_d :
        moving_left = True
      if event.key == game.K_ESCAPE :
        game_run = False   

    if event.type == game.KEYUP:
      if event.key == game.K_a:
       moving_right = False
      if event.key == game.K_d :
        moving_left = False

  game.display.update()

game.quit()