package Sorting_Algo;

//compare adjcent elements and place them in asc or desc order
// 56 12 36 44

//ROUND 1
// 1: 12 56 36 44
// 2: 12 36 56 44
// 3 : 12 36 20 56

//ROUND 1
// 1 : 12 36 20 56
// 2 : 12 20 36 56

public class BubbleSort {
  public static void main(String[] args) {
    int temp = 0;
    int[] a = { 56, 12, 36, 44 };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length - 1 - i; i++)// -i will not take last element in each preceding round
      {
        int flag = 0;
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          flag = 1;
        }
        if (flag == 0) {
          break;
        }
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
