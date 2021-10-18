package main

import (
	"fmt"
	"log"
	"os"
	"time"

	"github.com/faiface/beep/mp3"
	"github.com/faiface/beep/speaker"
)

func player(song_index int) {
	songList := []string{}
	file, _ := os.Open("dummy_dir")
	defer file.Close()
	songs, err := file.Readdirnames(0)
	if err != nil {
		log.Fatal(err)
	}
	for _, song := range songs {
		songList = append(songList, song)
	}

	song_file, err := os.Open("dummy_dir/" + songList[song_index])
	if err != nil {
		log.Fatal(err)
	}
	streamer, format, _ := mp3.Decode(song_file)
	defer streamer.Close()

	speaker.Init(format.SampleRate, format.SampleRate.N(time.Second/10))
	speaker.Play(streamer)
	select {}
}

func main() {
	dataLagu := map[int][]string{0: {"blue jeans", "gangga", "04:12"}, 1: {"beside you", "keshi", "03:30"}}
	fmt.Println()
	fmt.Println("==== Music Player 1.0 ====")
	fmt.Println("Created By Micola Arighi")
	fmt.Println()
	fmt.Println("1. Putar Lagu")
	fmt.Println("2. Buat Playlist")
	fmt.Println("3. Lihat Playlist")
	fmt.Println("4. Lihat Lagu Tersimpan")
	fmt.Println("5. Keluar")

	var cmdMainMenu int

	for {
		fmt.Println()
		fmt.Print("Masukan Perintah [1, 2, 3] : ")
		fmt.Scan(&cmdMainMenu)
		if cmdMainMenu == 1 {
			putar_lagu(dataLagu)
			break
		} else if cmdMainMenu == 2 {
			buat_playlist(dataLagu)
			break
		} else if cmdMainMenu == 3 {
			lihat_playlist()
		} else if cmdMainMenu == 4 {
			lihat_lagu_tersimpan(dataLagu)
		} else if cmdMainMenu == 5 {
			break
		} else {
			fmt.Println("Perintah yang anda masukan invalid")
		}
	}
}

func putar_lagu(dataLagu map[int][]string) {
	for i, s := range dataLagu {
		fmt.Printf("%d   %s\n", i+1, s)
	}
	var commandPlay int
	fmt.Print("Masukkan Nomor Lagu untuk di putar : ")
	fmt.Scan(&commandPlay)
	player(commandPlay - 1)
}

func buat_playlist(dataLagu map[int][]string) {
	var in_namaPlaylist string
	var in_SongId int
	fmt.Print("Masukkan Nama Playlist : ")
	fmt.Scan(&in_namaPlaylist)
	fmt.Printf("Berhasil Membuat Playlist %v\n", in_namaPlaylist)
	fmt.Println("=== Lagu Yang Tersedia ===")
	for i, s := range dataLagu {
		fmt.Printf("%d   %s\n", i+1, s)
	}
	fmt.Print("Masukkan id lagu yang ingin ditambahkan : ")
	fmt.Scan(&in_SongId)
	fmt.Printf("Berhasil Menambahkan Lagu %s ke dalam Playlist %s\n", dataLagu[in_SongId-1][in_SongId-1], in_namaPlaylist)
}

func lihat_playlist() {
	fmt.Println()
}

func lihat_lagu_tersimpan(dataLagu map[int][]string) {
	for _, m := range dataLagu {
		fmt.Println(m)
	}
}
