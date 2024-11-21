package OOP.Basic_2;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Calculator :");

    System.out.print("Enter First Number : ");
    int no1 = input.nextInt();

    System.out.print("Enter Second Number : ");
    int no2 = input.nextInt();

    System.out.println("Select From The Following To Perform Operation: ");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    System.out.print("Enter Your Choice : ");
    int choice = input.nextInt();

    Calculator cs = new Calculator();
    int result = cs.calculator(no1, no2, choice);
    System.out.println("Result Of Your Problem Is : " + result);

    input.close();
  }

  public int calculator(int no1, int no2, int choice) {
    int result = switch (choice) {
      case 1 -> no1 + no2;
      case 2 -> no1 - no2;
      case 3 -> no1 * no2;
      case 4 -> no1 / no2;
      default -> -1;
    };
    return result;
  }

}
