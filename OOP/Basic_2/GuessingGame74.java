package OOP.Basic_2;

import java.util.Scanner;

class GuessingGame {

  int random;

  GuessingGame() {
    random = (int) Math.ceil(Math.random() * 100);
  }

  int guess(int guessNumber) {
    return guessNumber - random;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GuessingGame gg = new GuessingGame();

    System.out.println("---Welcome---");
    int guessNumber;
    int result;
    do {
      System.out.println("Guess The Number : ");
      guessNumber = sc.nextInt();
      result = gg.guess(guessNumber);
      if (result == 0) {
        System.out.println("Your Guess Is Perfect...");
      } else if (result < 0) {
        System.out.println("Guess Higherr..");
      } else {
        System.out.println("Guess Lowerr..");
      }
    } while (result != 0);
  sc.close();
  }

}
