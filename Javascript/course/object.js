const Hero = [
    {
        name: "Lenka",
        health: 100,
        attack: 10,
        mana: 0,
        getInfo: function () {
            console.log(
                "name:",
                this.name,
                "| health :",
                this.health,
                "| attack :",
                this.attack,
                "| mana :",
                this.mana
            );
        },
        launchAttack: function (enemy) {
            enemy.health -= this.attack;
            console.log(this.name, "attacking", enemy.name);
            console.log(enemy.name, "receive", this.attack, "damage");
        },
    },
    {
        name: "Lucian",
        health: 100,
        attack: 12,
        mana: 5,
        getInfo: function () {
            console.log(
                "name:",
                this.name,
                "| health :",
                this.health,
                "| attack :",
                this.attack,
                "| mana :",
                this.mana
            );
        },
        launchAttack: function (enemy) {
            enemy.health -= this.attack;
            console.log(this.name, "attacking", enemy.name);
            console.log(enemy.name, "receive", this.attack, "damage");
        },
    },
];

Hero[0].launchAttack(Hero[1]);
Hero[1].getInfo();
