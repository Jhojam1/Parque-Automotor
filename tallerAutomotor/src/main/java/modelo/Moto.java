package modelo;

public class Moto extends Vehiculo{

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
    public double getCiliendraje() {
        return ciliendraje;
    }

    /**
     * @param ciliendraje the ciliendraje to set
     */
    public void setCiliendraje(double ciliendraje) {
        this.ciliendraje = ciliendraje;
    }
    
    private double kmActual;
    private double ciliendraje;

    public Moto() {
    }

    public Moto(double kmActual, double ciliendraje) {
        this.kmActual = kmActual;
        this.ciliendraje = ciliendraje;
    }

    public Moto(double kmActual, double ciliendraje, String marca, String modelo, String color, String placa, String motivoIngreso) {
        super(marca, modelo, color, placa, motivoIngreso);
        this.kmActual = kmActual;
        this.ciliendraje = ciliendraje;
    }
    
    
}
