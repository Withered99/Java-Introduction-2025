package Tutorials.StringsAndStringsMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Kaupenjoe";
        String occupation = "YouTube";
        occupation += "r";

        System.out.println("My name is " + name + " and I am a " + occupation);

        String sentence = "Hello, how are you doing? Hello";
        System.out.println(sentence);

        // Upper Case & Lower Case
        System.out.println("Lower Case: " + sentence.toLowerCase());
        System.out.println("Upper Case: " + sentence.toUpperCase());

        // Contain
        System.out.println("Does in contain \"hello\": " + sentence.contains("hello"));

        // Replacing
        System.out.println(sentence.replace("Hello", "Howdy, Howdy"));

        //charAt --> start count at 0
        System.out.println(sentence.charAt(8));

        // is not actually changed
        System.out.println(sentence);

        System.out.println("-----------------");

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input == "Kaupenjoe") {
            System.out.println("Yes, it's kaupenjoe with ==");
        } else {
            System.out.println("Nope, it's not Kaupenjoe with ==");
        }

        if (input.equals("Kaupenjoe")) {
            System.out.println("Yep, it's kaupenjoe with equals");
        } else {
            System.out.println("Nope, it's not kaupenjoe with equals");
        }

        System.out.println("-----------------");
        scanner.nextLine(); // Clear remaining input

        // Notes on Scanners and Strings
        System.out.println("What is your Full Name?");
        input = scanner.nextLine();

        if (input == "Joe Kaupenjoe") {
            System.out.println("Yes, it's Joe kaupenjoe with ==");
        } else {
            System.out.println("Nope, it's not Joe Kaupenjoe with ==");
        }

        if (input.equals("Joe Kaupenjoe")) {
            System.out.println("Yep, it's Joe Kaupenjoe with equals");
        } else {
            System.out.println("Nope, it's not Joe Kaupenjoe with equals");
        }
    }
}