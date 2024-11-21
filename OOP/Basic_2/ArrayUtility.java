package OOP.Basic_2;

import java.util.Scanner;

public class ArrayUtility {
  public static int[] inputArray() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number Of Elements You Want To Store : ");
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.println("Please Enter " + size + " Elements To Store: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    return arr;

  }
}
