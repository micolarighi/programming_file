package main

import "fmt"

func main() {
	for true {
		value := 10
		if value == 20 {
			break
		}
		value++
		fmt.Println(value)
	}
}
