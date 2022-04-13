package POO.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        perro.lamer();
        perro.sonido();

        //Ejemplo de Polimorfismo
        Animal rufus = new Perro();
        rufus.sonido();

        rufus = new Gato();
        rufus.sonido();
    }
}
