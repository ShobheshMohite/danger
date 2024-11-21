package OOP.Basic_2;

import java.util.Scanner;

public class OddEvenTernary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome");
    System.out.print("Enter a number : ");
    int num1 = input.nextInt();

    OddEvenTernary mt = new OddEvenTernary();

    String result = mt.OddEven(num1);

    System.out.println("Your Number Is : " + result);
    input.close();
  }

  public String OddEven(int num1) {

    return num1 % 2 == 0 ? "Even" : "Odd";

  }
}
