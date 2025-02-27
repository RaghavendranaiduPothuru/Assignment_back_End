package main.java.curd;


import java.sql.SQLException;
import java.util.Scanner;

public class RegistrationApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            RegistrationService service = new RegistrationService();

            while (true) {
                System.out.println("1. Add User");
                System.out.println("2. List Users");
                System.out.println("3. Update User");
                System.out.println("4. Delete User");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1: {
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Date of Birth (YYYY-MM-DD): ");
                        String dob = scanner.nextLine();
                        System.out.print("Phone: ");
                        String phone = scanner.nextLine();
                        service.addUser(name, email, dob, phone);
                    }
                    case 2 : service.listUsers();
                    case 3 : {
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Date of Birth (YYYY-MM-DD): ");
                        String dob = scanner.nextLine();
                        System.out.print("Phone: ");
                        String phone = scanner.nextLine();
                        service.updateUser(id, name, email, dob, phone);
                    }
                    case 4 : {
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        service.deleteUser(id);
                    }
                    case 5 : {
                        System.out.println("Exiting...");
                        return;
                    }
                    default : System.out.println("Invalid option. Try again.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}