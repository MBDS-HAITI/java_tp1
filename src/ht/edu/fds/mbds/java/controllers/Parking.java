package ht.edu.fds.mbds.java.controllers;

import ht.edu.fds.mbds.java.entities.Car;
import ht.edu.fds.mbds.java.entities.Moto;

import java.util.ArrayList;
import java.util.List;

public class Parking implements IParking {
    private final int maxVoitures;
    private final int maxMoto;
    private String name;
    private final String address;
    private final List<Car> cars = new ArrayList<>();
    private final List<Moto> motos = new ArrayList<>();

    public Parking(int maxVoitures, int maxMoto, String name, String address) {
        this.maxVoitures = maxVoitures;
        this.maxMoto = maxMoto;
        this.name = name;
        this.address = address;
    }

    @Override
    public int getMaxVoitures() {
        return maxVoitures;
    }

    @Override
    public int getMaxMoto() {
        return maxMoto;
    }

    @Override
    public int getRemainingVoitures() {
        return maxVoitures - cars.size();
    }

    @Override
    public int getRemainingMoto() {
        return maxMoto - motos.size();
    }

    @Override
    public void addVoiture(Car car) {
        if (cars.size() < maxVoitures) {
            cars.add(car);
        } else {
            System.out.println("Y a plus de places, va voir ailleurs");
        }
    }

    @Override
    public void addMoto(Moto moto) {
        if (motos.size() < maxMoto) {
            motos.add(moto);
        } else {
            System.out.println("Y a plus de places, va voir ailleurs");
        }
    }


    @Override
    public void removeVoiture(Car car) {
        cars.remove(car);
    }


    @Override
    public void removeMoto(Moto moto) {
        motos.remove(moto);
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
                "maxVoitures=" + maxVoitures +
                ", maxMoto=" + maxMoto +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", Nombre de voitures =" + cars.size() +
                ", Nombre de motos =" + motos.size() +
                '}';
    }
}
