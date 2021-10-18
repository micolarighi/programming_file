package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	input := bufio.NewScanner(os.Stdin)
	var (
		kode   int
		ticket int
	)
	fmt.Println()
	fmt.Println("Masukkan nama anda : ")
	input.Scan()
	nama := input.Text()

	fmt.Println("Masukkan kode film : ")
	fmt.Scan(&kode)
	fmt.Println("Masukkan email anda : ")
	input.Scan()
	email := input.Text()

	fmt.Println("Masukkan jumlah pembelian : ")
	fmt.Scan(&ticket)
	fmt.Println()
	fmt.Println(nama, email, kode, ticket)
}
