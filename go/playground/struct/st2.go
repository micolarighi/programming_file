package main

import (
	"bufio"
	"fmt"
	"io/ioutil"
	"log"
	"os"
)

type Books struct {
	name   string
	pages  int
	writer string
}

func (book Books) readBooks() {
	fmt.Printf("Reading %v by %v\n", book.name, book.writer)
}

// Function to Check the error of a module action

func check(e error) {
	if e != nil {
		panic(e)
	}
}

func (book Books) updateProgress(prog int) {
	updated_progress := fmt.Sprintf("Your Progress of %v is updated to page %d", book.name, prog)
	fmt.Println(updated_progress)
	file, err := os.Create("progress.txt")
	if err != nil {
		log.Fatal(err)
	}
	defer file.Close()

	w := bufio.NewWriter(file)
	p := fmt.Sprintf("Your Last Progress of %v is on Page %d", book.name, prog)
	w.WriteString(p)
	check(err)
	w.Flush()
}

func (book Books) checkProgress() {
	r, err := ioutil.ReadFile("progress.txt")
	check(err)
	fmt.Println(string(r))
}

func main() {
	book1 := Books{"Cosmos", 500, "Carl Sagan"}
	fmt.Println("=== Welcome To A Simple Library Ver 0.1 ")
	fmt.Println("== Created By Micola Arighi ==")
	fmt.Println("\nThings You Can Do : ")
	fmt.Println("1. Update Book Progress")
	fmt.Println("2. Check Book Progress")
	fmt.Println("3. Exit Program\n")

	var command int
	fmt.Print("Enter Command : ")
	fmt.Scan(&command)
	var pageProg int
	switch command {
	case 1:
		fmt.Print("Enter the Page you've been read : ")
		fmt.Scan(&pageProg)
		book1.updateProgress(pageProg)
	case 2:
		book1.checkProgress()
	case 3:
		break
	}

}
