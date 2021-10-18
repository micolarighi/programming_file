package main

import "fmt"

func main() {
	valueA, valueB, valueC := someFunction(10, 20, 10)
	fmt.Println(valueA, valueB, valueC)
}

// creating a function that return multiple values

func someFunction(valA, valB, valC int) (int, int, int) {
	result1 := valA * valB
	result2 := valA * valC
	result3 := valB * valC
	return result1, result2, result3
}
