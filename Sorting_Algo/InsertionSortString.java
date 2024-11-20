package Sorting_Algo;

//Insertion Sort = Insert the right element at right pos ,  just like playing cards
//compareTo

public class InsertionSortString {
  public static void main(String[] args) {
    String temp = "";
    int j;
    String[] a = { "Shobhesh", "Atish" };
    for (int i = 1; i < a.length; i++) {
      temp = a[i]; // temp = 2
      j = i; // j = 1
      while ((j > 0) && (a[j - 1].compareTo(temp) > 0)) { // (j > 0 && 5 > 1)
        a[j] = a[j - 1]; // 1: 2,5,6,3
        j = j - 1; // j = 0
      }
      a[j] = temp; // 1: 2,5,6,3
    }

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
