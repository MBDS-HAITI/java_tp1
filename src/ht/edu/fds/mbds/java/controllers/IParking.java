package ht.edu.fds.mbds.java.controllers;

import ht.edu.fds.mbds.java.entities.Car;
import ht.edu.fds.mbds.java.entities.Moto;

public interface IParking {
    int getMaxVoitures();

    int getMaxMoto();

    int getRemainingVoitures();

    int getRemainingMoto();

    void addVoiture(Car car);

    void addMoto(Moto moto);

    void removeVoiture(Car car);

    void removeMoto(Moto moto);
}
