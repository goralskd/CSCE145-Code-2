//Author: Dillon Goralski
package lab8;

public class Apple {

 // Instance variables
 private String type;
 private double weight;
 private double price;

 // Default Constructor
 public Apple() {
     this.type = "Gala";  
     this.weight = 0.5;   
     this.price = 0.88;   
 }

 // Parameterized Constructor
 public Apple(String xType, double xWeight, double xPrice) {
     setType(xType);
     setWeight(xWeight);
     setPrice(xPrice);
 }

 // Setter for type with validation
 public void setType(String type) {
     if (type.equals("Red Delicious") || type.equals("Golden Delicious") || type.equals("Gala") || type.equals("Granny Smith")) {
         this.type = type;
     } else {
         this.type = null; 
         System.out.println("Invalid value for type!");
     }
 }

 // Setter for weight with validation
 public void setWeight(double weight) {
     if (weight >= 0 && weight <= 2) {
         this.weight = weight;
     } else {
         this.weight = 0.0; 
         System.out.println("Invalid value for weight!");
     }
 }

 // Setter for price with validation
 public void setPrice(double price) {
     if (price >= 0) {
         this.price = price;
     } else {
         this.price = 0.0; 
         System.out.println("Invalid value for price!");
     }
 }

 // Method to display the apple's details
 public void writeOutput() {
     System.out.println("Type: " + (type == null ? "null" : type));
     System.out.println("Weight: " + weight + " kg");
     System.out.println("Price: $" + price);
 }
}
