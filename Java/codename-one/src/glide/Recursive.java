import java.util.Scanner;
public class Recursive {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int input = userInput.nextInt();
    rekursif(input);
    userInput.close();
  }
  
  private static void rekursif (int value) {
    System.out.println(value);
    if ( value == 0) {
      return;
    }
    value--;
    rekursif(value);
  }
}
