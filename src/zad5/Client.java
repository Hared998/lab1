package zad5;

public class Client {
    Taxes tax;
    String name;

    public Client(Taxes tax, String name){
        this.tax = tax;
        this.name = name;

    }
    public void buyProduct(Product product)
    {
        float fullPrice = product.Price * tax.tax();
        System.out.println("Klient " + name + " kupił " + product.name + " w cenie: " + fullPrice + "[PODATEK: " + tax.tax() + "]" );
    }
}
