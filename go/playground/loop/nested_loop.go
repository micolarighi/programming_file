package main

import "fmt"

func main() {
	var kolom int
	var baris int
	var simbol string
	fmt.Scan(&baris)
	fmt.Scan(&kolom)
	fmt.Scan(&simbol)
	for i := 0; i < baris; i++ {
		fmt.Println()
		for j := 0; j < kolom; j++ {
			fmt.Print(simbol)
		}
	}
}
