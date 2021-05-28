import java.util.Scanner;
public class Ternary {
  public static void main(String[] args) {
  Scanner inputUser;
  int valueA, valueB, total;
  inputUser = new Scanner(System.in);
  System.out.print("Masukkan nilai awal: ");
  valueA = inputUser.nextInt();
  System.out.print("Masukkan nilai akhir: " );
  valueB = inputUser.nextInt();
  total = 0;
  while(valueA <= valueB) {
    total = total + valueA;
    if(valueA >= valueB) {
      System.out.println("Hasil akhirnya adalah: " + total );
    }
    valueA++;
  }
  inputUser.close();
  }
  
  
}


