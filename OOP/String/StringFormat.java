package OOP.String;

public class StringFormat {
  public static void main(String[] args) {
    int marks = 106632332;
    String name = "Shobhesh";

    System.out.println("Hello " + name + " Your Marks Are : " + marks);

    System.out.printf("Hello %S , Your Marks Are : %,d", name, marks);

  }

}
