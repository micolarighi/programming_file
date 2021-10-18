package main

import "fmt"

func main() {
	value := 20

	switch value {
	case 1, 5, 10, 20:
		fmt.Println("Kelipatan 5")
	case 2, 4, 6, 8:
		fmt.Println("Kelipatan 2")
	}

}
