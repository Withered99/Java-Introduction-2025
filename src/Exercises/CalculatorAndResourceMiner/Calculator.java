package Exercises.CalculatorAndResourceMiner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What operation do you want to use? Type \"Add\" for addition, \"Subtract\" for subtraction, \"Multiply\" for multiplication, and \"Divide\" for division.");
        String operation = scanner.next();
        System.out.println("What is the first number?");
        Double firstNum = scanner.nextDouble();
        System.out.println("What is the second number?");
        Double secondNum = scanner.nextDouble();
        Double output = null;
        if (operation.equals("Add")) {
            output = firstNum + secondNum;
        } else if (operation.equals("Subtract")) {
            output = firstNum - secondNum;
        } else if (operation.equals("Multiply")) {
            output = firstNum * secondNum;
        } else if (operation.equals("Divide")) {
            output = firstNum / secondNum;
        } else {
            System.out.println("ERROR: Not an available operation");
        }
        System.out.println("The result is: " + output);
    }
}