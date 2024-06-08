package ClasesObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListadoPersonas {
    public static void main (String[]args){
        //TODO Auto-generate method stub
        Persona alex = new Persona("Alex","Muñoz","Velasco","1234567L",25);
        Persona ana = new Persona("Ana","Gil","Gil","0111213M",25);
        Persona erik = new Persona("Erik","Muñoz","Velasco","2345678S",34);
        Persona sara = new Persona("Sara","Sanz","Perez","4151623D",48);

        List<Persona>listadoPersonas = new ArrayList<Persona>();
        listadoPersonas.add(alex);
        listadoPersonas.add(ana);
        listadoPersonas.add(erik);
        listadoPersonas.add(sara);

        for (Persona persona: listadoPersonas){
            System.out.println(persona);
        }

        Collections.sort(listadoPersonas);
        for (Persona persona: listadoPersonas ){
            System.out.println(persona);
        }
    }
}


