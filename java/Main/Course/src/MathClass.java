import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        double x = -10.9;
        System.out.println(Math.floor(x));
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        System.out.print(Math.max(input1, input2));
    }
}
