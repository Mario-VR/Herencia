package Animals;

import java.sql.SQLOutput;

public class PetStore {
    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield", "Naranja", 5, "Gato");
        Dog firulais = new Dog("Firulais", "Manchado", 3, "Perro");
        Rooster claudio = new Rooster("Claudio", "Blanco con rojo", 1,"Gallo");

        System.out.println("Ejemplo de Polimorfismo:");
        System.out.println(garfield.talk());
        System.out.println(firulais.talk());
        System.out.println(claudio.talk());

    }


}
