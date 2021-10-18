package main

import "fmt"

func main() {
	array := [5]string{"Micola", "Test", "Denied", "Test", "Denied"}
	for i := 0; i < len(array); i++ {
		if array[i] == "Denied" {
			fmt.Println("Skipped")
			continue
		}
		fmt.Println(array[i])
	}
}
