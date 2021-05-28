run = True
# creating music dictionary
musics = {}
control_bar = False
menu = True
playing = False
# creating program loops
while run :
  if menu :
    print(f'\nWelcome Micola\n')
    print(f'\n1. Play Music\n2. Create playlist\n3. Quit\n')
    in_command = int(input('what you gonna do? : '))
  if control_bar :
    in_control = input(f'Play | Pause | Next | Previous | Menu')
    if in_control == 'Play' or in_control == 'play' and not playing :
      print('song continued')
    elif in_control == 'Pause' or in_control == 'pause' and playing :
      print('song paused')
  else : 
    pass
  if in_command == 1 :
    if len(musics) == 0 :
      print(f'\nyou have no playlist available\n')
    elif len(musics) >= 1 :
      for count, i in enumerate(musics):
        print('\nyour playlist :\n')
        print(f'{count + 1}. {musics[i]["playlist"]}')
      in_pick_pl = int(input('pick the playlist you wanna play the music from : '))
      if in_pick_pl == 1 :
        print(f'now playing : {musics[in_pick_pl - 1]["title"]} by {musics[in_pick_pl - 1]["artist"]} on {musics[in_pick_pl - 1]["playlist"]}')
        control_bar = True
        menu = False
        playing = True
  elif in_command == 2 :
    in_pl_name = input('Input the playlist name : ')
    in_song_name = input('Input the name of the song you wanna add : ')
    in_artist_name = input('Input the artist name : ')
    #adding a dictionaries values based on the input
    musics.update({0 : {'playlist': in_pl_name,'title': in_song_name, 'artist' : in_artist_name }})
    print(f'{in_song_name} by {in_artist_name} has been added to {in_pl_name}')
  elif in_command == 3 :
    run = False
  else :
    print('command invalid')