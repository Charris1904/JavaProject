package package1.sesion2;

public class ContinueBreak {
    public static void main(String args[]) {

        /******************* BREAK *******************/

        /*for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Bucle completo.");*/

        /*boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    // Antes de break
                    System.out.println("Antes de la sentencia break");

                    if (t) {
                        break second;
                    }
                    System.out.println("Esto no se ejecutará 1.");
                }
                System.out.println("Esto no se ejecutará 2.");
            }

            // Después del bloque
            System.out.println("Esto es después del segundo bloque.");
        }*/


        /******************* CONTINUE *******************/

        for (int i = 0; i < 10; i++) {
            // Si el número es par omitir y continuar
            if (i % 2 == 0) {
                continue;
            }
            // Si el número es impar, imprímalo
            System.out.print(i + " ");
        }
    }
}
