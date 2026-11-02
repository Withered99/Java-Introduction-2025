package Tutorials.AssignmentOperators;

public class Main {
    public static void main(String[] args) {
        /* Assignment Operators */

        int mana = 100;
        System.out.println("Mana: " + mana);

        // Addition | +=
        mana += 20; // mana = mana + 20
        System.out.println("Mana: " + mana);

        // Increment | ++
        mana++;
        System.out.println("Mana: " + mana);

        // Subtraction | -=
        mana -= 20;
        System.out.println("Mana: " + mana);

        // Decrement | --
        mana--;
        System.out.println("Mana: " + mana);

        // Multiplication | *=
        mana *= 2;
        System.out.println("Mana: " + mana);

        // Divide | /=
        mana /= 4;
        System.out.println("Mana: " + mana);

        // Modulo | %=
        mana %= 2;
        System.out.println("Mana: " + mana);
    }
}