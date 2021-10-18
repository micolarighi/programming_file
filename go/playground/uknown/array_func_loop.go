package main

import "fmt"

func main() {
	addThis := []int{10, 50, 20, 62, 24, 74}
	total := addAllArrayElement(addThis)
	fmt.Println(total)
}

func addAllArrayElement(arrayOfNumber []int) int {
	var total int
	for _, num := range arrayOfNumber {
		total += num
	}
	return total
}
