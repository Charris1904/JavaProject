package package1.sesion1.ejercicios;

/**
 * Calcular el sueldo de un trabajador
 * Solicitar el numero de horas que ha trabajado en un mes,
 * y calcular el sueldo si la hora vale $10.
 */
public class Sueldo {

    public static void main(String[] args) {

        int horas = 10;
        int sueldo = 0;

        sueldo = horas * 10;
        System.out.println("El sueldo de este mes es de: " + sueldo + "$");
    }
}
