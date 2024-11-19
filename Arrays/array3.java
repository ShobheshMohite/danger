package Arrays;

//for each

public class array3 {
  public static void main(String[] args) {
    int[] a = { 15, 20, 38, 89, 76 };
    /* for(datatype var_name : array/collection){} */
    System.out.print("{");
    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.print("}");
  }
}
