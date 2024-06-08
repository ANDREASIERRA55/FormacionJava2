package herencia;

public class Empresa {
    public static void main(String[]args){
        //Crear una instancia de tipo empleado
        Empleado empleado = new Empleado();

        empleado.setNombre("Andrea");
        empleado.setPrimerApellido("Sierra");
        empleado.setSegundoApellido("Pardo");
        empleado.setDni(5405773L);
        empleado.setEdad(40);
        empleado.setAntiguedad(1);
        empleado.setPuesto("Jefe");
        empleado.setSalario(1800.0);

        System.out.println(empleado);

        empleado.actualizarSalario(150.0);

        System.out.println(empleado);
    }
}
