public class PassingObject {
   public static void main(String[] args) {
      Anime anime1 = new Anime("The World God Only Knows", "Manglobe", 0);
      Anime anime2 = new Anime("Sword art online", "A-1 Pictures", 4);
      Rating rating1 = new Rating();
      Rating rating2 = new Rating();

      rating1.giveRating(10, anime1);
      rating1.giveRating(5, anime2);
      rating2.giveRating(9, anime1);
      rating1.addWatchList("High", anime1);

   }
}
