package creacionales.prototype;

public class Main {
    public static void main(String[] args) {
        Mascota boby = new Mascota();
        boby.setNombre("Boby");
        boby.setColor("Marron");
        boby.setRaza("Labrador");
        boby.setEdad(2);

        System.out.println(boby);

        try {
            Mascota clonBoby = boby.clonar();
            System.out.println("--------->Clon<----------");
            System.out.println(clonBoby);
        }catch (CloneNotSupportedException x){}
    }
}
