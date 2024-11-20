package Arrays;

//for each
//2D Array Retrivel
public class array5 {
  public static void main(String[] args) {
    int[][] a = { { 10, 20 }, { 30, 40 } };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
    }
  }
}
