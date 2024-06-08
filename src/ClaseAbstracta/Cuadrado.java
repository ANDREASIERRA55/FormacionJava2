package ClaseAbstracta;

import java.lang.management.MemoryType;

public class Cuadrado extends FiguraGeometrica {

    private final int NUM_LADOS = 4;
    private  double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        //TODO Auto-generate method stub
        double area = Math.pow(lado, 2);
        return  area;
    }
    @Override
    public  double calcularPerimetro(){
        //TODO Auto-generate method stud
        double perimetro = lado * NUM_LADOS;
        return perimetro;
    }

}
