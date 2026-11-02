package Tutorials.IfAndSwitchStatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* If Statement */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much health do you have?");
        int health = scanner.nextInt();
        boolean isAlive = health > 0;

        if (isAlive) { // isAlive == true; also works
            System.out.println("You are still alive!");
        } else {
            System.out.println("You are dead!");
        }

        System.out.println("How many points did you have in the exam?");
        int points = scanner.nextInt();
        if (points >= 100) {
            System.out.println("Passed with Honors");
        } else if (points >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        /* Switch Statement */
        System.out.println("Give a number between 0 and 5");
        int studentId = scanner.nextInt();

        switch (studentId) {
            case 0: System.out.println("Student Sarah has Id 0"); break;
            case 1: System.out.println("Student Mara has Id 1"); break;
            case 2: System.out.println("Student John has Id 2"); break;
            case 3: System.out.println("Student Bowie has Id 3"); break;
            case 4: System.out.println("Student Ludwig has Id 4"); break;
            case 5: System.out.println("Student Nano has Id 5"); break;
            default: System.out.println("ERROR: Student with id " + studentId + " not found"); break;
        }
    }
}