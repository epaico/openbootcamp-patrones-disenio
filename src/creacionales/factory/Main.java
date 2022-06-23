package creacionales.factory;

public class Main {
    public static void main(String[] args) {
        LadosFactory lf1 = new LadosFactory("cuadrado");
        System.out.println("el numero de lados es : " + lf1.getNumeroLados());

        LadosFactory lf2 = new LadosFactory("triangulo");
        System.out.println("el numero de lados es : " + lf2.getNumeroLados());
    }
}
