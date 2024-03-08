package modelo;

public class Carro extends Vehiculo{

    
    private String traccion;

    public Carro() {
    }

    public Carro(String traccion) {
        this.traccion = traccion;
    }

    public Carro(String marca, String modelo, String color, String placa, String velocidadMaxima, String traccion) {
        super(marca, modelo, color, placa , velocidadMaxima);
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
