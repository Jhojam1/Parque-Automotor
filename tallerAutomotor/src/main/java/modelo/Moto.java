package modelo;

public class Moto extends Vehiculo{

    private double cilindraje;

    public Moto() {
    }

    public Moto( double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Moto(String marca, String modelo, String color, String placa, String velocidadMaxima, double kmActual) {
        super(marca, modelo, color, placa, velocidadMaxima);
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
