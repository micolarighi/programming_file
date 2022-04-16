public class Waifu {
   String name;
   int age;
   String favoriteFoods;

   Waifu (String name, int age, String favoriteFoods) {
      this.name = name;
      this.age = age;
      this.favoriteFoods = favoriteFoods;
   }

   Waifu (String name, String favoriteFoods) {
      this.name = name;
      this.favoriteFoods = favoriteFoods;
   }

   public String toString () {
      return  name + "\n" + age + "\n" + favoriteFoods;
   }
}
