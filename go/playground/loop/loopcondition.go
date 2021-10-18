package main

import "fmt"

func main() {
	password := []string{"argonaut", "argo", "admin", "arighi", "micola", "admin1"}
	var input_name string
	var input_paswd string
	var valid bool
	fmt.Print("Masukan nama : ")
	fmt.Scan(&input_name)
	fmt.Print("Masukan Password : ")
	fmt.Scan(&input_paswd)
	for _, paswd := range password {
		if input_paswd == paswd {
			valid = true
			break
		} else {
			valid = false
		}
	}
	validate(valid, input_name)
}

func validate(valid bool, username string) {
	if valid {
		fmt.Println("Login Berhasil, Selamat Datang", username)
	} else {
		fmt.Println("Password yang anda masukan salah")
	}
}
