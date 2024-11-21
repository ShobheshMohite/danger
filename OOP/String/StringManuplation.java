package OOP.String;

class StringManuplation {
  public static void main(String[] args) {
    String firstName = "Shobhesh";
    String lastName = "Mohite";
    String fullName = firstName.concat(" ").concat(lastName);
    
    System.out.println(fullName.toUpperCase());
  }
}
