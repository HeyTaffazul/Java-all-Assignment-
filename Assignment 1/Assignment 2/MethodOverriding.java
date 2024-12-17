//Part2: Demonstrating Method Overriding and Dynamic Binding
interface Maintenance {
    void scheduleService();
}

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

class Car extends Vehicle implements Maintenance {
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

    @Override
    public void scheduleService() {
        System.out.println("Car " + make + " " + model + " service scheduled.");
    }

    public static String getClassType() {
        return "Car";
    }
}

class Bike extends Vehicle implements Maintenance {
    String type;

    public Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike - Make: " + make + ", Model: " + model + ", Year: " + year + ", Type: " + type);
    }

    @Override
    public void scheduleService() {
        System.out.println("Bike " + make + " " + model + " service scheduled.");
    }

    public static String getClassType() {
        return "Bike";
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota", "Corolla", 2024, "Gasoline", 4);
        vehicles[1] = new Bike("Harley-Davidson", "Street 750", 2023, "Cruiser");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }

       // System.out.println(Car.getClassType());
        //System.out.println(Bike.getClassType());

        Maintenance carMaintenance = (Car) vehicles[0];
        Maintenance bikeMaintenance = (Bike) vehicles[1];

        carMaintenance.scheduleService();
        bikeMaintenance.scheduleService();
    }
}
