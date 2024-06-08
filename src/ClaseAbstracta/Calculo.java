package ClaseAbstracta;


public class Calculo{

    private  final static double LADO_CUADRADO = 2.0;
    public static void  main(String[]args){
        //Crear una instacia de tipo cuadrado
        Cuadrado cuadrado = new Cuadrado();

        cuadrado.setLado(LADO_CUADRADO);

        System.out.println("El area del cuadrado es " + cuadrado.calcularArea());
        System.out.println("El perimetro cuadrado es " + cuadrado.calcularPerimetro());
    }
}


