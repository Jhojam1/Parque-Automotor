package Controladores;

import modelo.Carro;

import java.util.Scanner;

public class Control_Carro {
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

        System.out.println("Ingrese el motivo de ingreso del carro al taller");
        String motivo = sc.nextLine();
        c.setMotivoIngreso(motivo);

        System.out.println("Ingrese la velocidad maxima del carro");
        String velocidad = sc.nextLine();
        c.setVelocidadMaxima(velocidad);

        System.out.println("Ingrese los km actuales del carro");
        double km = sc.nextDouble();
        c.setKmActual(km);


    }

    public void acelerarCarro(){
        System.out.println("El carro "+ c.getMarca()+ " acelero");
    }

    public void frenarCarro(){
        System.out.println("El carro "+ c.getMarca()+ " freno");
    }

    public void estacionarCarro(){
        System.out.println("El carro " + c.getMarca()+ " se estaciono");
    }

    public void direccionCarro(){
        System.out.println("El carro " + c.getMarca()+ " giro");
    }
}
