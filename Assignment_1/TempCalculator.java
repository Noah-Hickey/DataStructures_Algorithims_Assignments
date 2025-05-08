import java.util.Scanner;

public class TempCalculator {


    public static void main(String[] args) {

    System.out.println("=================================================================");
    System.out.println();
    System.out.println("Welcome to the Temperature Converter!");
    System.out.println();
    System.out.println("Please enter 5 temperatures in Celsius to get the average.");

    System.out.println();
    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.println("Enter the first temperature in Celsius: ");
    double temp1 = scanner.nextDouble();

    System.out.println();
    System.out.println("Enter the second temperature in Celsius: ");
    double temp2 = scanner.nextDouble();

    System.out.println();
    System.out.println("Enter the third temperature in Celsius: ");
    double temp3 = scanner.nextDouble();

    System.out.println();
    System.out.println("Enter the fourth temperature in Celsius: ");
    double temp4 = scanner.nextDouble();

    System.out.println();
    System.out.println("Enter the fifth temperature in Celsius: ");
    double temp5 = scanner.nextDouble();

    System.out.println();
    double tempAverage = (temp1 + temp2 + temp3 + temp4 + temp5) / 5;

    System.out.println("The average temperature from the 5 temperatures is: " + tempAverage + " degrees Celsius.");

    scanner.close();

    }
}
