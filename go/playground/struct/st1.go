package main

import "fmt"

type Hero struct {
	name   string
	health int
	atp    int
	mana   int
}

func (hero Hero) getName() {
	fmt.Println("Hero Name : ", hero.name)
}

func (hero Hero) attack(enemy Hero) {
	fmt.Println(hero.name, "attacking", enemy.name)
}

func main() {
	hero1 := Hero{"Lenka", 100, 10, 5}
	hero2 := Hero{"Lucian", 100, 12, 2}
	hero1.getName()
	hero1.attack(hero2)
	fmt.Println(hero1.name, hero1.health, hero1.atp, hero1.mana)
}
