package POO.methods.overloading;

public class Main {

    public static void main(String arg[]) {

        Suma s = new Suma();
        System.out.println(s.suma(10, 20));
        System.out.println(s.suma(10, 20, 30));
        System.out.println(s.suma(10.5, 20.5));
    }
}
