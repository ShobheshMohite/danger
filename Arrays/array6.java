package Arrays;

//for each
//3D Array Retrivel
public class array6 {
  public static void main(String[] args) {
    int[][][] a = { { { 10, 20 }, { 50, 60, 80 } }, { { 30, 40 }, { 70, 80, 90 } } };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        for (int k = 0; k < a[i][j].length; k++) {
          System.out.print(a[i][j][k] + " ");
        }
        System.out.println();
      } 
      System.out.println();
    }
  }
}
