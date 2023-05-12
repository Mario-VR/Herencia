package Arreglos;

import java.util.*;

public class Sumatorias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int sumatoria=0;
        double media = 0;
        int[] array = new int[6];
        int [] ordenados=array;


        for (int i = 0; i < array.length; i++) {

            System.out.println("Ingrese el numero: ");


            array[i]=sc.nextInt();
        }

        System.out.println("Los numeros del vector son:");
        for (int i = 0; i < array.length; i++) {

            System.out.println(" [ "+array[i]+" ] ");

            sumatoria+=array[i];

        }
        Arrays.sort(ordenados);
        System.out.println("Los numeros ordenados son: "+Arrays.toString(ordenados));
        System.out.println("La suma de los numeros es: "+sumatoria);

        media = (double) sumatoria / array.length;
        System.out.println("La media de la sumatoria es: "+media);

        double mediana = (ordenados[ordenados.length/2]+ordenados[(ordenados.length/2)-1])/2;

        System.out.println("La mediana de la sumatoria es: "+mediana);

    } /* SORT   facilita la clasificacion de un arreglo*/
}