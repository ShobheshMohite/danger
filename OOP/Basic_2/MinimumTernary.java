package OOP.Basic_2;

import java.util.Scanner;

public class MinimumTernary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome");
    System.out.print("Enter a number");
    int num1 = input.nextInt();
    System.out.print("Enter a number");
    int num2 = input.nextInt();

    MinimumTernary mt = new MinimumTernary();
    int min = mt.min(num1, num2);

    System.out.println("Minimun Number : " + min);
    input.close();
  }

  public int min(int num1, int num2) {

    return num1 < num2
        ? num1
        : num2;
  }

}
