
package lab3p2_juanflores;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;


public class Lab3P2_JuanFlores {
    static Scanner leer = new Scanner(System.in);
    static Scanner leer2 = new Scanner(System.in);
    public static void main(String[] args) {
       
       ArrayList<Vehiculo> vehiculos = new ArrayList();
       
       boolean menu = true;
       
        while (menu) {            
            System.out.println("""
                               M E N U 
                               1.Agregar Vehiculo
                               2.Agregar Motocicleta
                               3.Agregar Autobus
                               4.Modificar Vehiculo
                               5.Eliminar Vehiculo
                               6.Mostrar Vehiculos
                               7.Generar Boleta
                               8.Salir
                               Ingrese una opcion:
                               """);
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    
                    String placa;
                    String marca;
                    String Modelo;
                    String tipoAuto;
                    Color color;
                    String Combustible;
                    int puertas=0;
                    String Transmision;
                    int asientos=0;
                    
                    System.out.println("Ingrese la placa del AutoMovil");
                    
                    
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3: 
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                    
                case 6:
                    
                    break;
                
                case 7:
                    
                    break;
                    
                case 8:
                    menu = false;
                    System.out.println("Saliste del Menu. Chaooo");
                    break;
                default:
                    System.out.println("opcion invalida...");
                break;
            }
        }
    }
    
}
