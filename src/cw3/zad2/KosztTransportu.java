
// Konkretny dekorator - Koszt transportu
class KosztTransportu extends ProduktDekorator {
    public KosztTransportu(Produkt produkt) {
        super(produkt);
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis() + ", Dodatkowy koszt transportu";
    }

    @Override
    public double pobierzCene() {
        return produkt.pobierzCene() + 13.0;
    }
}
