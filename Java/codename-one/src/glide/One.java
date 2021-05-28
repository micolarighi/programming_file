import java.util.Scanner;
public class One {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("====Ganjil atau Genap?====");
    System.out.print("Masukkan Angka : " );
    int inputA = userInput.nextInt();
    oddOrEven(inputA);
    userInput.close();
  }
  public static void oddOrEven(int a) {
    if(a % 2 == 0){ 
      System.out.println("Angka adalah genap");;
    }else {
      System.out.println("Angka yang dimasukkan adalah Ganjil");
    };
  }
}



