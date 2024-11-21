package OOP.AbstractPolymorphism;

public class Car extends Vehicle {

  @SuppressWarnings("unused")
  private int noOfDoors;

  public Car() {

    super(4);
  }

  @Override
  public void makeStartSound() {
    System.out.println("Vroooommm....");
  }
}
