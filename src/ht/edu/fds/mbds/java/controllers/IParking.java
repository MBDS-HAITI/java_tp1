package ht.edu.fds.mbds.java.controllers;

import ht.edu.fds.mbds.java.entities.Car;
import ht.edu.fds.mbds.java.entities.Moto;
import ht.edu.fds.mbds.java.entities.Vehicule;
import ht.edu.fds.mbds.java.entities.VehiculeType;

import java.util.ArrayList;
import java.util.List;

public interface IParking {
    int getMax(VehiculeType type);

    int getRemaining(VehiculeType type);

    void add(VehiculeType type, Vehicule vehicule);

    void remove(VehiculeType type, Vehicule vehicule);
}
