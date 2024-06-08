package ClasesObjetos;

import java.util.Scanner;

public class AppPersonas {
    public static void main(String[]args){
        //Crear un obj de tipo scanner
        Scanner consola = new Scanner(System.in);

        //Crear una instancia de tipo persona
        Persona individuo = new Persona("Alex", "Muñoz", "Muñoz", "1234567L", 25);

        //Dar valores a nuestros distintos atributos
        System.out.println("introduce un Nombre");
        individuo.setNombre(consola.next());
        System.out.println("Primer Apellido");
        individuo.setPrimerApellido(consola.next());
        System.out.println("Segundo Apellido");
        individuo.setSegundoApellido(consola.next());
        System.out.println("DNI");
        individuo.setDni(consola.nextInt());
        System.out.println("Edad");
        individuo.setEdad(consola.nextInt());

        //Mostrar la información de nuestro obj
        System.out.println(individuo);





    }
}
