package package1.sesion1.ejercicios;

/**
 * Pide 2 números y muestra cual si el
 * mayor, el menor, o si son iguales
 */
public class MayorMenor {

    public static void main(String arg[]) {
        int num1 = 5;
        int num2 = 9;

        System.out.println("Numero 1 es mayor a Numero 2? " + (num1 > num2));
        System.out.println("Numero 1 es menor a Numero 2? " + (num1 < num2));
        System.out.println("Numero 1 es igual a Numero 2? " + (num1 == num2));
    }
}
