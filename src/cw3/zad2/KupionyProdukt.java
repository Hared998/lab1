
// Konkretny produkt
class KupionyProdukt implements Produkt {
    private String opis;
    private double cena;

    public KupionyProdukt(String opis, double cena) {
        this.opis = opis;
        this.cena = cena;
    }

    @Override
    public String pobierzOpis() {
        return opis;
    }

    @Override
    public double pobierzCene() {
        return cena;
    }
}
