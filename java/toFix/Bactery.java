public class Bactery {
   public static void main(String[] args) {
       int popAwal = 15000;
       int t = 10;
       double popAkhir = 2;

        popAkhir = popAwal * Math.pow(popAwal/10 * (int)Math.E);
        System.out.println(popAkhir);
   } 
}
