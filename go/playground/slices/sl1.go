package main

import "fmt"

func main() {
	data := []int{1, 2, 3}
	dataArray := []int{2, 4, 6, 8, 10}
	fmt.Println(data[1])
	fmt.Println(len(data))

	slice := dataArray[1:3]
	fmt.Println(len(slice))
	fmt.Println(cap(slice))
	fmt.Println(slice)
}
