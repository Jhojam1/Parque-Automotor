package modelo;

public class Carro extends Vehiculo{

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

    /**
     * @return the velocidadMax
     */
    public double getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * @param velocidadMax the velocidadMax to set
     */
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    private double kmActual;
    private double velocidadMax;

    public Carro() {
    }

    public Carro(double kmActual, double velocidadMax) {
        this.kmActual = kmActual;
        this.velocidadMax = velocidadMax;
    }

    public Carro(double kmActual, double velocidadMax, String marca, String modelo, String color, String placa, String motivoIngreso) {
        super(marca, modelo, color, placa, motivoIngreso);
        this.kmActual = kmActual;
        this.velocidadMax = velocidadMax;
    }
    
    
    
}
