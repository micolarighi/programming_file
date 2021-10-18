package main

import "fmt"

func main() {
	fmt.Println(add(10, 20))

}

func add(a, b int) (valueA int, valueB int, result int) {
	valueA = a
	valueB = b
	result = a + b

	return
}
