package cw3.zad1;

public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getPrice() {
        return 10.00;  // Podstawowa cena
    }
}