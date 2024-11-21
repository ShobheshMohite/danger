package OOP.Basic_2;

import java.util.Scanner;

public class PasswordChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to set your password \n");
    String Password;
    do {
      System.out.println("Please Enter Your Password : ");
      Password = input.next();
    } while (!passwordChecker(Password));
    System.out.println("Thanks Of Entering Valid Password");

    input.close();
  }

  public static boolean passwordChecker(String password) {

    return password.length() > 6 && password.contains("@");
  }

}
