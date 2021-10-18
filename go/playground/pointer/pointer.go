package main

import "fmt"

func main() {
	name := "Micola"
	pointerOfName := &name

	fmt.Println(pointerOfName)
	fmt.Println(*pointerOfName)
}
