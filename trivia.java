package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;

        System.out.println("True or false? Hyenas are more closely related to cats than dogs.");
        Scanner scanner1 = new Scanner(System.in);
        String answer1 = scanner1.nextLine();

        if (answer1.equals("True") || answer1.equals("true")) {
            System.out.println("Correct!");
            score += 1;
        } else {
            System.out.println("Incorrect.");
        }

        System.out.println("What is the capital of Venezuela?");
        Scanner scanner2 = new Scanner(System.in);
        String answer2 = scanner2.nextLine();

        if (answer2.equals("Caracas")) {
            System.out.println("Correct!");
            score += 1;
        } else {
            System.out.println("Incorrect.");
        }

        System.out.println("True or false? For his time, Napoleon was actually average height.");
        Scanner scanner3 = new Scanner(System.in);
        String answer3 = scanner3.nextLine();

        if (answer3.equals("True") || answer3.equals("true")) {
            System.out.println("Correct!");
            score += 1;
        } else {
            System.out.println("Incorrect.");
        }

        scanner1.close();
        scanner2.close();
        scanner3.close();

        switch (score) {
            case 3:
                System.out.println("Gold medal!");
                break;
            case 2:
                System.out.println("Silver medal!");
                break;
            case 1:
                System.out.println("Bronze medal!");
                break;
            default:
                System.out.println("No medal.");
                break;
        }
    }
}
