package package1.sesion1.ejercicios;

/**
 * Calcule el promedio de las notas de un alumno,
 * solicitar el nombre del alumno y las notas de las 3 evaluaciones.
 * El promedio de la evaluacion final seria la suma de las 3 evaluaciones entre 3
 */
public class Notas {

    public static void main(String[] args) {

        String nombre_alumno = "Angela";
        double evaluacion1 = 50;
        double evaluacion2 = 80;
        double evaluacion3 = 70;
        double evaluacion_final;

        System.out.println("Nombre alumno: ");
        System.out.println("Nota primera evaluación: " + evaluacion1);
        System.out.println("Nota segunda evaluación: " + evaluacion2);
        System.out.println("Nota tercera evaluación: " + evaluacion3);

        evaluacion_final = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
        System.out.println("La nota media de " + nombre_alumno + " es " + evaluacion_final);
    }
}
