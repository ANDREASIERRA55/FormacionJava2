package herencia;

import ClasesObjetos.Persona;


public class Empleado extends Persona {
    private int antiguedad;
    private double salario;
    private String puesto;

    public Empleado(){

        super("Alex", "Muñoz", "121.345.678-L", "12345678", 25);
    }

    public int getAntiguedad() {

        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {

        this.antiguedad = antiguedad;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {

        this.puesto = puesto;
    }

    public void actualizarSalario(double incremento){

        salario = salario + incremento;
    }

    @Override
    public String toString(){
        return super.toString() + "Empleado [antiguedad=" + antiguedad + ", salario=" + salario + ", puesto=" + puesto;
    }


}
