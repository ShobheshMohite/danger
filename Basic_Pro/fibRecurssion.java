package Basic_Pro;
public class fibRecurssion {
  static int a = 0,b=1,c;
  public static void main(String[] args) {
    System.out.print(a+" "+b);
    fibRecurssion fb = new fibRecurssion();
    fb.printfib(10);
  }
  void printfib(int i){
    if(i >= 1)
    {
      c = a + b;
      System.out.print(" "+c);
      a = b;
      b = c;
      printfib(i-1);  
    }
  }
}
