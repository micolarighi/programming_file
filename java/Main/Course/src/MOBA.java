import java.util.Scanner;
import java.util.ArrayList;

public class MOBA {
    static void PlayGame() {
        MOBA_HERO luna = new MOBA_HERO("Luna", 100, 10, 10, "freeze", "north star", "meteor polar");
        MOBA_HERO lucian = new MOBA_HERO("Lucian", 110, 15, 9, "assassinate", "shuriken", "shadow monarch");
        MOBA_HERO herold = new MOBA_HERO("Herold", 200, 7, 12, "warm up", "barrier", "earthdoom");
        MOBA_HERO lenka = new MOBA_HERO("Lenka", 140, 11, 14, "justice", "untouchable", "fallen sword");
        MOBA_HERO lucy = new MOBA_HERO("Lucy", 100, 6, 12, "the rabbits", "light of solar", "blessing");

        MOBA_HERO[] HEROLIST = { luna, lucian, herold, lenka, lucy };

        Scanner input = new Scanner(System.in);
        System.out.println("Loading..");

        System.out.println("===== Pick your HERO =====");

        System.out.println("1. Luna - MAGE");
        System.out.println("2. Lucian - ASSASSIN");
        System.out.println("3. Herold - TANK");
        System.out.println("4. Lenka - FIGHTER");
        System.out.println("5. Lucy - SUPPORT");
        boolean promptCommand = false;
        int selectedHero = 0;
        String selectedHeroName = HEROLIST[selectedHero].name;

        do {
            System.out.print("Enter the HERO number [1, 2, 3 ,4 ,5] : ");
            int command = input.nextInt();
            switch (command) {
                case 1:
                    selectedHero = 1;
                    promptCommand = false;
                    break;
                case 2:
                    selectedHero = 2;
                    promptCommand = false;
                    break;
                case 3:
                    selectedHero = 3;
                    promptCommand = false;
                    break;
                case 4:
                    selectedHero = 4;
                    promptCommand = false;
                    break;
                case 5:
                    selectedHero = 5;
                    promptCommand = false;
                    break;
                default:
                    System.out.println("Invalid Numbers");
                    promptCommand = true;
            }
            System.out.println("You're selected HERO is " + selectedHeroName);

            System.out.print("CONFIRM ?? [y/n]");
            String inputConfirm = input.next().toLowerCase();

            if (inputConfirm.equals("y")) {
                promptCommand = false;
            } else {
                promptCommand = true;
            }

        } while (promptCommand);

        System.out.println("Loading..");

    }

    static void ShowAvailableHero() {
        System.out.println("Showing the available HERO");
    }

    public static void main(String[] args) {
        System.out.println("====== WELCOME TO JAVA MOBA ======");
        Scanner inputLogin = new Scanner(System.in);
        Scanner inputMainMenu = new Scanner(System.in);

        // Login
        int loginAttempt = 0;
        int loginAttemptMax = 5;
        while (true && loginAttempt <= loginAttemptMax) {
            System.out.print("Please enter your USERNAME : ");
            String inputUsername = inputLogin.next();
            System.out.print("Please enter your PASSWORD : ");
            String inputPassword = inputLogin.next();

            if (inputUsername.equals("admin") && inputPassword.equals("admin1")) {
                System.out.println("Loggin success, Welcome " + inputUsername);
                break;
            } else {
                System.out.println("The Username/Password you've entered was incorrect");
                System.out.println("Try AGAIN!!");
                loginAttempt++;
                continue;
            }
        }

        boolean ProgramRunning = true;
        while (ProgramRunning) {

            System.out.println("\n1. Play Game");
            System.out.println("2. Show Available HERO");
            System.out.println("3. Exit\n");

            System.out.print("What do you want to do? ");
            int commandMenu = inputMainMenu.nextInt();
            switch (commandMenu) {
                case 1:
                    PlayGame();
                    break;

                case 2:
                    ShowAvailableHero();
                    break;

                case 3:
                    ProgramRunning = false;
                    break;

                default:
                    System.out.println("Command invalid");
                    break;
            }

        }
    }
}