package herencia;

public class Comercial extends Empleado{

    private double comision;

    public Comercial(){

    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    public void calcularComision(double incComision){
        comision = comision + incComision;
    }
    public void calcularComision(double incComision, double plus){
        comision = comision + incComision + plus;
    }
    @Override
    public void actualizarSalario(double incremento){
        double salarioActual = this.getSalario();

        if (this.getAntiguedad()<=5){
            calcularComision(25.0);
        }else {
            calcularComision(25.0,100.0);
        }
        double nuevaComision = comision;
        this.setSalario(salarioActual + incremento + nuevaComision);
    }

}
