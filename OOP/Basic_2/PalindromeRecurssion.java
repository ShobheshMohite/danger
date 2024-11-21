package OOP.Basic_2;

import java.util.Scanner;

public class PalindromeRecurssion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("--Welcome to Check Palindrome--");

    System.out.println("Enter String To Check : ");

    String s = input.next();

    System.out.println("Your String Is " + (isPalindrome(s.toLowerCase())
        ? "Palindrome"
        : "Not Palindrome"));

    input.close();
  }

  public static boolean isPalindrome(String str) {
    if (str.length() <= 1) {
      return true;
    }
    if (str.charAt(0) != str.charAt(str.length() - 1)) {
      return false;
    }
    String newStr = str.substring(1, (str.length() - 1));
    return isPalindrome(newStr);
  }
}
