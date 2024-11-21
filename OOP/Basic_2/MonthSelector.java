package OOP.Basic_2;

import java.util.Scanner;

public class MonthSelector {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Month-Selector :");

    System.out.print("Enter Any Number Between 1 - 12 : ");
    int monthNum = input.nextInt();

    MonthSelector ms = new MonthSelector();
    if (monthNum <= 12) {
      String month = ms.monthSelect(monthNum);
      System.out.println("No " + monthNum + " Month Is: " + month);
    } else {
      System.out.println("Invalid Number");
    }
    input.close();
  }

  public String monthSelect(int monthNum) {
    return switch (monthNum) {
      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 -> "June";
      case 7 -> "July";
      case 8 -> "August";
      case 9 -> "September";
      case 10 -> "October";
      case 11 -> "November";
      case 12 -> "December";
      default -> "Not Valid";
    };
  }

}
