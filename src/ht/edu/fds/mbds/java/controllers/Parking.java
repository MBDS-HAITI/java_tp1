package ht.edu.fds.mbds.java.controllers;

import ht.edu.fds.mbds.java.entities.Vehicule;
import ht.edu.fds.mbds.java.entities.VehiculeType;

import java.util.HashMap;

public class Parking implements IParking {
    private String name;
    private final String address;

    HashMap<VehiculeType, IvehiculeManager> vehicules = new HashMap<>();

    public Parking(int maxVoitures, int maxMoto, String name, String address) {
        this.name = name;
        this.address = address;
        vehicules.put(VehiculeType.CAR, new CarManager(maxVoitures));
        vehicules.put(VehiculeType.MOTORCYCLE, new MotoManager(maxMoto));
    }

    @Override
    public int getMax(VehiculeType type) {
        return vehicules.get(type).getMaxVehicules();
    }


    @Override
    public int getRemaining(VehiculeType type) {
        return vehicules.get(type).getRemainingVehicules();
    }

    @Override
    public void add(VehiculeType type, Vehicule vehicule) {
        vehicules.get(type).addVehicule(vehicule);
    }

    @Override
    public void remove(VehiculeType type, Vehicule vehicule) {
        vehicules.get(type).removeVehicule(vehicule);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parking{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", carManager=" + vehicules;
    }
}
