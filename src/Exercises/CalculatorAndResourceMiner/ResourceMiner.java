package Exercises.CalculatorAndResourceMiner;

import java.util.Scanner;

public class ResourceMiner {
    public static void main(String[] args) {
        System.out.println("Welcome to ResourceMiner!");

        int min= 1;
        int max = 3;
        int randomBlock;
        int correctMineScore = 0;
        Scanner scanner = new Scanner(System.in);
        String toolChoice;
        int toolChoiceId = 0;

        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (randomBlock) {
            case 1: System.out.println("You find a Stone Block"); break;
            case 2: System.out.println("You find a Clay Block"); break;
            case 3: System.out.println("You find a Cobweb Block"); break;
        }

        System.out.println("What tool do you want to use to mine the Block: Pickaxe, Shovel or Sword?");
        toolChoice = scanner.next().toLowerCase();

        switch (toolChoice) {
            case "pickaxe": toolChoiceId = 1; break;
            case "shovel": toolChoiceId = 2; break;
            case "sword": toolChoiceId = 3; break;
            default: System.out.println("ERROR: Could not find " + toolChoice + ". Program now ending!"); return;
        }

        if(randomBlock == toolChoiceId) {
            System.out.println("The Block was mined successfully!");
            correctMineScore++;
        } else {
            System.out.println("Your tool broke, but luckily you have extra!");
        }
        System.out.println("You encounter a new Block!");

        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (randomBlock) {
            case 1: System.out.println("You find a Stone Block"); break;
            case 2: System.out.println("You find a Clay Block"); break;
            case 3: System.out.println("You find a Cobweb Block"); break;
        }

        System.out.println("What tool do you want to use to mine the Block: Pickaxe, Shovel or Sword?");
        toolChoice = scanner.next().toLowerCase();

        switch (toolChoice) {
            case "pickaxe": toolChoiceId = 1; break;
            case "shovel": toolChoiceId = 2; break;
            case "sword": toolChoiceId = 3; break;
            default: System.out.println("ERROR: Could not find " + toolChoice + ". Program now ending!"); return;
        }

        if(randomBlock == toolChoiceId) {
            System.out.println("The Block was mined successfully!");
            correctMineScore++;
        } else {
            System.out.println("Your tool broke, but luckily you have extra!");
        }
        System.out.println("You encounter a new Block!");

        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (randomBlock) {
            case 1: System.out.println("You find a Stone Block"); break;
            case 2: System.out.println("You find a Clay Block"); break;
            case 3: System.out.println("You find a Cobweb Block"); break;
        }

        System.out.println("What tool do you want to use to mine the Block: Pickaxe, Shovel or Sword?");
        toolChoice = scanner.next().toLowerCase();

        switch (toolChoice) {
            case "pickaxe": toolChoiceId = 1; break;
            case "shovel": toolChoiceId = 2; break;
            case "sword": toolChoiceId = 3; break;
            default: System.out.println("ERROR: Could not find " + toolChoice + ". Program now ending!"); return;
        }

        if(randomBlock == toolChoiceId) {
            System.out.println("The Block was mined successfully!");
            correctMineScore++;
        } else {
            System.out.println("Your tool broke, but luckily you have extra!");
        }
        System.out.println("You have mined all Blocks! You correctly mined " + correctMineScore + " out of 3.");
    }
}