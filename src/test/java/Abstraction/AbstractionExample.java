package Abstraction;

public class AbstractionExample {

    public static void main(String[] args) {
        Car car = new Car("Accord",45);
        Bike bike = new Bike("Apache", 100);
        car.turnOn();
        car.checkThrottle(5);
        car.turnOff();

        bike.turnOn();
        bike.checkGear("1");
        bike.turnOff();
    }
}

abstract class Vehicle {
    private String model;
    private double mileage;
    private boolean poweredOn = false;
    public Vehicle(String model,double mileage){
        this.model = model;
        this.mileage = mileage;
        //this.poweredOn = false;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public String setModel(){
        return model;
    }
    public double setMileage(){
        return mileage;
    }
    public boolean isPoweredOn() {
        return poweredOn;
    }
    public void getPoweredOn(boolean poweredOn){
        this.poweredOn = poweredOn;
    }

}

class Car extends Vehicle{

    private int throttle;
    public Car(String model, double mileage) {
        super(model, mileage);
        this.throttle = 0;
    }

    @Override
    public void turnOn() {
        System.out.println(setModel() + " is turned on and mileage is:" + setMileage());
        getPoweredOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println(setModel() + " is turned off");
        getPoweredOn(false);
    }

    public void checkThrottle(int newThrottle){
        if(isPoweredOn()){
            throttle = newThrottle;
            System.out.println("current throttle is: "+ throttle);
        }else {
            System.out.println("Car is turned off !!!");
        }
    }
}

class Bike extends Vehicle{

    private String gear;
    public Bike(String model, double mileage) {
        super(model, mileage);
        this.gear = "N";
    }

    @Override
    public void turnOn() {
        System.out.println(setModel() + " is turned on and mileage is:" + setMileage());
        getPoweredOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println(setModel() + " is turned off");
        getPoweredOn(false);
    }

    public void checkGear(String newGear){
        if(isPoweredOn()){
            gear = newGear;
            System.out.println("New gear is: " + gear);
        }else {
            System.out.println("Car is turned off !!!");
        }
    }
}
