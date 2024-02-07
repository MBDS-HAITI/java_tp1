package ht.edu.fds.mbds.java.controllers;

import ht.edu.fds.mbds.java.entities.Car;
import ht.edu.fds.mbds.java.entities.Moto;

import java.util.ArrayList;
import java.util.List;

public class MotoManager implements IvehiculeManager<Moto> {
    private final int maxMotos;
    List<Moto> vehicules = new ArrayList<>();

    public MotoManager(int maxMotos) {
        this.maxMotos = maxMotos;
    }

    @Override
    public List<Moto> getVehicules() {
        return vehicules;
    }

    @Override
    public int getMaxVehicules() {
        return maxMotos;
    }

    @Override
    public int getRemainingVehicules() {
        return maxMotos - getVehicules().size();
    }

    @Override
    public void addVehicule(Moto vehicule) {
        if (getVehicules().size() < maxMotos) {
            getVehicules().add(vehicule);
        } else {
            System.out.println("Y a plus de places, va voir ailleurs");
        }
    }

    @Override
    public void removeVehicule(Moto vehicule) {
        getVehicules().remove(vehicule);
    }

    @Override
    public String toString() {
        return "MotoManager{" +
                "maxMotos=" + maxMotos + " \n" +
                "vehicules=" + getVehicules() +
                '}';
    }
}
