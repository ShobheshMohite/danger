package Sorting_Algo;

//compare adjcent elements and place them in asc or desc order
//compareTo() maethod will compare string lexicographically(String => Unicode)

public class BubbleSortString {
  public static void main(String[] args) {
    String temp = "";
    String[] a = { "Shobhesh", "Ajit", "Smera", "Spruha" };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length - 1 - i; i++)// -i will not take last element in each preceding round
      {
        int flag = 0;
        if (a[j].compareTo(a[j + 1]) > 0) {
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
