package package1.sesion2.ejercicios;

/**
 * Pide un número y muestra si es positivo o negativo y si es par o impar
 */
public class ParImpar {
    public static void main(String[] args) {

        int numero = 3;

        if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo");
        } else {
            System.out.println("El numero " + numero + " es positivo");
        }
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

    }
}
