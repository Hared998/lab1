package cw2.zad1;

public class MainRPG {
    public static void main(String[] args) {


        Char arthur = new Char(50,"Arthur", new Knight());
        Char stefan = new Char(60, "Stefan", new Archer());

        arthur.giveDamage(stefan);
        stefan.giveDamage(arthur);
        arthur.giveDamage(stefan);
        stefan.giveDamage(arthur);

    }

}
