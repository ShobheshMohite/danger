package OOP.String;

import java.util.Scanner;

class Circle {

  double radiusInMm;

  Circle(double radiusInMm) {
    this.radiusInMm = radiusInMm;
  }

  double getCircumference() {
    return 2 * Math.PI * radiusInMm;
  }

  double getArea() {
    return Math.PI * Math.pow(radiusInMm, 2);
  }

  @Override
  public String toString() {
    return "Circle: [radiusInMm=" + radiusInMm
        + ", Circumference In Mm: " + getCircumference()
        + ", Area in mm: " + getArea() + "]";

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--Welcome to the world of circles--");
    System.out.println("Please Enter Your Radius : ");
    double radius = sc.nextDouble();

    Circle circle = new Circle(radius);
    // circle.getArea();
    // circle.getCircumference();

    System.out.println(circle);

    sc.close();
  }
}
