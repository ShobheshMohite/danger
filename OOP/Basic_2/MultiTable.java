package OOP.Basic_2;

import java.util.Scanner;

public class MultiTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Printing Table : \n");
    System.out.println("Enter The Number You Want Table Of : ");
    int no = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(no + " * " + i + " = " + (no * i));
    }

    input.close();
  }
}
