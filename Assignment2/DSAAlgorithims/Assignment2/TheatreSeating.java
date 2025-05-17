package DSAAlgorithims.Assignment2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TheatreSeating {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2D Array //
        String [][] seatArray = {
                {"A","1"},
                {"A","2"},
                {"A","3"},
                {"A","4"},
                {"A","5"},
                {"A","6"},
                {"B","1"},
                {"B","2"},
                {"B","3"},
                {"B","4"},
                {"B","5"},
                {"B","6"},
                {"C","1"},
                {"C","2"},
                {"C","3"},
                {"C","4"},
                {"C","5"},
                {"C","6"},
                {"D","1"},
                {"D","2"},
                {"D","3"},
                {"D","4"},
                {"D","5"},
                {"D","6"},
                {"E","1"},
                {"E","2"},
                {"E","3"},
                {"E","4"},
                {"E","5"},
                {"E","6"},
                {"F","1"},
                {"F","2"},
                {"F","3"},
                {"F","4"},
                {"F","5"},
                {"F","6"}

        };

        // Build a valid seat list //

        List<String> validSeats = new ArrayList<>();
        for (String[] seat : seatArray) { // Suggested by ChatGPT //
            validSeats.add(seat[0] + seat[1]);
        }

        // Build a reserved list //

        List<String> reservedSeats = new ArrayList<>();

        System.out.println("Welcome to the Theatre! Thank you for your ticket purchase!");
        System.out.println();
        System.out.println("Here are the seats to choose from:");
        System.out.println();
        for (int i = 0; i < seatArray.length; ++i) {
            for (int j = 0; j < seatArray[i].length; ++j) {
                System.out.print(seatArray[i][j]);
            }
            System.out.println();
            }

        System.out.println();
        System.out.println("Please enter what seat you would like to choose: ");
        String customerSeat = scanner.next();

    scanner.close();
    }
}