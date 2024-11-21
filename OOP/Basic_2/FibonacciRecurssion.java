package OOP.Basic_2;

import java.util.Scanner;

public class FibonacciRecurssion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("--Welcome to Printing Fibonacci--");
    System.out.println("Enter Number of Elements To Be Printed : ");
    int num = input.nextInt();

    for (int i = 1; i <= num; i++) {
      System.out.print(fibonacci(i) + " ");
    }

    input.close();
  }

  public static int fibonacci(int position) {
    System.out.print(".");
    if (position == 1) {
      return 0;
    }
    if (position == 2) {
      return 1;
    }
    return fibonacci(position - 1) + fibonacci(position - 2);

  }
}
