package main

import "fmt"

func main() {
	var name string
	var age int
	fmt.Println("Enter Your Name & Age (Separated by Space)")
	fmt.Scanf("%s %d", &name, &age)
	fmt.Printf("Hello %s You Are %d Years Old", name, age)
}
