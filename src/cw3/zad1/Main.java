package cw3.zad1;

public class Main {
    public static void main(String[] args) {
        // Tworzenie podstawowej pizzy
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription() + " costs " + pizza.getPrice());

        // Dodawanie sera
        PizzaDecorator cheese = new Cheese(pizza);
        pizza = cheese;
        System.out.println(pizza.getDescription() + " costs " + pizza.getPrice());

        // Dodawanie pepperoni
        PizzaDecorator pepperoni = new Pepperoni(pizza);
        pizza = pepperoni;
        System.out.println(pizza.getDescription() + " costs " + pizza.getPrice());

        // Usuwanie pepperoni
        pepperoni.removeIngredient();
        System.out.println("After removing pepperoni: " + pizza.getDescription() + " costs " + pizza.getPrice());
    }
}