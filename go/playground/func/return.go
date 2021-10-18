package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func Addition(a float32, b float32) float32 {
	return a + b
}

func Subtraction(a float64, b float64) float64 {
	return a - b
}

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	fmt.Print("Masukkan nilai A : ")
	scanner.Scan()
	valueA, _ := strconv.ParseFloat(scanner.Text(), 64)
	fmt.Print("Masukan Operator Matematika : ")
	scanner.Scan()
	operator := scanner.Text()
	fmt.Print("Masukkan nilai B : ")
	scanner.Scan()
	fmt.Print("Hasil : ")
	valueB, _ := strconv.ParseFloat(scanner.Text(), 64)

	switch operator {
	case "+":
		fmt.Println(Addition(float32(valueA), float32(valueB)))
	case "-":
		fmt.Println(Subtraction(valueA, valueB))
	}
}
