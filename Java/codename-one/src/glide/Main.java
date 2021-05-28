public class Main {
  public static void main(String[] args) {
    //variable
    String string1 = "Micola ";
    int integer1 = 20;
    integer1 = 22;
    System.out.println(string1 + integer1);

    // arithmatic operator
    int valueA = 20;
    int valueB = 12;
    System.out.println("hasil penjumlahnnya adalah " 
    + (valueA + valueB));
    
    //data type convertion
    float divide = (float) valueA / valueB;
    double doubleUpdate = divide;
    System.out.println(doubleUpdate);
    
    // unary operator
    int decValueA = 10;
    decValueA--; //expected output 9
    int incValueA = 10;
    incValueA++; //expected output
    System.out.println(decValueA + incValueA);
    boolean unaryBoolean = true;
    System.out.println(!unaryBoolean);

    // assignment operator
    int valueX = 10;
    valueX += 20;
    int valueY = 10;
    valueY -= 9;
    System.out.println(valueX);
    System.out.println(valueY);

    //comparation operator
    int val1 = 6;
    int val2 = 10;
    System.out.println(val1 == val2);
    System.out.println(val1 != val2);
    System.out.println(val1 > val2);
    System.out.println(val1 <= val2);

    // logical operator
      // #or (||)
      boolean booA, booB, or, and;
      booA = true;
      booB = false;
      or = (booA || booB);
      System.out.println(or);
      // #and (&&)
      and = (booA && booB);
      System.out.println(and);
      // #xor (^)
      System.out.println(booA ^ booB);

    // bitwise operator
      // #shift left (<<)
      byte a = 3;
      byte y = 0;
      byte b;
      byte c;
      String a_bits, b_bits, c_bits;
      b = (byte) (a<<1);
      System.out.println(b);
      // #shift right (>>)
      a = 12;
      b = (byte) (a>>1);
      System.out.println(b);
      // #bitwise or (|)
      b = (byte) (a | b);
      System.out.println(b);
      // #bitwise and (&)
      a = 6;
      b = 12;
      c = (byte) (a & b);
      a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
      b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
      c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
      System.out.println(a_bits);
      System.out.println(b_bits);
      System.out.println("=======OR");
      System.out.println(c_bits  + "=");
      System.out.println(c);
      System.out.println(y);
  }
}

