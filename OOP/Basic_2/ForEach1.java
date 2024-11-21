package OOP.Basic_2;

import java.util.Scanner;

public class ForEach1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Array Search: ");
    int[] arr = ArrayUtility.inputArray();

    // int max = Integer.MIN_VALUE;
    int max = arr[0];
    for (int no : arr) {
      if (max < no) {
        max = no;
      }
    }
    System.out.println("Maximum Number Is : " + max);
    input.close();
  }
}
