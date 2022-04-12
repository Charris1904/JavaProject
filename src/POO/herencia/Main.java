package POO.herencia;

import POO.herencia.conHerencia.Empleado;
import POO.herencia.conHerencia.Estudiante;

public class Main {

    public static void main(String arg[]) {

        //Ejemplo sin usar Herencia
        /*Empleado empleadoSinHerencia = new Empleado();
        empleadoSinHerencia.setNombre("Maria");
        empleadoSinHerencia.setEdad(30);
        empleadoSinHerencia.setCargo("Salonera");
        empleadoSinHerencia.setEmpleadoID("ABC123");
        System.out.println(empleadoSinHerencia.getNombre() + " " + empleadoSinHerencia.getEdad()
                + " " + empleadoSinHerencia.getEmpleadoID() + " " + empleadoSinHerencia.getCargo());

        Estudiante estudianteSinHerencia = new Estudiante();
        estudianteSinHerencia.setNombre("Maria");
        estudianteSinHerencia.setEdad(17);
        estudianteSinHerencia.setCarnet("A47854");
        estudianteSinHerencia.setGrado(11);
        System.out.println(estudianteSinHerencia.getNombre() + " " + estudianteSinHerencia.getEdad()
                + " " + estudianteSinHerencia.getGrado() + " " + estudianteSinHerencia.getCarnet());*/

        //Ejemplo usando Herencia
        /*Empleado empleado = new Empleado();
        empleado.setCargo("Pintor");
        empleado.setEmpleadoID("PA123");
        empleado.setNombre("Pablo");
        System.out.println(empleado.getNombre() + " " + empleado.getEmpleadoID() + " " + empleado.getCargo());

        Estudiante estudiante = new Estudiante();
        estudiante.setCarnet("A71783");
        estudiante.setGrado(4);
        estudiante.setNombre("Marcos");
        System.out.println(estudiante.getNombre() + " " + estudiante.getCarnet() + " " + estudiante.getGrado());*/
    }
}
