package main

import "fmt"

func main() {
	var command string
	for {
		fmt.Print("Masukkan Perintah : ")
		fmt.Scan(&command)
		if command == "y" {
			break
		}
	}
}
