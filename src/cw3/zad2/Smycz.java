
// Konkretny dekorator - Smycz
class Smycz extends ProduktDekorator {
    public Smycz(Produkt produkt) {
        super(produkt);
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis() + ", Smycz do pendrive";
    }

    @Override
    public double pobierzCene() {
        return produkt.pobierzCene() + 1.0;
    }
}
