package ht.edu.fds.mbds.java;

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
        while (true) {
            System.out.println("Entrez un mot");
            String name = readConsole();
            if (name.equals("exit")) {
                System.out.println("Bye bye");
                break;
            } else {
                System.out.println("Vous avez entré: " + name);
            }
        }
    }
}
