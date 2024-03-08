package Controladores;

import Acciones.Acciones;
import modelo.Moto;

import java.util.Scanner;

public class Control_Moto implements Acciones {
    Moto m = new Moto();
    public void crearMoto() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la marca de la moto");
        String marca = sc.nextLine();
        m.setMarca(marca);

        System.out.println("Ingrese el modelo de la moto");
        String modelo = sc.nextLine();
        m.setModelo(modelo);

        System.out.println("Ingrese el color de la moto");
        String color = sc.nextLine();
        m.setColor(color);

        System.out.println("Ingrese la placa de la moto");
        String placa = sc.nextLine();
        m.setPlaca(placa);


        System.out.println("Ingrese la velocidad maxima de la moto");
        String velocidad = sc.nextLine();
        m.setVelocidadMaxima(velocidad);

        System.out.println("Ingrese el cilindraje de la moto");
        double cilindraje = sc.nextDouble();
        m.setCilindraje(cilindraje);

        System.out.println("----------------------Pruebas-----------------------");
        arrancar();
        frenar();
        estacionar();
        direccion();

    }
    @Override
    public void arrancar() {
        System.out.println("La moto "+ m.getMarca()+ " acelero");

    }

    @Override
    public void frenar() {
        System.out.println("La moto "+ m.getMarca()+ " freno");
    }

    @Override
    public void direccion() {
        System.out.println("La moto " + m.getMarca()+ " giro");
    }

    @Override
    public void estacionar() {
        System.out.println("La moto " + m.getMarca()+ " se estaciono");
    }
}
