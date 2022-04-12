package modificadores.demoProtected.p2;

import modificadores.demoProtected.p1.DemoProtected;

public class DemoProtectedEjecutar2 extends DemoProtected {

    public static void main(String[] args) {

        //tratando de acceder al método protected de otra clase
        DemoProtectedEjecutar2 demo = new DemoProtectedEjecutar2();
        demo.mostrar();
    }
}
