package AbstractAnimal;

public class PetStore {
    public static void main (String[] args) {
        Cat garfield = new Cat("Garfield", "Naranja" , 6);
        Cat felix = new Cat ("Felix", "Blanco", 5);
        Dog  peluchin = new Dog("Peluchin", "Blanco" , 5);
        Rooster eduardo = new Rooster ("Rooster", "Rojo" , 2);

        System.out.println("< Ejemplo de polimorfismo usando clases abstractas  >" );
        System.out.println("Invocando al metodo toString: " );
        System.out.println(garfield.toString());
        System.out.println(felix.toString());
        System.out.println(peluchin.toString());
        System.out.println(eduardo.toString());

    }

}