package creacionales.singleton;

public class Aplicacion {

   private static Aplicacion aplicacion;
   private boolean running = false;

   private Aplicacion(){}

    public static Aplicacion getInstance(){
       if (aplicacion == null){
           aplicacion = new Aplicacion();
       }
       return  aplicacion;
    }

    public void run(){
       if (running){
           System.out.println("Applicacion ya esta Iniciado");
       }else {
           System.out.println("Aplicacion iniciando");
           running= true;
       }
    }

}
