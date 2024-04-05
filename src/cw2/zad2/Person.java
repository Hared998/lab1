package cw2.zad2;

public class Person {
    private language lang;

    private String name;

    public Person(String name, language lang){
        this.name = name;
        this.lang = lang;
    }
    public String getLanguage(){
        return lang.typeLanguage();
    }
    public String getName() {
        return this.name;
    }
}
