
// Klasa dekoratora
abstract class ProduktDekorator implements Produkt {
    protected Produkt produkt;

    public ProduktDekorator(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis();
    }

    @Override
    public double pobierzCene() {
        return produkt.pobierzCene();
    }
}
