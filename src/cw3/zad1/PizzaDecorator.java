package cw3.zad1;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;
    protected boolean isActive = true;  // Nowe pole do śledzenia stanu dekoratora

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    public void removeIngredient() {
        isActive = false;  // Deaktywuje składnik
    }

    public String getDescription() {
        return decoratedPizza.getDescription() + (isActive ? activeDescription() : "");
    }

    public double getPrice() {
        return decoratedPizza.getPrice() + (isActive ? activePrice() : 0);
    }

    // Metody do nadpisania przez konkretne dekoratory
    protected abstract String activeDescription();
    protected abstract double activePrice();
}
