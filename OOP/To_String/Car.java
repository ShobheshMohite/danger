package OOP.To_String;

public class Car {
  int noOfWheels;
  int noOfDoors;
  int maxSpeed;

  String name;
  String modelName;
  String company;

  public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelName, String company) {
    this.noOfWheels = noOfWheels;
    this.noOfDoors = noOfDoors;
    this.maxSpeed = maxSpeed;
    this.name = name;
    this.modelName = modelName;
    this.company = company;
  }

  @Override
  public String toString() {
    return "Car [noOfWheels=" + noOfWheels + ", noOfDoors=" +
        noOfDoors + ", maxSpeed=" + maxSpeed + ", name=" +
        name + ", modelName=" + modelName + ", company=" + company + "]";
  }

  public static void main(String[] args) {
    Car swift = new Car(4, 4, 180, "Swift", "SW8987", "Maruti");

    System.out.println(swift.toString());
  }

}
