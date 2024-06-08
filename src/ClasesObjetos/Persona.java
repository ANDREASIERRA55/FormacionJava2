package ClasesObjetos;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    //Atributos
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private int edad;

    //Constructor vació
    public Persona (){

    }
    //Constructor de copia
    public Persona (Persona p) {
        this.nombre = p.nombre;
        this.primerApellido = p.primerApellido;
        this.segundoApellido = p.segundoApellido;
        this.dni = p.dni;
        this.edad = p.edad;
    }
    //constructor de parámetros
    public Persona (String nombre, String primerA, String segundoA, String dni, int edad){
        this.nombre = nombre;
        this.primerApellido = primerA;
        this.segundoApellido = segundoA;
        this.dni = dni;
        this.edad = edad;
    }
    // Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }


    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = String.valueOf(dni);
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", primerApellido='").append(primerApellido).append('\'');
        sb.append(", segundoApellido='").append(segundoApellido).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Persona persona) {
        //TODO Auto-generate method stub
        return this.edad - persona.edad;
    }
}
