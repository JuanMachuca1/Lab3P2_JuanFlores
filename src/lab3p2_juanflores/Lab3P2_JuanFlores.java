
package lab3p2_juanflores;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;


public class Lab3P2_JuanFlores {
    static Scanner leer = new Scanner(System.in);
    static Scanner leer2 = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
       SimpleDateFormat fgh = new SimpleDateFormat("yyyy");
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
                    
                    String placa = null;
                    String marca;
                    String Modelo;
                    String tipoAuto;
                    Color color;
                    Date año;
                    String añito;
                    String Combustible;
                    int puertas=0;
                    String Transmision;
                    int asientos=0;
                   
                boolean placaValida=false;
                
                 while (!placaValida) {
                    System.out.print("Ingresa la placa del automovil (3 letras seguidas de 4 dígitos): ");
                    placa=leer2.next().toUpperCase();
                    
                    if (placa.length() == 7 && 
                       (placa.charAt(0)=='H') &&
                       esLetra(placa.charAt(1)) &&
                       esLetra(placa.charAt(2)) &&
                       esNumero(placa.charAt(3)) &&
                       esNumero(placa.charAt(4)) &&
                       esNumero(placa.charAt(5)) &&
                       esNumero(placa.charAt(6))) {
                       placaValida=true;
                       System.out.println("la placa es valida");
                     }else {
                     System.out.println("La placa no cumple con el formato especificado.");
                     }
                }    
                    System.out.println("Ingrese la marca del automovil: ");
                    marca=leer2.next();
                    System.out.println("Ingrese el modelo del automovil: ");
                    Modelo=leer2.next();
                    System.out.println("Ingrese el tipo del auto: ");
                    tipoAuto=leer2.next();
                    
                    color = JColorChooser.showDialog(null, "Color del dragon: ", Color.RED);
                    
                    
                    System.out.println("Ingrese el año del vehiculo");
                    añito= leer2.nextLine();
                    año = fgh.parse(añito);
                    
                    System.out.println("Ingrese el combustible de automovil: ");//super, diesel , regular
                    Combustible=leer2.next();
                    
                    System.out.println("Ingrese la cantidad de puertas: ");
                     puertas = leer.nextInt();
                    
                    while(puertas<0 || puertas==3 || puertas>4){
                        System.out.println("Ingrese una cantidad coherente de puertas: ");
                        puertas = leer.nextInt();
                    }
                    
                    System.out.println("Ingrese la transmision del automovil: [automatica o manual] ");
                    Transmision= leer2.next();
                    
                    System.out.println("Ingrese la cantidad de asientos: ");
                    asientos = leer.nextInt();
                    
                    while(asientos<0){
                        System.out.println("Ingrese la cantidad de asientos correcta: ");
                        asientos = leer.nextInt();
                    }
                    
                    Automovil au = new Automovil(Combustible, puertas, Transmision, asientos, placa, marca, Modelo, tipoAuto, color, año);
                    
                    vehiculos.add(au);
                    
                    System.out.println("automovil agregado correctamente ");
                 
                    System.out.println(vehiculos);
                    break;

                    
                case 2:
                {
                    
                }
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
    
    
 public static boolean esLetra(char c) {
        return (c >= 'A' && c <= 'Z');
    }
 
 public static boolean esNumero(char c) {
        return (c >= '0' && c <= '9');
    } 
}
