package main

import (
	"fmt"
)

func main() {
	for x := 0; x < 100; x++ {
		if x != 0 && x%3 == 0 && x%7 == 0 {
			fmt.Println(x, "is dividible by 3 and 7")
			continue
		}
		fmt.Println(x, "is NOT divisible by 3 and 7")
	}
}
