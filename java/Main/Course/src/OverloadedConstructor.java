public class OverloadedConstructor {
   public static void main(String[] args) {
      Waifu waifu = new Waifu("Haqua", 3000, "yakisoba");      
      Waifu waifu2 = new Waifu("Ami", "uknown");
      
      Hero hero1 = new Hero("Lucian", 200, 100, 10);
      Hero hero2 = new Hero("Luna", 100, 250, 5);
      Hero hero3 = new Hero("Argo", 200, 100, 10);

      // Hero without mana -> using overloaded constructor advantages
      Hero hero4 = new Hero("Nemesis", 100, 50);

      System.out.println(waifu.name);
      System.out.println(waifu.age);
      System.out.println(waifu2.name);
      System.out.println(waifu2.favoriteFoods);
      
      hero1.getName();
      hero2.getHealth();

      
   }
}
