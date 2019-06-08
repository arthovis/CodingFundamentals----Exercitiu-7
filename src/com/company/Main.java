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
        boolean hasLowerCase = isValid(".*[a-z].*",parola,"Minim o litera mica!");
        boolean hasUpperCase = isValid(".*[A-Z].*",parola,"Minim o litera mare!");
        boolean hasDigit = isValid(".*\\d.*",parola,"Minim o cifra");
        valid = valid &&!hasDigit && !hasLowerCase && !hasUpperCase;
        System.out.println(valid ? "Parola corecta!":"Parola incorecta!");

    }
    private static boolean isValid(String regex,String parola, String message){
        if (Pattern.matches(regex,parola)){
            return true;
        }
        System.out.println(message);
        return false;
    }
}
