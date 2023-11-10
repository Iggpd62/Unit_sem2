
public abstract class Vehicle {
    protected String company;
    protected String model;
    protected int yearRelease;
    protected int numWheels;
    protected int speed;

    public Vehicle(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
    }

    public abstract void testDrive();

    public abstract void park();
}

class Car extends Vehicle {
    public Car(String company, String model, int yearRelease) {
        super(company, model, yearRelease);
        this.numWheels = 4;
        this.speed = 0;
    }

    public void testDrive() {
        this.speed = 60;
    }

    public void park() {
        this.speed = 0;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String company, String model, int yearRelease) {
        super(company, model, yearRelease);
        this.numWheels = 2;
        this.speed = 0;
    }

    public void testDrive() {
        this.speed = 75;
    }

    public void park() {
        this.speed = 0;
    }
}