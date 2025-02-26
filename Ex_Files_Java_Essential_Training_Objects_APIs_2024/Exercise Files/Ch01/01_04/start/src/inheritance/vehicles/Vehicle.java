package inheritance.vehicles;

public class Vehicle {

    private String color;
    private int mileage;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

//Demonstrates multilevel inheritance in Java by modeling a vehicle hierarchy.
// The Vehicle class defines common attributes like color and mileage, while Car extends it with door properties.
// The Coupe class, inheriting from Car, sets the number of doors to 2 by default.
// The Garage class tests object creation and inheritance behavior.