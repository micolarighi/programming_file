import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> passwordsList = new ArrayList<>();
        passwordsList.add("argo");
        passwordsList.add("argonaut");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username anda : ");
        String username = input.next();
        System.out.print("Masukkan password anda : ");
        String password = input.next();
        boolean granted = false;

        for (int i = 0; i < passwordsList.size(); i++) {
            if (password.equals(passwordsList.get(i))) {
                granted = true;
                break;
            } else {
                granted = false;
            }
        }

        if (granted) {
            System.out.println("Login Sucessful, Welcome " + username);
        } else {
            System.out.println("Password you've entered was incorrect");
        }
        input.close();
    }
}
