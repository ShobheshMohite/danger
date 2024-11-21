package OOP.Basic_2;

public class Book {
  public static int totalNoOfBooks;
  public String title;
  public String author;
  public int isbn;
  public boolean isBorrowed;

  static {
    totalNoOfBooks = 0;
  }
  {
    totalNoOfBooks++;
  }

  public Book(String title, String author, int isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public Book(int isbn) {
    this("unknown", "unknown", isbn);
  }

  public static int getTotalNoOfBooks() {
    return totalNoOfBooks;
  }

  public void borrowBook() {
    if (isBorrowed == true) {
      System.out.println("Book Is Already Borrowed");
    } else {
      this.isBorrowed = true;
      System.out.println("Enjoy : " + this.title);
    }
  }

  public void returnBook() {
    if (isBorrowed) {
      this.isBorrowed = false;
      System.out.println("Hope You Enjoyed It :)");
    } else {
      System.out.println("This Book Is Already In Here");
    }
  }

  public static void main(String[] args) {
    Book designOfThings = new Book("designOfThings", "Unknows", 1);
    Book myBook = new Book(2);

    System.out.println(totalNoOfBooks);

    designOfThings.borrowBook();
    myBook.borrowBook();
    designOfThings.borrowBook();
    designOfThings.returnBook();
    designOfThings.returnBook();
  }

}
