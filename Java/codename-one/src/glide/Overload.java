public class Overload {
  public static void main(String[] args) {
    printNumb(20);
    printNumb(10.4f);
    printNumb(10, 20.4f);
  }
  private static void printNumb (int numb ) {
    System.out.println(numb);
  } 
  private static void printNumb (int numb, float numbF) {
    System.out.print(numb + " ");
    System.out.print(numbF + "\n");
  } 
  private static void printNumb (float numb ) {
    System.out.println(numb);
  } 

}
