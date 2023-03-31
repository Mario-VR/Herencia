public class Teacher extends Person  {
    private String adscription;
    private int biocard;
    private int assigned_Hours;
    public Teacher() {
    }

    public Teacher(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);


    }
    public Teacher(String name, String lastName, String email, String address, String adscription, int biocard, int assigned_Hours) {
        super(name, lastName, email, address);
        this.adscription = adscription;
        this.biocard = biocard;
        this.assigned_Hours = assigned_Hours;
    }
    public String getAdscription() {
        return adscription;
    }
    public void setAdscription(String adscription) {
        this.adscription = adscription;
    }
    public int getBiocard() {
        return biocard;
    }
    public void setBiocard(int biocard) {
        this.biocard = biocard;
    }
    public int getAssigned_Hours() {
        return assigned_Hours;
    }
    public void setAssigned_Hours(int assigned_Hours) {
        this.assigned_Hours = assigned_Hours;
    }

    public String toString( ){
        String texto = "Maestro: " + this.getName() + "" + this.getLastName() + "\nCorreo electronico: " + this.getEmail() + "\nDireccion del maestro: "+ this.getAddress() + "\nBiocard" + getBiocard() + "\nHoras asignadas: " + this.getAssigned_Hours();
        return texto;
    }
    public String soy(){
        return "una persona y un Maestro";
    }
}


