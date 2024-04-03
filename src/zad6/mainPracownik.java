package zad6;

public class mainPracownik {
    public static void main(String[] args) {
        Pracownik mechanik = new Pracownik(new NaprawaSamochodow(), new Silownia(), new Samochod(), "Mechanik", "Adrian");
        mechanik.dojezdaj();
        mechanik.pracuj();
        mechanik.spedzajWolnyCzas();

    }
}
