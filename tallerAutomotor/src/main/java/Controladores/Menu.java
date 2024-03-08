package Controladores;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public void menu(){
        int menu = 0;

        do{


            System.out.println("""
                    ----------------Bienvenido al taller Raul Reyes----------------
                    Indique que desea hacer:
                    
                    1.Crear Carro
                    2.Crear Moto
                    3.Pruebas de ruta
                    """);
            System.out.println("Ingrese la opcion");
            menu = sc.nextInt();
            opcionesMenuPrincipal(menu);
        }while (menu >3);
    }


    public void menuPruebas(){
        int menup = 0;
        do{
            System.out.println("""
                    
                    ----------------PRUEBAS DE TALLER----------------
                    Indique que desea hacer:
                    
                    1.Acelerar
                    2.Frenar
                    3.Estacionar
                    4.Direccionar
                    
                    """);
            System.out.println("Ingrese la opcion");
            menup = sc.nextInt();
            opcionesMenuPruebas(menup);
        }while (menup >4);
    }

    public void opcionesMenuPrincipal(int opcion){
        switch (opcion){
            case 1:
                Control_Carro cc = new Control_Carro();
                cc.crearCarro();
                break;
            case 2:
                System.out.println("Proximamente");
                break;
            case 3:
                menuPruebas();
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
    }

    public void opcionesMenuPruebas(int opcion){
        Control_Carro cc = new Control_Carro();
        switch(opcion){
            case 1:
                cc.acelerarCarro();
                break;
            case 2:
                cc.frenarCarro();
                break;
            case 3:
                cc.estacionarCarro();
                break;
            case 4:
                cc.direccionCarro();
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
    }
}
