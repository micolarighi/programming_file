import java.util.Scanner;
public class ForLoop {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    int fn, fn_1, fn_2, n;
    System.out.print("Mengambil nilai fibonacci ke - : ");
    n = inputUser.nextInt();
    fn_2 = 0;
    fn_1 = 1;
    fn = 1;
    for (int i = 1; i <= n; i++){
      System.out.println("Deret Fibonacci ke- " + i + " adalah " + fn);
      fn = fn_1 + fn_2; // fn = 1 //fn = 2 // fn = 3 // fn = 5 // fn = 8 // fn = 12
      fn_2 = fn_1; // fn 2 = 1 // fn 2 = 1 // fn 2 = 2 // fn = 3 // fn = 5
      fn_1 = fn; // fn 1 = 1 // fn 1 = 2 // fn 1 = 3 // fn 1 = 5 // fn = 8
    };
    inputUser.close();
  } 


}
