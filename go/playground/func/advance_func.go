package main

import "fmt"

func print(param string) {
	fmt.Println(param)
}

// function sebagai parameter untuk function lain
func masakAir(waktu int) int {
	return waktu
}
func masukanMie(masakAir func(int) int) int {
	return masakAir(10)
}

// function yang mengembalikan function
func callOtherFunction(x int) func() {
	return func() {
		fmt.Println(x)
	}
}

func main() {
	// function bisa di assign ke satu parameter dan kemudian bisa dipanggil
	// dengan cara :
	pr := print
	pr("hello")

	// function yang akan langsung jalan ketika di buat
	run := func(x int) int {
		return x
	}(10)
	fmt.Println(run)
	// Memanggil function yang dijadikan sebagai argumen
	fmt.Println("Memasak mie dalam waktu", masukanMie(masakAir), "Menit")

	// Memanggil function yang mengembalikan function lain
	callOtherFunction(10)()

}
