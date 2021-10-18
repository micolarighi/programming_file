package main

import "fmt"

func cetak (param string) {
	fmt.Println(param)
}

func penjumlahanArray () {
	data := []int{1, 4, 5, 1, 5, 6, 7, 8, 8, 10}
	var result int
	for i := 0; i < len(data); i++ {
		result += data[i]
		fmt.Println(result)
	}
}
 
func goMapsDeclaration () {
	// membuat map kosong
	data:= make(map[string] int)
	fmt.Println(data)
}

func goMaps () {
	var data = map[string]int{"micola": 18, "ashraf": 18, "dino": 19}
	fmt.Println(data["micola"])
}

func main () {
	goMaps()
	fmt.Println("Hello World")
}

