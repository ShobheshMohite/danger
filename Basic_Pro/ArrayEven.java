package Basic_Pro;

public class ArrayEven {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    int arrLen = arr.length;
    int evenArr = 0;
    for (int i = 0; i <= arrLen - 1; i++) {
      if (arr[i] % 2 == 0) {
        evenArr++;
      }
    }

    int copiedArr[] = new int[evenArr];
    int index = 0;
    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] % 2 == 0) {
        copiedArr[index++] = arr[i];
        
      }
    }

    for (int i : copiedArr) {
      System.out.println(i);
    }

  }

}
