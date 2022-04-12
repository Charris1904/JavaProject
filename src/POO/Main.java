package POO;

public class Main {

    public static void main(String arg[]) {

        //Instancia
        Animal perro = new Animal();
        Animal gato = new Animal();

        //Cambio atributos
        perro.nombre = "Pancho";
        perro.edad = 4;

        gato.nombre = "Paco";
        gato.edad = 3;

        //Llamado de funciones
        perro.comer("Pancho");
        perro.caminar("Kimbo");
        gato.caminar(gato.nombre);
        System.out.println(perro.getClass());
    }
}
