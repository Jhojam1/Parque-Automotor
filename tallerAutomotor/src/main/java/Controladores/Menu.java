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
             
                    """);
            System.out.println("Ingrese la opcion");
            menu = sc.nextInt();
            opcionesMenuPrincipal(menu);
        }while (menu >2);
    }




    public void opcionesMenuPrincipal(int opcion){
        switch (opcion){
            case 1:
                Control_Carro cc = new Control_Carro();
                cc.crearCarro();
                break;
            case 2:
                Control_Moto cm = new Control_Moto();
                cm.crearMoto();
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
    }
}
