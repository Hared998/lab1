package zad6;

public class Pracownik {
    private SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    private Dojezdzac dojezdzac;
    private Pracowac pracowac;
    String zawod;
    String imie;
    public Pracownik( Pracowac pracowac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu, Dojezdzac dojezdzac, String zawod, String imie)
    {
        this.pracowac = pracowac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
        this.dojezdzac = dojezdzac;
        this.zawod = zawod;
        this.imie = imie;
        System.out.println("Dodano pracownika: " + imie + ", " + zawod);
    }
    public void dojezdaj (){
        dojezdzac.dojezdzaj();
    }
    public void pracuj (){
        pracowac.pracuj();
    }
    public void spedzajWolnyCzas (){
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }
}
