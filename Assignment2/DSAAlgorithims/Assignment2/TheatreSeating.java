package DSAAlgorithims.Assignment2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TheatreSeating {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2D Array //
        String[][] seatArray = {
                {"A", "1"},
                {"A", "2"},
                {"A", "3"},
                {"A", "4"},
                {"A", "5"},
                {"A", "6"},
                {"B", "1"},
                {"B", "2"},
                {"B", "3"},
                {"B", "4"},
                {"B", "5"},
                {"B", "6"},
                {"C", "1"},
                {"C", "2"},
                {"C", "3"},
                {"C", "4"},
                {"C", "5"},
                {"C", "6"},
                {"D", "1"},
                {"D", "2"},
                {"D", "3"},
                {"D", "4"},
                {"D", "5"},
                {"D", "6"},
                {"E", "1"},
                {"E", "2"},
                {"E", "3"},
                {"E", "4"},
                {"E", "5"},
                {"E", "6"},
                {"F", "1"},
                {"F", "2"},
                {"F", "3"},
                {"F", "4"},
                {"F", "5"},
                {"F", "6"}

        };

        // Build a valid seat list //

        List<String> validSeats = new ArrayList<>();
        for (String[] seat : seatArray) { // Suggested by ChatGPT //
            validSeats.add(seat[0] + seat[1]);
        }

        // Build a reserved list //

        List<String> reservedSeats = new ArrayList<>();

        while (true) {

            System.out.println();
            System.out.println();
            System.out.println("Welcome to the Theatre Seating System!");
            System.out.println();

            System.out.println();
            System.out.println("Please enter what you would like to do from the following options: ");
            System.out.println("To display seats, enter DISPLAY.");
            System.out.println("To reserve, enter a valid seat number");
            System.out.println("To remove, enter REMOVE <seat> (ex: REMOVE C2).");
            System.out.println("To exit, enter EXIT.");
            System.out.println();
            System.out.println("Please enter your option:");
            String customerInput = scanner.nextLine().trim().toUpperCase();

            System.out.println();
            if (customerInput.equals("DISPLAY")) {
                System.out.println("Here are the seats to choose from: ");
                System.out.println();
                for (int i = 0; i < seatArray.length; ++i) {
                    for (int j = 0; j < seatArray[i].length; ++j) {
                        System.out.print(seatArray[i][j]);
                    }
                    System.out.println();
                }
                continue;
            }

            // Exiting the program //
            if (customerInput.equals("EXIT")) {
                System.out.println("Thank you for using the Theatre Seating System!");
                break;
            }

            // Check for seat availability //
            if (!validSeats.contains(customerInput)) {
                System.out.println("Seat " + customerInput + " is not a valid seat.");
            } else if (reservedSeats.contains(customerInput)) {
                System.out.println("Sorry, seat " + customerInput + " is already taken.");
            } else {
                reservedSeats.add(customerInput);
                System.out.println();
                System.out.println("Successfully purchased seat " + customerInput + ".");

            }

            // Removing a seat's availability - Asked ChatGPT for help with this part//
            if (customerInput.startsWith("REMOVE")){
                if (customerInput.length() <= "REMOVE ".length()) {
                    System.out.println("Please specify a seat to remove.");
                    // In place in case no seat is added after REMOVE //
                    continue;
                }

                String toCancel = customerInput.substring("REMOVE ".length()).trim();

                if (!validSeats.contains(toCancel)){
                    System.out.println("Seat " + toCancel + " is not a valid seat.");
                }
                else if (!reservedSeats.contains(toCancel)){
                    System.out.println("Seat " + toCancel + " has not been reserved yet.");
                }
                else {
                    reservedSeats.remove(toCancel);
                    System.out.println("Successfully removed seat " + toCancel + " from reserved seating.");
                }

            }


        }

        scanner.close();
    }
}