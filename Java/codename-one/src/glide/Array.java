import java.util.Arrays;
public class Array {
  public static void main(String[] args) {
    // array bisa di buat duplikasinya / pass reference
    int [] arrayData = {19, 14, 20};
    int [] arrayData2 = {29, 14, 4};
    print(arrayMerging(arrayData, arrayData2));
    float [] arrayFloat = new float[4];
    String [] arrayString = {"Micola", "Arighi", "Dwitya"}; 
    arrayFloat[2] = 12.2f;
    arrayData[2] = 100;
    int [] voidArray = new int[10];
    int [] mainArray = {1, 2, 3, 4, 5, 3, 6, 47};
    int binarySea = Arrays.binarySearch(mainArray, 47);
    System.out.println(binarySea);
    String [] duplicatedArray = Arrays.copyOf(arrayString, 3);
    String [] duplicatedRange = Arrays.copyOfRange(arrayString, 0, 1);
    Arrays.fill(voidArray, 1);
    System.out.println("Komparasi");
    System.out.println(Arrays.compare(arrayData, arrayData2));
    System.out.println("Perbedaan");
    System.out.println(Arrays.mismatch(arrayData, arrayData2));
    System.out.println("Reverse Test");
    reverse2();
    print(voidArray);
    print(duplicatedArray);
    print(duplicatedRange);
    reverseArray();
    reverseArray2();
    arrayAddition();
    System.out.println("Tanda");
    print(reverse3());
    defaultValTest(10, 20);

    // pengecekan apakah kedua array sama/engga
    if(Arrays.equals(duplicatedArray, arrayString)){
      System.out.println("Array ini sama");
    } else {
      System.out.println("Array ini beda");
    }
    for (float floatNumb : arrayFloat) {
      System.out.println(floatNumb);
    }
  }

  // tugas me reverse array yang sudah di sortir
  private static void reverseArray () {
    int [] array = {1, 2, 4, 5, 63, 64 ,6, 5};
     Arrays.sort(array);
     // setelah di sorting --> 1, 2, 3, 4, 5, 6, 63, 64
     print(array);
     int[] newArray = new int[array.length];
     for (int i = 0; i < array.length; i++) {
       newArray[i] = array[array.length - (i + 1 ) ];
      //  array index ke 1 = array[ 8 - 1 --> 7 ] => array index ke 1 
      // array index ke 2 = array[ 8 -2 --> 6 ] .dst
     }
     print(newArray);
  }

  //latihan reverse array ke-2
  private static void reverseArray2 () {
    int [] dumpArray1 = {1, 23, 24, 55, 3, 10, 2};
    Arrays.sort(dumpArray1);
    print(dumpArray1);
    int [] revDumpArray = new int[dumpArray1.length];
    for (int i = 0; i < dumpArray1.length; i++) {
      revDumpArray[i] = dumpArray1[ dumpArray1.length - ( i + 1) ];
    }
    print(Arrays.copyOf(revDumpArray, revDumpArray.length));
    print(revDumpArray);
  }

  private static int[] arrayMerging (int [] array1, int[] array2) {
    int [] result2 = new int[array1.length + array2.length];
    for (int i = 0; i < array1.length; i++) {
      result2[i] = array1[i]; 
    }
    for (int i = 0; i < array2.length; i++ ){
      result2[i + array1.length] = array2[i];
    }
    return result2;
  }

  private static void arrayAddition () {
    int [] numb1 = {1, 4, 5, 6};
    int [] numb2 = {2, 35, 3, 5};
    // expc result {3, 39, 8, 11 }
    int [] result = new int[numb1.length];
    for (int i = 0; i < numb1.length; i++ ){
      result[i] = numb1[i] + numb2[i];
    }
    System.out.print("Hasil penjumlahan dua array = ");
    print(result);
  }

  private static void reverse2 () {
    int [] angka = {1, 24, 53, 6 ,6};
    int LE = angka.length;
    int [] revArray = new int[LE]; 
    for (int i = 0; i < LE; i ++ ) {
      revArray[i] = angka[(angka.length - 1) -  i];
    }
    print(revArray);
  }

  private static int [] reverse3() {
    int [] arrayA = {28, 30, 30, 20};
    int LE = arrayA.length;
    int [] methodResult = new int [LE];
    for (int i = 0; i < LE; i++){
      methodResult [i]  = arrayA[(LE - 1) - i]; 
    }
    return methodResult;
  }

  private static void defaultValTest( int a, int b) {
    if( a <= b) {
      System.out.println(a + " lebih kecil dari " + b);
    } else {
      System.out.println( a + " lebih besar atau sama dengan " + b );
    }
  }

  private static void print (String[] arrayData) {
    System.out.println(Arrays.toString(arrayData));
  }
  private static void print (int[] arrayData) {
    System.out.println(Arrays.toString(arrayData));
  }
}

