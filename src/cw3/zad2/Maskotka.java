
// Konkretny dekorator - Maskotka
class Maskotka extends ProduktDekorator {
    public Maskotka(Produkt produkt) {
        super(produkt);
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis() + ", Maskotka sklepu";
    }

    @Override
    public double pobierzCene() {
        return produkt.pobierzCene();
    }
}
