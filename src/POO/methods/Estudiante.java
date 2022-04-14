package POO.methods;

public class Estudiante {

    private String carnet;

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void llamarPersona(Persona persona) {
        System.out.println("Llamando a " + persona.getNombre()
                + " " + persona.getEdad());
    }
}
