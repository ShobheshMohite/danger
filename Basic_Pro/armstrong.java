package Basic_Pro;
//153 = 1^3 + 5^3 + 3^3;
public class armstrong {
    public static void main(String[] args) {
      int no=153 ;
      int t1 = no;
      int length = 0;
      while(t1!=0)
      {
        length = length + 1;
        t1 = t1 /10;
      }
      int t2 = no,rem;
      int arm = 0;
      while (t2!=0) {
        int mul = 1;
        rem = t2 % 10;
        for(int i = 1 ; i<=length ; i++)
        {
          mul = mul * rem;
        }
        arm = arm + mul;
        t2=t2/10;
      }
      if(arm == no)
      {
        System.out.println("No is Armstrong");
      }
      else
      {
        System.out.println("No is not armstrong number");
      }
    }
}
