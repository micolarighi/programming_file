package main

import "fmt"

func main() {
	himpunan_vektor := [3][3]int{{10, 20, 20}, {1, 0, 2}, {20, 10, 10}}
	// var value int
	// fmt.Scan(&value)
	for _, vektor := range himpunan_vektor {
		fmt.Println(vektor)
		// if vektor == 0 {
		// 	fmt.Println("Bergantung Linier")
		// 	break
		// } else {
		// 	fmt.Println("Bebas Linier")
		// 	break
		// }
	}
}
