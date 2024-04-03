package zad3;

public class car {
    private String name;
    private SpeedBehaviour speedBehaviour;

    public car (SpeedBehaviour speedBehaviour, String name)
    {
        this.speedBehaviour = speedBehaviour;
        this.name = name;
    }
    public int GetVMax(){
        return speedBehaviour.GetSpeed();
    }
    public String GetCarName(){
        return name;
    }


}
