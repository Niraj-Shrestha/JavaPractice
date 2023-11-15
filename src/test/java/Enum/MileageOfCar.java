package Enum;

public enum MileageOfCar {
    AUDI(10),
    BMW(20),
    HONDA(30),
    TOYOTA(40),
    TESLA(50);

    int mileage;
    MileageOfCar(int mileage){
        this. mileage = mileage;
    }
}
