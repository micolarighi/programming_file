import java.util.Scanner;

public class Index {
    
    public static void addition(int a, int b) {
        System.out.println(a + b); 
    };
   public static void main(String[] args) {
    //    System.out.print("Please Enter Your Name : ");
    //    Scanner input = new Scanner(System.in);
    //    String name = input.next(); 
    //    System.out.print("Enter your password : ");
    //    String password = input.next();

    
    //    if (password.equals("admin") ) {
    //        System.out.println("Hello, " + name);
    //    } else {
    //        System.out.println("Password yang dimasukkan salah");
    //    }

        System.out.println("Masukkan angka pertama :");
        Scanner input = new Scanner(System.in);
        int valueA = input.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int valueB = input.nextInt();
        addition(valueA, valueB);

    }

}