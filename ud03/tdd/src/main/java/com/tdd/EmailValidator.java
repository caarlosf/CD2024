package com.tdd;

public class EmailValidator {

    public boolean isValid(String email) {
        if (email == null) {
            return false;
        }

        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        return email.matches(regex);
    }
}

