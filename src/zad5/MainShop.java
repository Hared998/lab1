package zad5;

public class MainShop {
    public static void main(String[] args) {
        Client adam = new Client(new BGTax(), "Adam");
        Client rafal = new Client(new PLTax(), "Rafal");
        Client krzysiek = new Client(new DETax(), "Krzysiek");
        Product telefon = new Product(3300.0f,"Telefon");
        adam.buyProduct(telefon);
        krzysiek.buyProduct(telefon);
        rafal.buyProduct(telefon);
    }
}
