package Tutorials.JavaErrors;

public class Main {
    public static void main(String[] args) {
        /* Compiler Errors (Syntax Errors) */
//        int x = 0.0; // Error: incompatible type
//        int x = 0; //  Error: Already Defined

//      } // Error: Too many curly brackets

//        int z = 0 // Error: expected ;

        /* Runtime Errors (Exceptions) */
//        float y = 1 / 0; // Exception: Divide by Zero

//        String text = null;

//        int length = text.length();
//        System.out.println("The length of the text is: " + length); // Exception: NullPointerException

        // Fail Loudly --> Something to fix
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter anything but a number, that's gonna throw an error!");
//        int number = scanner.nextInt(); // Exception: InputMismatchException
//        System.out.println("You just typed " + number);
    }
}