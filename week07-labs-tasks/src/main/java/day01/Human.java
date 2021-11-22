package day01;

import java.time.LocalDate;

public class Human {

    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {

        if (isValidYearOfBirth(yearOfBirth) && isValidName(name)) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        } else {
            throw new IllegalArgumentException("Hibás adatok!");
        }
    }

    private boolean isValidYearOfBirth(int yearOfBirth) {
        if (LocalDate.now().getYear() - yearOfBirth <= 120) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidName(String name) {
        if (name.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

}