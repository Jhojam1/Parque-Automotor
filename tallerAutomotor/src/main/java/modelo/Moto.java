package modelo;

public class Moto extends Vehiculo{

    private double kmActual;
    private double cilindraje;

    public Moto() {
    }

    public Moto(double kmActual, double ciliendraje) {
        this.kmActual = kmActual;
        this.cilindraje = ciliendraje;
    }

    public Moto(String marca, String modelo, String color, String placa, String motivoIngreso, String velocidadMaxima, double kmActual) {
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

    /**
     * @return the ciliendraje
     */
    public double getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the ciliendraje to set
     */
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
