package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti parola:");
        String parola = input.nextLine();
        boolean valid = true;
        if (parola.length()<6) {
            System.out.println("Lungimea trebuie sa fie de minim 6 caractere");
            valid=false;
        }
        if (!Pattern.matches(".*[a-z].*",parola)){
            System.out.println("Minim o litera mica!");
            valid=false;
        }
        if (!Pattern.matches(".*[A-Z].*",parola)) {
            System.out.println("Minim o litera mare!");
            valid = false;
        }
        if (!Pattern.matches(".*\\d.*",parola)){
            System.out.println("Minim o cifra!");
            valid=false;
        }
        System.out.println(valid ? "Parola corecta!":"Parola incorecta!");

    }
}
