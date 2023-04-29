package Animals;

public class Cat extends Animal {

    public Cat(){
    }

    public Cat(String name, String color, int age, String type) {
        super(name, color, age, type);
    }
    public String talk(){
        String a = "El animal " + this.getName() + " dice: Miauuu";
        return a;
    }

}
