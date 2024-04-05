package cw2.zad1;

public class Char {
    private Weapon weapon;
    private int curhealth;
    private int maxhealth;
    private String name;

    public Char(int maxhealth, String name, Weapon weapon){
        this.curhealth = maxhealth;
        this.maxhealth = maxhealth;
        this.name = name;
        this.weapon = weapon;
    }
    public void giveDamage(Char enemy){
        if(curhealth > 0) {
            System.out.println(this.name + " attack: " + enemy.name);
            enemy.takeDamage(weapon.getDamage());
        }
        else{
            System.out.println(this.name + " you are dead you cant fight!");
        }
    }
    private void takeDamage(int damage)
    {
        System.out.println(this.name +" took " + damage);
        curhealth=-damage;

        if(curhealth <= 0){
            System.out.println(this.name + " is dead");
        }
        else {
            System.out.println(this.name + " " + curhealth + " health left");
        }
    }
}
