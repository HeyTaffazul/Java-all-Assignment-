// Part 1: Understanding Inheritance Class Hierarchy Creation
class Vehicle {
    String make;
    String model;
    int year;
    
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
    
    public static String getClassType() {
        return "Vehicle";
    }
}

class Car extends Vehicle {
    String fuelType;
    int numberOfDoors;
    
    public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
        super(make, model, year);
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Car - Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType + ", Doors: " + numberOfDoors);
    }
    
    public static String getClassType() {
        return "Car";
    }
}

class Bike extends Vehicle {
    String type;
    
    public Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Bike - Make: " + make + ", Model: " + model + ", Year: " + year + ", Type: " + type);
    }
    
    public static String getClassType() {
        return "Bike";
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2024, "Gasoline", 4);
        Vehicle bike = new Bike("RoyelEnfield", "classic 350", 2024, "patrol");

        car.displayInfo();
        bike.displayInfo();

    }
}
