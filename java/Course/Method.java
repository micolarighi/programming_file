public class Method {
  public static void main(String[] args) {
    System.out.println(calculate(20, "-", 10));
  }

  static int calculate(int value1, String operator, int value2) {
    int result;
    switch (operator) {
      case "+":
        result = value1 + value2;
        break;

      case "-":
        result = value1 - value2;
        break;

      default:
        result = 0;
        break;
    }
    return result;
  }

}
