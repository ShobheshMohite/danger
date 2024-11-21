package OOP.Basic;

public class Car {
  int noOfWheels;
  String colour;
  float maxSpeed;
  float currentFuelInLiters;
  int noOfSeats;

  public void drive() {
    System.out.println("Car Is Going Forword");
    currentFuelInLiters--;
  }

  public void addFuel(float fuel) {
    currentFuelInLiters += fuel;
  }

  public float getCurrentFuelLevel() {
    return currentFuelInLiters;
  }

}
