package week4;

import java.util.Scanner;

public class MobileSignUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Restaurant Mobile Ordering App!");
            System.out.println("1. Sign up");
            System.out.println("2. Quit Application");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (option == 1) {
                if (signUpProcess(scanner)) {
                    System.out.println("Sign up successful! Your data has been saved.");
                    break; // Exit the loop after successful signup
                } else {
                    System.out.println("Sign up failed. Please correct errors and try again.");
                }
            } else if (option == 2) {
                System.out.println("Thank you for using the application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }

        scanner.close();
    }

    public static boolean signUpProcess(Scanner scanner) {
        System.out.println("\n=== Sign Up ===");

        // User inputs
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your contact number (10 digits): ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter your date of birth (DD/MM/YYYY or MM/DD/YYYY): ");
        String dob = scanner.nextLine();

        System.out.print("Enter your password (alphabets, @ or &, ending with numeric): ");
        String password = scanner.nextLine();

        System.out.print("Confirm your password: ");
        String confirmPassword = scanner.nextLine();

        // Validate inputs
        if (name.length() < 5) {
            System.out.println("Name should have at least 5 characters.");
            return false;
        }
        if (!contactNumber.matches("\\d{10}")) {
            System.out.println("Contact number should have 10 digits.");
            return false;
        }
        if (!dob.matches("((0[1-9])|(1[0-2]))/([0-2][0-9]|3[0-1])/\\d{4}")) {
            System.out.println("Invalid date of birth format. Use DD/MM/YYYY or MM/DD/YYYY.");
            return false;
        }
        if (!password.matches("[a-zA-Z]+[@&]\\d+$")) {
            System.out.println("Password should start with alphabets, @ or &, and end with numeric.");
            return false;
        }
        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match.");
            return false;
        }

        // Calculate age
        int yearOfBirth = Integer.parseInt(dob.split("/")[2]);
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - yearOfBirth;
        if (age < 21) {
            System.out.println("You must be at least 21 years old to sign up.");
            return false; // Exit signup process if age is less than 21
        } else {
            System.out.println("Sign up is successful");
            return true; // Signup successful
        }
    }
}




	    
	


