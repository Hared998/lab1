package zad3;

public class carMain {
    public static void main(String[] args) {
        car lambo = new car(new HighSpeed(), "Lambo");
        car maluch = new car(new LowSpeed(), "Maluch");
        car audi = new car(new MediumSpeed(), "Audi");
        System.out.println("Nasz samochód: " + lambo.GetCarName() + ", Posiada VMAX: " + lambo.GetVMax() +"KM/h");
        System.out.println("Nasz samochód: " + maluch.GetCarName() + ", Posiada VMAX: " + maluch.GetVMax() +"KM/h");
        System.out.println("Nasz samochód: " + audi.GetCarName() + ", Posiada VMAX: " + audi.GetVMax() +"KM/h");


    }
}