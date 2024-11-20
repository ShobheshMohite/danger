package Arrays;

//for each
//anonymus array
public class array4 {
  public static void main(String[] args) {
    array4.sum(new int[] { 15, 20, 38, 89, 76 });
    /* for(datatype var_name : array/collection){} */
  }

  static void sum(int[] a) {
    int total = 0;
    for (int i : a) {
      total = total + i;
    }
    System.out.println(total);
  }
}
