package claseGenerica;

public class DemoOperaciones {
    public static void main(String[] args) {
        //TODO auto-generate method stub
        Operaciones<Integer> opI = new Operaciones<Integer>();
        System.out.println("La suma es " + opI.suma(5));
        System.out.println("La resta es" + opI.resta(5));
        System.out.println("La multiplicación es " + opI.producto(5));
        System.out.println("La división es" + opI.division(5));

        Operaciones<Double> opD = new Operaciones<Double>();
        System.out.println("La suma es "  + opD.suma(12.34));
        System.out.println("La resta es "  + opD.resta(12.34));
        System.out.println("La multiplicación es "  + opD.producto(12.34));
        System.out.println("La división es "  + opD.division(12.34));

    }


}
