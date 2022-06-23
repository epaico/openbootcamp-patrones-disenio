package creacionales.builder;

public class Vehiculo {
    private String marca;
    private String motor;
    private String tipo;
    private int puertas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", motor='" + motor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
