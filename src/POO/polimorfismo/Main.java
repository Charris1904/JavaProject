package POO.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        perro.lamer();
        perro.sonido();
        //feed(perro);

        //Ejemplo de Polimorfismo
        Animal rufus = new Perro();
        rufus.sonido();
        //feed(rufus);

        rufus = new Gato();
        rufus.sonido();
        //((Gato) rufus).rasguñar();
        //feed(rufus);
    }

    public static void feed(Animal animal) {

        if (animal instanceof Perro) {
            System.out.println("dar comida de perro");
        } else if (animal instanceof Gato) {
            System.out.println("dar comida de gato");
        }
    }
}
