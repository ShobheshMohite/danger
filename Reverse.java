public class Reverse {
  public static void main(String[] args) {
    
    int no = 7;
    
    int temp = 0;
    for(int i = 2;i <= no-1 ; i++)
    {
      if(no%i == 0)
      {
        temp = temp + 1;
      }
    }
      if(temp == 0)
      {
        System.out.println("No Is Prime");
      }
      else
      {
        System.out.println("Not Prime Number");
      }



    // String name = "Shobhesh";
    // int length = name.length();
    // String Rev = "";
    // for(int i = length-1 ; i>=0 ; i--)
    // {
    //     Rev = Rev + name.charAt(i);
    // }
    // System.out.println(Rev);



  }
}
