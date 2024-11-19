public class palindrome {
  public static void main(String[] args) {
    int no = 101;
    int temp = no;

    int rev = 0 ,rem;
    while(temp != 0)
    {
      rem = temp % 10;
      rev = rev * 10 + rem;
      temp = temp / 10;
    }
    if(no==rev)
    {
      System.out.println("It is palindrome");
    }
    else{
      System.out.println("It is not palindrome");
    }
  } 
}
