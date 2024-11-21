package OOP.String;

public class Student {
  public int rollno;
  public String name;
  public int age;

  public Student(int rollno, String name, int age) {
    this.rollno = rollno;
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {

    return "Student Details: {rollno:" + rollno + ", name:" + name + ", age:" + age + " } ";

  }

  public static void main(String[] args) {
    Student s1 = new Student(1, "John", 20);
    System.out.println(s1);
  }

}
