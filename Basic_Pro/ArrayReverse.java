package Basic_Pro;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int[] arr1 = reverseArray(arr);

    for (int i : arr1) {
      System.out.print(i + " ");
    }
  }

  public static int[] reverseArray(int[] arr) {
    int[] arr1 = new int[arr.length];
    for (int i = 0; i <= arr.length - 1; i++) {
      arr1[i] = arr[arr.length - 1 - i];
    }

    return arr1;
  }

}
