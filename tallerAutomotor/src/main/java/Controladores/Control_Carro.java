package Controladores;

import Acciones.Acciones;
import modelo.Carro;

import java.util.Scanner;

public class Control_Carro implements Acciones {
    Carro c = new Carro();

    public void crearCarro() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la marca del carro");
        String marca = sc.nextLine();
        c.setMarca(marca);

        System.out.println("Ingrese el modelo del carro");
        String modelo = sc.nextLine();
        c.setModelo(modelo);

        System.out.println("Ingrese el color del carro");
        String color = sc.nextLine();
        c.setColor(color);

        System.out.println("Ingrese la placa del carro");
        String placa = sc.nextLine();
        c.setPlaca(placa);


        System.out.println("Ingrese la velocidad maxima del carro");
        String velocidad = sc.nextLine();
        c.setVelocidadMaxima(velocidad);

        System.out.println("Ingrese la traccion del carro");
        String traccion = sc.nextLine();
        c.setTraccion(traccion);

        System.out.println("----------------------Pruebas-----------------------");
        arrancar();
        frenar();
        estacionar();
        direccion();

    }

    @Override
    public void arrancar() {
            System.out.println("El carro "+ c.getMarca()+ " acelero");

    }

    @Override
    public void frenar() {
        System.out.println("El carro "+ c.getMarca()+ " freno");
    }

    @Override
    public void direccion() {
        System.out.println("El carro " + c.getMarca()+ " giro");
    }

    @Override
    public void estacionar() {
        System.out.println("El carro " + c.getMarca()+ " se estaciono");
    }
}
