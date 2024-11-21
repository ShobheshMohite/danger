package OOP.AbstractPolymorphism;

public class TestAbstraction {
  public static void main(String[] args) {
    // Vehicle vh = new Vehicle(2);
    Car car = new Car();
    car.commute();
    car.makeStartSound();
  }
}
