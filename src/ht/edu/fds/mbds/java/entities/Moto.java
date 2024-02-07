package ht.edu.fds.mbds.java.entities;

public class Moto extends Vehicule {

    private boolean hasSideCar;

    public Moto(String immatriculation, String model, String color, boolean hasSideCar) {
        super(immatriculation, model, color, VehiculeType.MOTORCYCLE);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}
