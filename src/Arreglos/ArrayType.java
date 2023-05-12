package Arreglos;

public class ArrayType {
    public static void main(String[] args) {
            String [] bugs = {"cricket", "beetle", "ladybug"};
            String [] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(bugs.toString()); // [Ljava.lang.String;@4dd8dc3
        System.out.println(bugs[0]);
        System.out.println(bugs[1]);
        System.out.println(bugs[2]);
        System.out.println("\n");
        for (int i=0; i<bugs.length; i++){
            System.out.println(bugs[i]);

        }
    }
}
