package org.example;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1; // Initialize with a positive number to start the loop

        while (number != 0) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number > 0) {
                System.out.println("You entered a positive number: " + number);
            } else if (number < 0) {
                System.out.println("The number must be positive.");
            }
        }

        System.out.println("You entered 0, program ends.");
    }
}
