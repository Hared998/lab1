
// Konkretny dekorator - Rabat
class Rabat extends ProduktDekorator {
    public Rabat(Produkt produkt) {
        super(produkt);
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis() + ", Rabat 10 PLN";
    }

    @Override
    public double pobierzCene() {
        double nowaCena = produkt.pobierzCene() - 10.0;
        return nowaCena < 0 ? 0 : nowaCena;
    }
}
