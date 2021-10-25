import java.util.Scanner;
public class SimpleCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the first value : ");
      double value1 = input.nextDouble();
      System.out.println("add, subtract, divide, multiply");
      System.out.print("Enter the operand : ");
      String operator = input.next().toLowerCase();
      System.out.print("Enter the second value : ");
      double value2 = input.nextDouble();

      switch (operator) {
         case "add" :
            System.out.println(addition(value1, value2));
            break;
         case "subtract" :
            System.out.println(subtract(value1, value2));
            break;
         case "divide" :
            System.out.println(divide(value1, value2));
            break;
         case "multiply" :
            System.out.println(multiply(value1, value2));
            break;
         default :
            System.out.println("Invalid operator");
      }

      input.close();
   }
   
   static double addition (double a, double b) {
      return a + b;
   }
   static double subtract (double a, double b) {
      return a - b ;
   }

   static double divide (double a, double b) {
      return a / b;
   }

   static double multiply (double a, double b) {
      return a * b;
   }
}
