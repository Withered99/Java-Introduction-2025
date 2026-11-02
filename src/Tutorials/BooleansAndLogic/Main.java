package Tutorials.BooleansAndLogic;

import java.util.Scanner;

@SuppressWarnings({"ConstantValue", "unused", "SpellCheckingInspection"})
public class Main {
    public static void main(String[] args) {
        /* Booleans and Logic */

        boolean goodVideo = true;
        boolean subscribed = false;
        System.out.println("This is a good video " + goodVideo);

        boolean isCreative = false;
        System.out.println("Player is in Creative Mode: " + isCreative);

        /* Comparison (< <= >= > == !=) */
        int points = 80;
        int pointsForPassing = 55;
        boolean hasPassedTest = points >= pointsForPassing;
        System.out.println("Has passed Test: " + hasPassedTest);

        int health = 10;
        boolean isAlive = health > 0;
        System.out.println("Is Player still alive: " + isAlive);

        // comp ==> boolean
        // int + int ==> int

        // Beware of Strings
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean isKaupenjoe = name.equals("Kaupenjoe"); // .equals for strings
        System.out.println("Is Your Name Kaupenjoe? " + isKaupenjoe);

        /* Logic */
        // "addition" and "subtraction" for booleans
        // Boolean logic Boolean ==> Boolean

        /* Or */
        // a || b

        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 1
        // 0 | 1 | 1
        // 1 | 1 | 1

        /* And */
        // a && b

        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 0
        // 0 | 1 | 0
        // 1 | 1 | 1

        /* Not */
        // !

        // a | !a
        // 0 | 1
        // 1 | 0

        // Test Example
        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2;

        // Mining Example
        boolean hasPickaxe = true;
        int durability = 5;
        int neededDurability = 9;

        boolean canMine3x3Area = hasPickaxe && (durability >= neededDurability);

        // Drinking Age Example
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put in true or False, are you from Europe?");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean isAmerican = !isEuropean;
        boolean couldDrinkInEU = age >= euDrinkingAge;
        boolean couldDrinkInUS = age >= usDrinkingAge;

        boolean canPersonDrinkAlcohol = isEuropean && couldDrinkInEU || isAmerican && couldDrinkInUS;
        System.out.println("Can you drink? " + canPersonDrinkAlcohol);
    }
}