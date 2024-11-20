package Sorting_Algo;

//selection sort  = search the lowest number and and swap that number
/*12,57,7,32,3
1- 3,57,7,32,12
2- 3,7,57,32,12
3- 3,7,12,32,57
*/

public class SelectionSort {
  public static void main(String[] args) {
    int[] a = { 12, 57, 7, 32, 3 };
    int min = 0, temp = 0;
    for (int i = 0; i < a.length; i++) {
      min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[min]) {
          min = j;
        }
      }
      temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
