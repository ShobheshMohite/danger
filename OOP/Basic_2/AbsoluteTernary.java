package OOP.Basic_2;

import java.util.Scanner;

public class AbsoluteTernary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome");
    System.out.print("Enter a number : ");
    int num1 = input.nextInt();
    int result = num1 > 0 ? num1 : -num1;
    System.out.println("Absolute Value Is : " + result);
    input.close();
  }

}
