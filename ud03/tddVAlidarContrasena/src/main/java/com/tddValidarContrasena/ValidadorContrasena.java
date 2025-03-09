package com.tddValidarContrasena;

public class ValidadorContrasena {

    public boolean esValida(String contraseña) {
        if (contraseña == null || contraseña.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito    = false;
        boolean tieneEspecial  = false;


        String especiales = "!@#$%^&*";


        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneDigito = true;
            }

            if (especiales.indexOf(c) != -1) {
                tieneEspecial = true;
            }
        }


        return tieneMayuscula && tieneMinuscula && tieneDigito && tieneEspecial;
    }
}
