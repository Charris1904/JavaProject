package POO.encapsulacion;

public class Main {

    public static void main(String arg[]) {

        //Instancia de clase persona
        Persona persona = new Persona();

        //Ejemplo usando variable
        /*persona.nombre = "John";
        System.out.println(persona.nombre);*/

        //Ejemplo usando metodo set/get
        persona.setNombre("John");
        System.out.println(persona.getNombre());
    }
}
