package POO.methods.overriding;

import POO.methods.overloading.Suma;

public class Main {

    public static void main(String arg[]) {

        Padre obj1 = new Padre();
        obj1.show();

        Hijo obj2 = new Hijo();
        obj2.show();
    }
}
