import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Tucson", 2023);
        Assertions.assertTrue(car instanceof Vehicle);
    }


    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Tucson", 2023);
        Assertions.assertEquals(4, car.numWheels);
    }


    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Breakout", 2023);
        Assertions.assertEquals(2, motorcycle.numWheels);
    }


    public void testCarSpeedDuringTestDrive() {
        Car car = new Car("Toyota", "Tucson", 2023);
        car.testDrive();
        Assertions.assertEquals(60, car.speed);
    }


    public void testMotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Breakout", 2023);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.speed);
    }


    public void testCarStopsWhenParked() {
        Car car = new Car("Toyota", "Tucson", 2023);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.speed);
    }


    public void testMotorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Breakout", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.speed);
    }
}