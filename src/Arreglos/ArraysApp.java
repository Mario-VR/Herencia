package Arreglos;

import java.util.Scanner;
public class ArraysApp {
    public static boolean AnimalExists(String animal,String[] zoo){
        for (int i = 0; i < zoo.length;i++){
            if (zoo[i].equals(animal)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] zoo = new String[3];
        Scanner sc=new Scanner(System.in);
        String animal="Leon";
        //read zoo animal
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un animal en la jaula: " + (i+1));
            zoo[i] = sc.nextLine();
        }
        //show animals
        System.out.println("Estos son los animales del zoo: ");
        for (int i = 0; i < zoo.length;i++){
            System.out.println(zoo[i]);
        }
        if(AnimalExists(animal,zoo)){
            System.out.println("Si hay un :"+animal);
        }else {
            System.out.println("No hay un: "+animal);

        }
    }
}