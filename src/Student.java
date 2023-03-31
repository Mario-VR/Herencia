public class Student  extends Person{

    private int controlNumber;
    private String career;
    private double generalAverage;

    public Student() {
    }
    public Student(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }
    public Student(String name, String lastName, String email, String address, int controlNumber, String career, double generalAverage) {
        super(name, lastName, email, address);
        this.controlNumber = controlNumber;
        this.career = career;
        this.generalAverage = generalAverage;
    }
    public int getControlNumber() {
        return controlNumber;
    }
    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }
    public String getCareer() {
        return career;
    }
    public void setCareer(String career) {
        this.career = career;
    }
    public double getGeneralAverage() {
        return generalAverage;
    }
    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }

    //sobrecargando un metodo (toString)(ya existe pero le cambiamos un poquito)//
    public String toString( ){
        String texto = "Alumno: " + this.getName() + "\nNumero de control: " + this.getControlNumber() + ",\nCorreo electronico: "+ this.getEmail() + "\nDireccion " + getAddress() + "\nCarrera:" + this.getCareer();
        return texto;
    }

    public String soy(){
        return "Soy una Persona y un Estudiante";
    }

}
