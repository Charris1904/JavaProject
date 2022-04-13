package POO.methods.overloading;

//Ejemplo de Overloading
public class Suma {

    //Metodo suma con dos parametros - todos tipo int
    public int suma(int x, int y) {
        return (x + y);
    }

    //Metodo suma con tres parametros - todos tipo int
    public int suma(int x, int y, int z) {
        return (x + y + z);
    }

    //Metodo suma con dos parametros - todos tipo double
    public double suma(double x, double y) {
        return (x + y);
    }
}
