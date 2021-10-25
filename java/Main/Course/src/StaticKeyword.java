public class StaticKeyword {
   public static void main(String[] args) {
      Hero hero1 = new Hero("Lucian", 200, 100, 10);
      Hero hero2 = new Hero("Aro", 200, 100, 10);
      Hero hero3 = new Hero("Zabuza", 400, 20);

      System.out.println(Hero.numOfHero);
   }
}
