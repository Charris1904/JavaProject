package package1.sesion2.ejercicios;

/**
 * Pide 2 números y muestra cual es el mayor, el menor, o si son iguales
 */
public class MayorMenor {
    public static void main(String[] args) {

        int x=0;
        int num1 = 3;
        int num2 = 5;

        if (num1 == num2) {
            System.out.println("Son iguales");
        } else if (num1 > num2) {
            System.out.println("El mayor es : " + num1);
        } else {
            System.out.println("El mayor es : " + num2);
        }
    }
}
