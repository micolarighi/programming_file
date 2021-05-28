import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice {
  public static void main(String[] args) {
    int [] arrayData = {10, 20, 244, 4, 4};
    reverseArray(arrayData);
    System.out.println(binSearch());
  }

  // method untuk mengecek apakah angka yang diinput terdapat dalam array atau tidak
  private static int binSearch() {
    Scanner inputScanner = new Scanner(System.in);
    int input = inputScanner.nextInt();
    int [] dataList = {20, 20, 10, 2, 22, 24};
    // expected output --> 2, 10, 20, 22, 22, 24
    Arrays.sort(dataList);
    System.out.println(Arrays.toString(dataList));
    int searchedBinary = Arrays.binarySearch(dataList, input);
    if (searchedBinary > 0) {
      System.out.println("Object terdapat dalam Array");
    } else {
      System.out.println("Object tidak ada dalam array");
    }
    inputScanner.close();
    return  searchedBinary;
  }

  private static void reverseArray (int[] a) {
    Arrays.sort(a); //sorting array
    int LE = a.length; 
    int [] revArr = new int[LE];

    for (int i = 0; i < LE; i++) {
      revArr[i] = a[ (LE - 1) - i];
    }
    System.out.println(Arrays.toString(revArr));
  }
}
