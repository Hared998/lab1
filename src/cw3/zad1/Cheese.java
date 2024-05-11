package cw3.zad1;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected String activeDescription() {
        return ", with cheese";
    }

    @Override
    protected double activePrice() {
        return 2.00;
    }
}

