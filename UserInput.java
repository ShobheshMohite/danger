import java.util.Scanner;

class UserInput{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("Enter Name: ");
      String name = s.nextLine();

      System.out.println(name);

      s.close();
    }  
}