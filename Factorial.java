/* public class Factorial {
  public static void main(String[] args) {
    int n = 5;
    int fact = 1;

    for(int i = n ; i >= 1 ; i--)
    {
      fact = fact * i;
    }

    System.out.println(fact);
  }
} */

public class Factorial {

  static int fact = 1;
  public static void main(String[] args) {
    int no = 5;
    Factorial f = new Factorial();
    f.calfact(no);
    System.out.println("Factorial : "+fact);
  }

  void calfact(int no)
  {
    if(no>=1)
    {
      fact = fact * no;
      calfact(no - 1);
    }
  }

}