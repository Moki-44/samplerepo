// Save this file as Main.java
import java.util.Scanner; // Import Scanner class to read input

public class Main {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, welcome to Java!");

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text

        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Nice to meet you.");

        // Close the scanner
        scanner.close();
    }
}
