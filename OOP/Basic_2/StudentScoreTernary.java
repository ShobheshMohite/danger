package OOP.Basic_2;

import java.util.Scanner;

public class StudentScoreTernary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Student Score :");
    System.out.print("Enter a marks : ");
    int marks = input.nextInt();
    String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");

    System.out.println("Grade : " + category);
    input.close();
  }

}
