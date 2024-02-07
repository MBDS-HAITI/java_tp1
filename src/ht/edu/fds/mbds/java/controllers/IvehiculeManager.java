package ht.edu.fds.mbds.java.controllers;

import ht.edu.fds.mbds.java.entities.Vehicule;

import java.util.List;

public interface IvehiculeManager<T extends Vehicule> {

    List<T> getVehicules();

    int getMaxVehicules();

    int getRemainingVehicules();

    void addVehicule(T vehicule);

    void removeVehicule(T vehicule);

}
