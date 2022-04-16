public class ArrayOfObject {
   public static void main(String[] args) {
      Waifu[] waifus = new Waifu[2]; 
      Waifu waifu1 = new Waifu("chitoge", 20, "idk");
      Waifu waifu2 = new Waifu("rem", "blood ig");

      waifus[0] = waifu1;
      waifus[1] = waifu2;
      
      System.out.println(waifus[1].name);

      // another way to do it

      Hero hero1 = new Hero("Lucian", 20, 100, 10);

      Hero[] heros = {hero1};
      
   }
}
