import org.w3c.dom.ls.LSOutput;

public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student("Juan", "Perez", "juanpi@gmail", "conocido en iguala, Gro" );

        Teacher teacher1 = new Teacher("Maria", "Morales", "maria@gmail.com", "Ruffo figeroa");

        System.out.println("El nombre del estuden es: "+ student1.getName() + " " + student1.getLastName());
        System.out.println("El nombre del maestro es: "+ teacher1.getName() + " " + teacher1.getLastName());

        student1.setControlNumber(123456789);
        System.out.println("El numero de control de "+ student1.getName() + " es: "+ student1.getControlNumber());


        //probando la sobrecarga de metodos//
        System.out.println("\nMetodo tostring() de Student1: \n" + student1.toString());
        System.out.println("\nMetodo tostring() de teacher1: " + teacher1.toString());

        System.out.println("El Student: " + student1.soy());
        System.out.println("El Teacher: " + teacher1.soy());
    }


}
