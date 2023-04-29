package AbstractAnimal;

public class Cat extends Animal {
    public Cat() {

    }


    public Cat(String name, String color, int age) {
        super(name, color, age);

    }

    @Override
    public String talk() {
        return "Miau";

    }

    @Override //nos ayuda a observar que esta clase esta sobre escrita
    public String toString() {
        return super.name + " es un gato" +
                " de color " + super.color +
                " tiene " + super.age + " años " +
                " y dice " + this.talk();
    }
}