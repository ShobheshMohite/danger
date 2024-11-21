package OOP.Basic_2;

class ArrayToString {

  public static void main(String[] args) {

    String[] arr = new String[] { "I", "am", " Shobhesh", ",", "Destroyer", "Of", "Worries" };
    StringBuilder sb = new StringBuilder();
    for (String arr2 : arr) {
      sb.append(arr2).append(" ");
    }
    System.out.println(sb);

  }
}
