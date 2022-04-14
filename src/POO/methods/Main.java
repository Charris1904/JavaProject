package POO.methods;

public class Main {

    public static void main(String arg[]) {

        Persona persona = new Persona();
        persona.setNombre("Kennia");
        persona.setEdad(35);

        Estudiante estudiante = new Estudiante();
        estudiante.llamarPersona(persona);
    }
}
