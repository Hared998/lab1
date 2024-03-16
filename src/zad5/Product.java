package zad5;

public class Product {

    float Price;
    String name;

    public Product(float price, String name ){
        this.Price = price;
        this.name = name;
        System.out.println("Dodano produkt: " + name + " o cenie bez podatku: " + Price);
    }
}
