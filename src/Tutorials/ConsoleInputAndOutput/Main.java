package Tutorials.ConsoleInputAndOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! This is my first output!");

        int life = 42;
        System.out.println(life);

        int grade = 85;
        System.out.println("Your Grade is " + grade);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("You just typed: " + number);

        String input = scanner.next();
        System.out.println("You just typed (String): " + input);
    }
}