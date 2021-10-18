package main

import "fmt"

func main() {
	// looping with string length time
	// fmt.Println("Hello")
	// for range "Hello" {
	// 	fmt.Println("Test")
	// }
	strDict := map[string]string{"Japan": "Tokyo", "China": "Beijing", "Canada": "Ottawa"}
	for key := range strDict {
		fmt.Println(key)
	}
	for _, value := range strDict {
		fmt.Println(value)
	}

}
