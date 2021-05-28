import java.util.Scanner;
public class FirstProgram {
  public static void main(String[] args) {
    int widthInput, heightInput;
    while (true) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("=== Program Penghitugan dan Visualisasi Bidang 2D ===");
    System.out.println("");
    System.out.print("Masukkan Panjang : ");
    widthInput = userInput.nextInt();
    System.out.print("Masukkan Lebar : ");
    heightInput = userInput.nextInt();
    visualize(widthInput, heightInput);
    System.out.println("Luas = " + area(widthInput, heightInput));
    System.out.println("Keliling = " + circumference(widthInput, heightInput));
    System.out.println("");
    System.out.print("Apakah anda ingin keluar dari program? y/n : ");
    String exitInput = userInput.next();
    if (exitInput.equals("y")) {
      break;
    }  else if (exitInput.equals("n")){
      continue;
    }else {
      System.out.println("Jawaban tidak valid");
    }
    userInput.close();
    }
  }
  private static int area (int width, int height) {
    int areaResult = width * height;
    return areaResult; 
  }
  private static int circumference(int width, int height){
    int circumResult = ((width + height) * 2);
    return circumResult;
  }
  private static void visualize (int width, int height) {
    System.out.println("");
    System.out.println("Visualisasi ");
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
}
