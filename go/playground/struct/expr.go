package main

import "fmt"

type Hero struct {
	name   string
	health int
	role   Role
}

type Role struct {
	role        string
	buff_attack int
}

func main() {
	fighter := Role{"fighter", 20}
	hero1 := Hero{"Lenka", 100, fighter}
	fmt.Println(hero1.name, hero1.role)
}
