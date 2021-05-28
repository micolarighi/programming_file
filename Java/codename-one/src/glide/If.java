import java.util.Scanner;
public class If {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Masukkan Value: " );
    String input = userInput.next();
    switch (input) { 
      case "micola":
        System.out.println("halo micola");
        break;
      case "arighi":
        System.out.println("halo arigi");
        break;
      default:
        System.out.println("tidak terdaftar");
        break;
    }
    userInput.close();
  }
  
}
