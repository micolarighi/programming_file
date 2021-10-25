public class Hero {
   String name;
   int health;
   int attack;
   double mana;

   static int numOfHero;

   Hero (String name, int health, int attack, double mana) {
      this.name = name;
      this.health = health;
      this.attack = attack;
      this.mana = mana;
      
      numOfHero++;
   }

   Hero (String name, int health, int attack) {
      this.name = name;
      this.health = health;
      this.attack = attack;

      numOfHero++;
   }

   void getName () {
      System.out.println("Hero name : " + this.name);
   }

   void getHealth () {
      System.out.println("Hero remaining health : " + this.health);
   }
}
