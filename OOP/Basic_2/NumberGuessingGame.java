package OOP.Basic_2;

import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int no;
    int num = 5;
    System.out.println("Welcome to Number Guessing Game : \n");
    do {
      System.out.println("Guess the number between 1 to 10 : ");
      no = input.nextInt();
    } while (no != num);
    System.out.println("Yayyyy , You Are Right");

    input.close();
  }
}
