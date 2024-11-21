package OOP.Basic_2;

import java.util.Scanner;

public class ForEach2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("--Welcome to Array Occurances Search--");

    int[] arr = ArrayUtility.inputArray();

    System.out.println("Enter Number To Search Occurances : ");
    int num = input.nextInt();

    int count = countOcc(arr, num);
    System.out.println("Total Count Is : " + count);
    input.close();
  }

  public static int countOcc(int[] arr, int num) {
    int count = 0;// Variable to count the occurrences of the number in the array

    for (int no : arr) {
      if (num == no) {
        count++;
      }
    }
    return count;
  }
}
