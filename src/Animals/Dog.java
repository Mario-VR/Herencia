package Animals;

public class Dog extends Animal {

    public Dog(){
    }
    public Dog(String name, String color, int age, String type) {
        super(name, color, age, type);
    }
    public String talk(){
        String a = "El animal " + this.getName() + " dice: Guauuu";
        return a;
    }

}