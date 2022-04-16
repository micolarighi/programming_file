public class Rating {

   public void giveRating(double rating, Anime anime) {
      anime.personalRating = rating;
      System.out.println(anime.title + " is rated " + rating);
   }

   public void addWatchList (String priority, Anime anime) {
      System.out.println("You've added " + anime.title + "to your watch list with " + priority + " priority");
   }

}
