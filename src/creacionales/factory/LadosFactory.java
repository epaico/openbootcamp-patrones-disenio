package creacionales.factory;

public class LadosFactory {

    private Lados lados;

    private LadosFactory(){}

    public LadosFactory(String nombre){
        if (nombre.equalsIgnoreCase("triangulo")){
            lados = new Triangulo();
        }else if(nombre.equalsIgnoreCase("cuadrado")) {
            lados = new Cuadrado();
        }
    }

    public int getNumeroLados() {
        if (lados != null){
            return lados.getNumeroLados();
        }
        return 0;
    }
}
