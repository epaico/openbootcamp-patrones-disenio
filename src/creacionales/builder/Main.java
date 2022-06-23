package creacionales.builder;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new CocheBuilder("Nissan")
                .setPuertas(5)
                .setMotor("Diesel")
                .setTipo("Combustion")
                .build();
        System.out.println(vehiculo);
    }
}
