import java.util.Scanner;

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

        // Beware of Strings


    }
}