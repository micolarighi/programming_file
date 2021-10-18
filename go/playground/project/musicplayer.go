package main

import "fmt"

func main() {
	data_lagu := map[int][]string{0: {"blue jeans", "gangga", "04:12"}, 1: {"beside you", "keshi", "03:30"}}
	fmt.Println("==== Music Player 1.0 ====")
	fmt.Println("Created By Micola Arighi")
	fmt.Println()
	fmt.Println("1. Putar Lagu")
	fmt.Println("2. Buat Playlist")
	fmt.Println("3. Lihat Playlist")
	fmt.Println("4. Lihat Lagu Tersimpan")
	fmt.Println("5. Keluar")

	var cmd_main_menu int

	for {
		fmt.Print("Masukan Perintah [1, 2, 3] : ")
		fmt.Scan(&cmd_main_menu)
		if cmd_main_menu == 1 {
			putar_lagu(data_lagu)
			break
		} else if cmd_main_menu == 2 {
			buat_playlist()
			break
		} else if cmd_main_menu == 3 {
			lihat_playlist()
		} else if cmd_main_menu == 4 {
			lihat_lagu_tersimpan(data_lagu)
		} else if cmd_main_menu == 5 {
			break
		} else {
			fmt.Println("Perintah yang anda masukan invalid")
		}
	}
}

func putar_lagu(data_lagu map[int][]string) {
	var cur_i = 0
	var song_paused = false
	fmt.Println("\nSedang Memutar", data_lagu[cur_i][0], "-", data_lagu[cur_i][1], data_lagu[cur_i][2])

	var song_control string
	for {
		if song_paused {
			fmt.Print("Previous [pr] | Play [p] | Next [n] : ")
		} else if !song_paused {
			fmt.Print("Previous [pr] | Pause [p] | Next [n] : ")
		}
		fmt.Scan(&song_control)
		switch song_control {
		case "Next", "next", "n":
			cur_i++
		case "p":
			song_paused = !song_paused
		case "Previous", "previous", "pr":
			cur_i--

		}
		if song_paused {
			fmt.Println(data_lagu[cur_i][1], "paused")
		} else {
			fmt.Println("\nSedang Memutar", data_lagu[cur_i][0], "-", data_lagu[cur_i][1], data_lagu[cur_i][2])
		}
	}

}

func buat_playlist() {
	fmt.Println("Membuat Playlist")

}

func lihat_playlist() {
	fmt.Println()
}

func lihat_lagu_tersimpan(data_lagu map[int][]string) {
	for _, m := range data_lagu {
		fmt.Println(m)
	}
}
