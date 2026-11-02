package Tutorials.IntegersAndMath;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        double x = 100;
        double y = 200;

        /* Addition */
        int sum = a + b;
        System.out.println("Sum: " + sum);

        sum = 50;
        System.out.println("Sum: " + sum);

        /* Subtraction */
        int sub = a - b;
        System.out.println("Subtraction: " + sub);

        /* Multiplication */
        int multi = a * b;
        System.out.println("Multiplication: " + multi);

        /* Division */
        // WIll always be 0 because int can only be whole numbers
        int div = a / b;
        System.out.println("Division: " + div);

        // WIll work because x and y are doubles
        double doubleDiv = x / y;
        System.out.println("Double Division: " + doubleDiv);

        // No Division by 0
        // div = b / 0;
        // System.out.println("Division:" + div);

        /* Remainder */
        int remain = 100 % 2; // = 0 => Even Number | = 1 => Uneven Number
        System.out.println("Remainder from 100 / 2: " + remain);

        remain = 100 % 3;
        System.out.println("Remainder from 100 / 3: " + remain);

        remain = 100 % 4;
        System.out.println("Remainder from 100 / 4: " + remain);

        /* Math Methods */
        System.out.println("Rounding: " + Math.round(6.4));
        System.out.println("Rounding Down: " + Math.floor(6.4));
        System.out.println("Rounding Up: " + Math.ceil(6.4));
        System.out.println("Exponent: " + Math.pow(2, 3));

        /* More Math Methods */
        // Math.

        /* "Random" Numbers */
        System.out.println("Random Rounded Number between 0 - 10: " + Math.round(Math.random() * 10));
        System.out.println("Random Number between 0 - 10: " + (Math.random() * 10));
        System.out.println("Random Rounded Number between 0 - 1: " + (Math.round(Math.random())));
        System.out.println("Random Number between 0 - 1: " + (Math.random()));
    }
}