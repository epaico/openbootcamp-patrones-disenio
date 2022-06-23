package creacionales.singleton;

public class Main {
    public static void main(String[] args) {

        Aplicacion app1 = Aplicacion.getInstance();
        app1.run();

        Aplicacion app2 = Aplicacion.getInstance();
        app2.run();

        System.out.println(app1 + "|" + app2);
    }
}
