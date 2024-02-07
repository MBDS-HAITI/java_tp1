package ht.edu.fds.mbds.java.controllers;

import ht.edu.fds.mbds.java.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarManager implements IvehiculeManager<Car> {
    private final int maxCars;
    List<Car> vehicules = new ArrayList<>();

    public CarManager(int maxCars) {
        this.maxCars = maxCars;
    }

    @Override
    public List<Car> getVehicules() {
        return vehicules;
    }

    @Override
    public int getMaxVehicules() {
        return maxCars;
    }

    @Override
    public int getRemainingVehicules() {
        return maxCars - getVehicules().size();
    }

    @Override
    public void addVehicule(Car vehicule) {
        if (getVehicules().size() < maxCars) {
            getVehicules().add(vehicule);
        } else {
            System.out.println("Y a plus de places, va voir ailleurs");
        }
    }

    @Override
    public void removeVehicule(Car vehicule) {
        getVehicules().remove(vehicule);
    }

    @Override
    public String toString() {
        return "CarManager{" +
                "maxCars=" + maxCars + "\n" +
                "vehicules=" + getVehicules() +
                '}';
    }
}
