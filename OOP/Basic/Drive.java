package OOP.Basic;

public class Drive {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.drive();
    myCar.addFuel(100f);
    System.out.println(myCar.getCurrentFuelLevel() + " L");
  }
}
