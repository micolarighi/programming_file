public class MOBA_HERO {
    String name;
    int health;
    int attack;
    int mana;
    String[] skills = new String[3];

    MOBA_HERO ( String name, int health, int attack, int mana, String skill1, String skill2, String skill3 ) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.mana = mana;
        this.skills[0] = skill1;
        this.skills[1] = skill2;
        this.skills[2] = skill3;
    }
}
