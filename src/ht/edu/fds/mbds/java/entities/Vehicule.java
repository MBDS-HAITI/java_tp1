package ht.edu.fds.mbds.java.entities;

public abstract class Vehicule {
    protected String immatriculation;
    protected String model;
    protected String color;
    protected VehiculeType type;

    public Vehicule(String immatriculation, String model, String color, VehiculeType type) {
        this.immatriculation = immatriculation;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehiculeType getType() {
        return type;
    }

    public void setType(VehiculeType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "immatriculation='" + immatriculation + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type=" + type +
                '}';
    }
}
