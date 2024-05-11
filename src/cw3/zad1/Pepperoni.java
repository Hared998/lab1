package cw3.zad1;

public class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected String activeDescription() {
        return ", with pepperoni";
    }

    @Override
    protected double activePrice() {
        return 2.50;
    }
}