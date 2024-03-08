package modelo;

public class Carro extends Vehiculo{

    
    private double kmActual;

    public Carro() {
    }

    public Carro(double kmActual, double velocidadMax) {
        this.kmActual = kmActual;
    }

    public Carro(String marca, String modelo, String color, String placa, String motivoIngreso, String velocidadMaxima, double kmActual) {
        super(marca, modelo, color, placa, motivoIngreso, velocidadMaxima);
        this.kmActual = kmActual;
    }

    /**
     * @return the kmActual
     */
    public double getKmActual() {
        return kmActual;
    }

    /**
     * @param kmActual the kmActual to set
     */
    public void setKmActual(double kmActual) {
        this.kmActual = kmActual;
    }


    
}
