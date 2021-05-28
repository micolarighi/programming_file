import java.util.Scanner;
public class Calculator {
  public static void main(String[] args) {
  // Choosing arithmatic operator
    Scanner inputCalculate = new Scanner(System.in);
    System.out.println("");
    System.out.print("Pilih Operator Aritmatika \n");
    System.out.println("Available Operator : + - * / \n");

    String inputOperator = inputCalculate.next();
    System.out.print("Masukkan Value 1 : ");
    int inputValueA = inputCalculate.nextInt();
    System.out.print("Masukkan Value 2 : ");
    int inputValueB = inputCalculate.nextInt();

    if(inputOperator.equals("+") || 
    inputOperator.equals("plus")){
      PlusOperator(inputValueA, inputValueB);
    } else if (inputOperator.equals("-")){
      MinusOperator(inputValueA, inputValueB);
    } else if(inputOperator.equals("*")){
      MultiplyOperator(inputValueA, inputValueB);
    } else if (inputOperator.equals("/")){
      DivideOperator(inputValueA, inputValueB);
    } else {
      System.out.println("Operator yang dimasukkan salah");
    }
    inputCalculate.close();
  }  
    // Plus 
    static void PlusOperator (int a, int b) {
      int result = a + b;
      System.out.println(result);
    };
    // Minus 
    static void MinusOperator (int a, int b) {
      int result = a - b;
      System.out.println(result);
    };
    // Divide 
    static void DivideOperator (int a, int b) {
      int result = a / b;
      System.out.println(result);
    };
    // Multiply 
    static void MultiplyOperator (int a, int b) {
      int result = a * b;
      System.out.println(result);
   };
 
}


