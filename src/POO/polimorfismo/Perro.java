package POO.polimorfismo;

public class Perro extends Animal {

    @Override
    public void sonido() {
        System.out.println("guau");
    }

    public void lamer() {
        System.out.println("lamer me encanta!");
    }
}
