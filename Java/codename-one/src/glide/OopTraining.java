class Hero {
  String name;
  int health;
  int attack;
  String element;

  Hero (String inName, int inHealth, int inAttack, String inElement) {
    this.name = inName;
    this.health = inHealth;
    this.attack = inAttack;
    this.element = inElement;
  }
  
  void displayInfo () {
    System.out.println("Name : " + this.name + "\nHealth : " + this.health + "\nAttack : " +  this.attack);
    System.out.println("\n");
  }

  void attack(Hero enemy) {
    if (this.element.equals("fire") && enemy.element.equals("water")){
      int atkTaken = this.attack - 5;
      enemy.health -= atkTaken;
      System.out.println("Not very effective");
      System.out.println("-" + atkTaken);
      System.out.println(enemy.name + "Current health : " + enemy.health);
  }
    if(this.element.equals("water") && enemy.element.equals("fire")) {
      enemy.health -= this.attack;
      System.out.println("Very Effective!!!");
      System.out.println("-" + this.attack);
      System.out.println(enemy.name + "Current health : " + enemy.health);
    }
    if (enemy.health <= 0) {
      System.out.println(enemy.name + " has been slain by " + this.name);
    }
  }

}

public class OopTraining {
  public static void main(String[] args) {
    Hero idLuna = new Hero("Luna", 100, 10, "fire");
    Hero idAzel = new Hero("Azel", 120, 10, "water" );
    Hero idLenka = new Hero("Lenka", 60, 20, "wind");
    idLuna.attack(idAzel);
  }
}
