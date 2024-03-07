package modelo;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private String motivoIngreso;

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the motivoIngreso
     */
    public String getMotivoIngreso() {
        return motivoIngreso;
    }

    /**
     * @param motivoIngreso the motivoIngreso to set
     */
    public void setMotivoIngreso(String motivoIngreso) {
        this.motivoIngreso = motivoIngreso;
    }

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, String placa, String motivoIngreso) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.motivoIngreso = motivoIngreso;
    }
    
    
    
}
