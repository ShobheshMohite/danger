package OOP.in.sm.basicChallenge.utils;

import OOP.in.sm.basicChallenge.geometry.Circle;
import OOP.in.sm.basicChallenge.geometry.Rectangle;

public class Calculator {
  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(4, 6);

    double circArea = Math.PI * Math.pow(circle.radius, 2);
    double rectArea = rectangle.breadth * rectangle.length;

    System.out.printf("[Area of circle is : %f] , [Area of rectangel is : %f] ", circArea, rectArea);

  }
}
