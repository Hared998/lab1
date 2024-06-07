
public class SklepMain {
    public static void main(String[] args) {
        Produkt produkt = new KupionyProdukt("Produkt podstawowy", 50.0);

        // Dodanie dodatkow
        produkt = new Maskotka(produkt);
        produkt = new Smycz(produkt);
        produkt = new Rabat(produkt);
        produkt = new KosztTransportu(produkt);

        // Wyswietlenie opisu i ceny
        System.out.println("Zakupione produkty: " + produkt.pobierzOpis());
        System.out.println("Laczna cena: " + produkt.pobierzCene() + " PLN");
    }
}
