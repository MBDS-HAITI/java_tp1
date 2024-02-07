package ht.edu.fds.mbds.java.entities;

public class Car extends Vehicule {
    private int numberOfDoors;

    public Car(String immatriculation, String model, String color, int numberOfDoors) {
        super(immatriculation, model, color, VehiculeType.CAR);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
