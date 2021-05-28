
import java.util.Scanner;
public class Input {
 public static void main(String[] args) {
  // getting java library class --> input 
   Scanner userInput = new Scanner(System.in);
   // adding space between main program and terminal
   System.out.println();
   System.out.println("===PROGRAM PENGHITUNG LUAS PERSEGI PANJANG===");
   // getting input and printing input commands
   System.out.println();
   System.out.print("Masukkan Username: ");
   String uname = userInput.next();
   System.out.print("Masukkan Password untuk melanjutkan : ");
   String passwd = userInput.next();
   String regUname = "admin1";
   String regPass = "admin"; //registered password
   // checking password
   if(passwd.equals(regPass) && uname.equals(regUname) ){
    System.out.println();
    System.out.println("===Selamat Datang " + uname + "===");
    System.out.println();
    System.out.print("Masukkan Panjang : ");
    int width = userInput.nextInt();
    System.out.print("Masukkan Lebar: ");
    int length = userInput.nextInt();
    // calculate and printing result
    int result = width * length; //multiplying user input
    System.out.println();
    System.out.println("Luas Persegi Panjang : " + result);
    System.out.println();
   } else { // printing error message
    System.out.println("Username atau Password yang anda masukkan salah");
   }
   userInput.close();
 }
}
