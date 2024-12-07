//Author: Dillon Goralski

package lab8;

import java.util.Scanner;

public class AppleTester {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Output welcome message
     System.out.println("Welcome to the Apple tester!!!");

     // Creating the first apple using the default constructor
     System.out.println("Creating the first apple!");
     Apple firstApple = new Apple();  // default constructor
     System.out.println("Default values of the first apple object:");
     firstApple.writeOutput();  // display the first apple's details

     // Accept user input for the second apple
     System.out.println("Enter the type of the second apple object:");
     String type = scanner.nextLine();
     System.out.println("Enter the weight of the second apple object:");
     double weight = scanner.nextDouble();
     System.out.println("Enter the price of the second apple object:");
     double price = scanner.nextDouble();

     // Creating the second apple using the parameterized constructor
     System.out.println("Creating the second apple object!");
     Apple secondApple = new Apple(type, weight, price);  // parameterized constructor

     // Display results for the second apple
     System.out.println("Values of the second apple object:");
     secondApple.writeOutput();  // display the second apple's details

     // Close the scanner
     scanner.close();
 }
}
