// Natalie Ramirez
// Hello World Program
// Java Basics Coding Club Workshop

import java.util.Scanner;

public class HelloWorldDemo {

   // Main method
   
   public static void main (String[] args) {
         introduction();
   }
   
   public static void introduction() {
   
   //Create Scanner - allows for user input
      Scanner kb = new Scanner(System.in);
      
      //Ask user for their name
      System.out.println("Name?");
      
      //Get input from user
      //Create firstName String variable
      String firstName = kb.nextLine();
      
      //Print user's name
      System.out.println("My name is: " + firstName);
   
      System.out.println(); // Line break
      
      //Ask user what grade they're in
      System.out.println("What grade are you in?");
      
      //Receive number input from user
      int gradeLevel = kb.nextInt();
      
      //Print completed response
      System.out.println(firstName + " is in grade " + gradeLevel);


   }
}