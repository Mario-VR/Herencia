package Animals;

public class Animal {
    private String name;
    private String color;
    private int age;
    private String type;


    //Mario Hasinm Zarek Vega Rosendo//

    public Animal() {
    }

    public Animal(String name, String color, int age, String type) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String talk(){
        String a = "El animal " + this.getName() + " dice: ";
        return a;
    }




}