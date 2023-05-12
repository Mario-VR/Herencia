package Arreglos;

import java.security.SecureRandom;

public class Volado {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();


        int lanzamiento;

        int [] volado = new int[3];
        final int AQUILA = 1;
        final int SOL = 2;
        final int LANZAMIENTOS = 100;


        volado [AQUILA]= 0;
        volado [SOL]= 0;

        for (int i = 0; i < LANZAMIENTOS; i ++) {
            lanzamiento=random.nextInt(2)+1;
            volado[lanzamiento]=volado[lanzamiento]+1;

            /*
            if (lanzamiento==AQUILA) {
                volado[AQUILA] += 1;
            }
                if(lanzamiento==SOL){
                    volado[SOL]+=1;
                }*/

        }
        System.out.println("Cayo: " + volado[AQUILA] + " veces Aguila");
        System.out.println("Cayo: " + volado[SOL] + " veces Sol");
    }
}
