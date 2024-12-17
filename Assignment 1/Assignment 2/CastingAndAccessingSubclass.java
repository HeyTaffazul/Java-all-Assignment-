// Part 3: Additional Features Casting and Accessing Subclass Members
public class CastingAndAccessingSubclass {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2021, "Gasoline", 4);
        Vehicle bike = new Bike("Harley", "Iron 883", 2022, "Cruiser");

        car.displayInfo();
        bike.displayInfo();

        System.out.println(Car.getClassType());
        System.out.println(Bike.getClassType());

        if (car instanceof Car) {
            Car specificCar = (Car) car;
            System.out.println("Car Doors: " + specificCar.numberOfDoors);
        }

        if (bike instanceof Bike) {
            Bike specificBike = (Bike) bike;
            System.out.println("Bike Type: " + specificBike.type);
        }

        ((Maintenance) car).scheduleService();
        ((Maintenance) bike).scheduleService();
    }
}