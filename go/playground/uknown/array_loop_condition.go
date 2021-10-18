package main

import "fmt"

func main() {
	scores := []int{60, 70, 80, 90, 100, 20, 50, 60}
	var good_scores []int

	for _, s := range scores {
		if s >= 90 {
			good_scores = append(good_scores, s)
		}
	}
	fmt.Println(good_scores)
}
