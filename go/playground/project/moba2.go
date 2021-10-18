package main

import "fmt"

func main_game(hero_list [][]Hero) {
	fmt.Println("Loading..")
	fmt.Println("=== Pilih Hero ===")
	for i := 0; i < len(hero_list); i++ {
		fmt.Println(i+1, hero_list[i])
	}
	is_looping := true
	for is_looping {
		var selected_hero int
		fmt.Print("Masukan Nomor Hero yang ingin di pilih : ")
		fmt.Scan(&selected_hero)
		fmt.Println("Anda memilih hero : ", hero_list[selected_hero][selected_hero].name)
	}
}

func tampilkan_info(role string) {
	fmt.Println(role)
}

type Hero struct {
	name   string
	role   string
	health int
	atp    int
	mana   int
	skills []string
}

func main() {
	hero1 := Hero{"Argonaut", "Fighter", 100, 10, 5, []string{"moonlight", "shadow dancer", "eleminate"}}
	hero2 := Hero{"Lenka", "Assassin", 60, 16, 2, []string{"ambush", "bloods favorite", "shadow monarch"}}
	hero3 := Hero{"Luna", "Mage", 55, 20, 20, []string{"inner killer", "orbs of magi", "ice biome"}}
	hero_list := [][]Hero{{hero1}, {hero2}, {hero3}}
	fmt.Println(hero1.skills)
	fmt.Println(hero2.skills)
	for {
		fmt.Println("=== Selamat Datang di Trash Moba ===")
		fmt.Println("Apa yang ingin anda lakukan ? ")
		fmt.Println("\n 1. Main\n 2. Cek Hero\n 3. Keluar")
		var command string
		fmt.Println()
		fmt.Print("Masukan perintah [1, 2, 3] : ")
		fmt.Scan(&command)
		switch command {
		case "1":
			main_game(hero_list)
			break
		case "2":
			var input_hero_role int
			fmt.Print("Role hero apa yang ingin anda lihat infonya ? ")
			fmt.Print("[1. Fighter | 2. Assassin | 3. Mage  | 4. Tank | 5. Suppport] : ")
			fmt.Println("Masukkan Angka")
			fmt.Scan(&input_hero_role)
			switch input_hero_role {
			case 1:
			case 2:
			}
			break
		case "3":
			break

		}

	}
}
