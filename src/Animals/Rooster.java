package Animals;

public class Rooster extends Animal {

    public Rooster(){
    }
    public Rooster(String name, String color, int age, String type) {
        super(name, color, age, type);
    }
    public String talk(){
        String a = "El animal " + this.getName() + " dice: Kikiriki ";
        return a;
    }
}