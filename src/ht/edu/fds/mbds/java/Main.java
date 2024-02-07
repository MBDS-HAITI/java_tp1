package ht.edu.fds.mbds.java;

import ht.edu.fds.mbds.java.controllers.Parking;
import ht.edu.fds.mbds.java.entities.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String readConsole() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void main(String[] args) throws IOException {
        Parking parking = new Parking(2, 2, "Parking de l'Université", "Port-au-Prince");
        System.out.println(parking);

        Car car = new Car("1234", "Toyota", "Rouge", 4);
        parking.addVoiture(car);
        System.out.println(parking);

        parking.addVoiture(new Car("1234", "Toyota", "Rouge", 4));
        System.out.println(parking);

        parking.removeVoiture(car);
        System.out.println(parking);

        parking.addVoiture(new Car("1234", "Toyota", "Rouge", 4));
        System.out.println(parking);


        /*while (true) {
            System.out.println("Entrez un mot");
            String name = readConsole();
            if (name.equals("exit")) {
                System.out.println("Bye bye");
                break;
            } else {
                System.out.println("Vous avez entré: " + name);
            }
        }*/
    }
}
