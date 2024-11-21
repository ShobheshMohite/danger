package OOP.Basic_2;

public class Course {

  public static int maxCapacity = 100;

  public String courseName;
  public int enrollments;

  String[] enrolledStudent;

  Course(String courseName) {
    this.courseName = courseName;
    this.enrollments = 0;
    this.enrolledStudent = new String[maxCapacity];
  }

  static void setMaxCapacity(int capacity) {
    Course.maxCapacity = capacity;
  }

  public void enrolleStudents(String studentName) {
    enrolledStudent[enrollments] = studentName;
    enrollments++;
  }

  public void unEnrollStudents(String studentName) {

    enrollments--;
  }

}
