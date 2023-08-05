
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
                    
                    color = JColorChooser.showDialog(null, "Color del auto: ", Color.RED);
                    
                    
                    System.out.println("Ingrese el año del vehiculo");
                    añito= leer2.next();
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
                 
                   
                    break;

                    
                case 2:
                
                   String placaM = null;
                    String marcaM;
                    String ModeloM;
                    String tipoAutoM;
                    Color colorM;
                    Date añoM;
                    String añitoM;
                    int velocidadMax=0;
                    int pesoM=0;
                    int consumoCombustible=0;
                   
                boolean placaValidaM=false;
                
                 while (!placaValidaM) {
                    System.out.print("Ingresa la placa del automovil (3 letras seguidas de 4 dígitos): ");
                    placaM=leer2.next().toUpperCase();
                    
                    if (placaM.length() == 7 && 
                       (placaM.charAt(0)=='B') &&
                       esLetra(placaM.charAt(1)) &&
                       esLetra(placaM.charAt(2)) &&
                       esNumero(placaM.charAt(3)) &&
                       esNumero(placaM.charAt(4)) &&
                       esNumero(placaM.charAt(5)) &&
                       esNumero(placaM.charAt(6))) {
                       placaValidaM=true;
                       System.out.println("la placa es valida");
                     }else {
                     System.out.println("La placa no cumple con el formato especificado.");
                     }
                }    
                    System.out.println("Ingrese la marca del automovil: ");
                    marcaM=leer2.next();
                    System.out.println("Ingrese el modelo del automovil: ");
                    ModeloM=leer2.next();
                    System.out.println("Ingrese el tipo del auto: ");
                    tipoAutoM=leer2.next();
                    
                    colorM = JColorChooser.showDialog(null, "Color de la moto: ", Color.RED);
                    
                    
                    System.out.println("Ingrese el año del vehiculo");
                    añitoM= leer2.next();
                    añoM = fgh.parse(añitoM);
                    
                    System.out.println("Ingrese la velocidad maxima de la moto ");
                    velocidadMax=leer.nextInt();
                    
                    while(velocidadMax<0){
                        System.out.println("Ingrese la velocidad maxima de la moto ");
                        velocidadMax = leer.nextInt();
                    }
                    
                    System.out.println("Ingrese el peso de la moto :  ");
                     pesoM = leer.nextInt();
                     
                    while(pesoM<0){
                        System.out.println("Ingrese una cantidad coherente de puertas: ");
                        pesoM = leer.nextInt();
                    }
                    
                                                          
                    System.out.println("Ingrese el consumo de combustible de la moto: ");
                    consumoCombustible = leer.nextInt();
                    
                    while(consumoCombustible<0){
                        System.out.println("Ingrese una cantidad coherente de puertas: ");
                        consumoCombustible = leer.nextInt();
                    }
                    
                    
                    Motocicleta moto = new Motocicleta(velocidadMax, pesoM, consumoCombustible, placaM, marcaM, ModeloM, tipoAutoM, colorM, añoM);
                    vehiculos.add(moto);
                    
                    System.out.println("motocicleta agregado correctamente ");
                 
                   
                    break;
                    
                case 3: 
                
                    String placaB = null;
                    String marcaB;
                    String ModeloB;
                    String tipoAutoB;
                    Color colorB;
                    Date añoB;
                    String añitoB;
                    int capacidadpasajeros=0;
                    int numEjes=0;
                    int longitud=0;
                    
                   
                boolean placaValidaB=false;
                
                 while (!placaValidaB) {
                    System.out.print("Ingresa la placa del automovil (3 letras seguidas de 4 dígitos): ");
                    placaB=leer2.next().toUpperCase();
                    
                    if (placaB.length() == 7 && 
                       (placaB.charAt(0)=='H') &&
                       esLetra(placaB.charAt(1)) &&
                       esLetra(placaB.charAt(2)) &&
                       esNumero(placaB.charAt(3)) &&
                       esNumero(placaB.charAt(4)) &&
                       esNumero(placaB.charAt(5)) &&
                       esNumero(placaB.charAt(6))) {
                       placaValidaB=true;
                       System.out.println("la placa es valida");
                     }else {
                     System.out.println("La placa no cumple con el formato especificado.");
                     }
                }    
                    System.out.println("Ingrese la marca del automovil: ");
                    marcaB=leer2.next();
                    System.out.println("Ingrese el modelo del automovil: ");
                    ModeloB=leer2.next();
                    System.out.println("Ingrese el tipo del auto: ");
                    tipoAutoB=leer2.next();
                    
                    colorB = JColorChooser.showDialog(null, "Color del bus: ", Color.RED);
                    
                    
                    System.out.println("Ingrese el año del vehiculo");
                    añitoB= leer2.next();
                    añoB = fgh.parse(añitoB);
                    
                    System.out.println("Ingrese la capacidad de pasajeros del bus: ");
                    capacidadpasajeros=leer.nextInt();
                    
                    while(capacidadpasajeros<0){
                        System.out.println("Ingrese la cantidad de pasajeros del bus: ");
                        capacidadpasajeros = leer.nextInt();
                    }
                    
                    System.out.println("Ingrese el numero de ejes del bus:  ");
                    numEjes = leer.nextInt();
                     
                    while(numEjes<0){
                        System.out.println("Ingrese el numero de ejes del bus: ");
                        numEjes = leer.nextInt();
                    }
                    
                                                          
                    System.out.println("Ingrese el la longitud del bus: ");
                    longitud = leer.nextInt();
                    
                    while(longitud<0){
                        System.out.println("Ingrese una cantidad coherente de puertas: ");
                        longitud = leer.nextInt();
                    }
                    
                    
                    Autobus bus = new Autobus(capacidadpasajeros, numEjes, longitud, placaB, marcaB, ModeloB, tipoAutoB, colorB, añoB);
                    vehiculos.add(bus);
                    
                    System.out.println("motocicleta agregado correctamente ");
                 
                    
                    
                    break;
                    
                case 4:
                    /*
                    Modificar Vehículo: Se deberá mostrar la lista completa de Vehículos y seleccionar uno
                    para poder modificar este elemento por completo. Deberá poder distinguir entre
                    Automóviles, Motocicletas y Autobuses para poder modificar correctamente los
                    Vehículos. Mostrando el Vehículo a Modificar tras seleccionar y los cambios realizados
                    al finalizar.
                    */
                    if(vehiculos.isEmpty()){
                        System.out.println("No hay nada Mi bro ingrese vehiculos");
                    }else
                    {
                    int opcionMod=0;
                    
                    vehiculos(vehiculos);
                    
                    System.out.println("Ingrese la posicion del Vehiculo a modificar: ");
                    opcionMod=leer.nextInt();
                    
                     for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(opcionMod) instanceof Automovil) {
                          
                            {
                            String placa1 = null;
                            String marca1;
                            String Modelo1;
                            String tipoAuto1;
                            Color color1;
                            Date año1;
                            String añito1;
                            String Combustible1;
                            int puertas1=0;
                            String Transmision1;
                            int asientos1=0;

                        boolean placaValida1=false;

                         while (!placaValida1) {
                            System.out.print("Ingresa la placa del automovil (3 letras seguidas de 4 dígitos): ");
                            placa1=leer2.next().toUpperCase();

                            if (placa1.length() == 7 && 
                               (placa1.charAt(0)=='H') &&
                               esLetra(placa1.charAt(1)) &&
                               esLetra(placa1.charAt(2)) &&
                               esNumero(placa1.charAt(3)) &&
                               esNumero(placa1.charAt(4)) &&
                               esNumero(placa1.charAt(5)) &&
                               esNumero(placa1.charAt(6))) {
                               placaValida1=true;
                               System.out.println("la placa es valida");
                             }else {
                             System.out.println("La placa no cumple con el formato especificado.");
                             }
                        }    
                         
                            ((Automovil)vehiculos.get(opcionMod)).setPlaca(placa1); 
                            
                            System.out.println("Ingrese la marca del automovil: ");
                            marca1=leer2.next();
                            ((Automovil)vehiculos.get(opcionMod)).setMarca(marca1); 
                            System.out.println("Ingrese el modelo del automovil: ");
                            Modelo1=leer2.next();
                            ((Automovil)vehiculos.get(opcionMod)).setModelo(Modelo1); 
                            System.out.println("Ingrese el tipo del auto: ");
                            tipoAuto1=leer2.next();
                            ((Automovil)vehiculos.get(opcionMod)).setTipo(tipoAuto1); 

                            color1 = JColorChooser.showDialog(null, "Color del auto: ", Color.RED);

                            ((Automovil)vehiculos.get(opcionMod)).setColor(color1); 
                            
                            System.out.println("Ingrese el año del vehiculo");
                            añito1= leer2.next();
                            
                            año1 = fgh.parse(añito1);
                            ((Automovil)vehiculos.get(opcionMod)).setAño(año1);     
                            
                            System.out.println("Ingrese el combustible de automovil: ");//super, diesel , regular
                            Combustible1=leer2.next();
                            ((Automovil)vehiculos.get(opcionMod)).setTipoCombustible(Combustible1); 

                            System.out.println("Ingrese la cantidad de puertas: ");
                             puertas1 = leer.nextInt();
                            

                            while(puertas1<0 || puertas1==3 || puertas1>4){
                                System.out.println("Ingrese una cantidad coherente de puertas: ");
                                puertas1 = leer.nextInt();
                            }
                             ((Automovil)vehiculos.get(opcionMod)).setPuertas(puertas1);     
                            
                            System.out.println("Ingrese la transmision del automovil: [automatica o manual] ");
                            Transmision1= leer2.next();
                             ((Automovil)vehiculos.get(opcionMod)).setTipoTransmision(Transmision1); 
                            
                            System.out.println("Ingrese la cantidad de asientos: ");
                            asientos1 = leer.nextInt();
                            

                            while(asientos1<0){
                                System.out.println("Ingrese la cantidad de asientos correcta: ");
                                asientos1 = leer.nextInt();
                            }
                            ((Automovil)vehiculos.get(opcionMod)).setAsientos(asientos1); 
                           

                            

                            System.out.println("automovil modificado correctamente ");

                            

                            }
                            
                        }
                         
                    }
                    
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(opcionMod) instanceof Motocicleta) {
                            {
                            String placa1 = null;
                            String marca1;
                            String Modelo1;
                            String tipoAuto1;
                            Color color1;
                            Date año1;
                            String añito1;
                            int velocidadMaxM=0;//km/h
                            int pesom=0;//kg
                            int ConsumoCombustible=0;//L

                        boolean placaValida1=false;

                         while (!placaValida1) {
                            System.out.print("Ingresa la placa del automovil (3 letras seguidas de 4 dígitos): ");
                            placa1=leer2.next().toUpperCase();

                            if (placa1.length() == 7 && 
                               (placa1.charAt(0)=='H') &&
                               esLetra(placa1.charAt(1)) &&
                               esLetra(placa1.charAt(2)) &&
                               esNumero(placa1.charAt(3)) &&
                               esNumero(placa1.charAt(4)) &&
                               esNumero(placa1.charAt(5)) &&
                               esNumero(placa1.charAt(6))) {
                               placaValida1=true;
                               System.out.println("la placa es valida");
                             }else {
                             System.out.println("La placa no cumple con el formato especificado.");
                             }
                        }    
                         
                            ((Motocicleta)vehiculos.get(opcionMod)).setPlaca(placa1); 
                            
                            System.out.println("Ingrese la marca del automovil: ");
                            marca1=leer2.next();
                            ((Motocicleta)vehiculos.get(opcionMod)).setMarca(marca1); 
                            System.out.println("Ingrese el modelo del automovil: ");
                            Modelo1=leer2.next();
                            ((Motocicleta)vehiculos.get(opcionMod)).setModelo(Modelo1); 
                            System.out.println("Ingrese el tipo del auto: ");
                            tipoAuto1=leer2.next();
                            ((Motocicleta)vehiculos.get(opcionMod)).setTipo(tipoAuto1); 

                            color1 = JColorChooser.showDialog(null, "Color del auto: ", Color.RED);

                            ((Motocicleta)vehiculos.get(opcionMod)).setColor(color1); 
                            
                            System.out.println("Ingrese el año del vehiculo");
                            añito1= leer2.next();
                            
                            año1 = fgh.parse(añito1);
                            ((Motocicleta)vehiculos.get(opcionMod)).setAño(año1);     
                            
                            

                            System.out.println("Ingrese la velocidad maxima de la moto: ");
                             velocidadMaxM = leer.nextInt();
                            

                            while(velocidadMaxM<0 ){
                                System.out.println("Ingrese una cantidad coherente de puertas: ");
                                velocidadMaxM = leer.nextInt();
                            }
                             ((Motocicleta)vehiculos.get(opcionMod)).setVelocidadMax(velocidadMaxM);     
                            
                            System.out.println("Ingrese el peso de la moto: ");
                            pesom = leer.nextInt();
                            while(pesom<0){
                                System.out.println("Ingrese la cantidad de asientos correcta: ");
                                pesom = leer.nextInt();
                            }
                            ((Motocicleta)vehiculos.get(opcionMod)).setPeso(pesom); 
                            
                            System.out.println("Ingrese el consumo de combustible: ");
                            ConsumoCombustible = leer.nextInt();
                            

                            while(ConsumoCombustible<0){
                                System.out.println("Ingrese la cantidad de asientos correcta: ");
                                ConsumoCombustible = leer.nextInt();
                            }
                            ((Motocicleta)vehiculos.get(opcionMod)).setConsumoCombustible(ConsumoCombustible);
                           

                            System.out.println("moto modificada correctamente ");
                            }
                            
                        }
  
                    }
                    
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(opcionMod) instanceof Autobus) {
                            {
                            String placa1 = null;
                            String marca1;
                            String Modelo1;
                            String tipoAuto1;
                            Color color1;
                            Date año1;
                            String añito1;
                            int capacidadPasajeros=0;
                            int numEjesB=0;
                            int longitudB=0;
                            

                        boolean placaValida1=false;

                         while (!placaValida1) {
                            System.out.print("Ingresa la placa del automovil (3 letras seguidas de 4 dígitos): ");
                            placa1=leer2.next().toUpperCase();

                            if (placa1.length() == 7 && 
                               (placa1.charAt(0)=='H') &&
                               esLetra(placa1.charAt(1)) &&
                               esLetra(placa1.charAt(2)) &&
                               esNumero(placa1.charAt(3)) &&
                               esNumero(placa1.charAt(4)) &&
                               esNumero(placa1.charAt(5)) &&
                               esNumero(placa1.charAt(6))) {
                               placaValida1=true;
                               System.out.println("la placa es valida");
                             }else {
                             System.out.println("La placa no cumple con el formato especificado.");
                             }
                        }    
                         
                            ((Autobus)vehiculos.get(opcionMod)).setPlaca(placa1); 
                            
                            System.out.println("Ingrese la marca del automovil: ");
                            marca1=leer2.next();
                            ((Autobus)vehiculos.get(opcionMod)).setMarca(marca1); 
                            System.out.println("Ingrese el modelo del automovil: ");
                            Modelo1=leer2.next();
                            ((Autobus)vehiculos.get(opcionMod)).setModelo(Modelo1); 
                            System.out.println("Ingrese el tipo del auto: ");
                            tipoAuto1=leer2.next();
                            ((Autobus)vehiculos.get(opcionMod)).setTipo(tipoAuto1); 

                            color1 = JColorChooser.showDialog(null, "Color del auto: ", Color.RED);

                            ((Autobus)vehiculos.get(opcionMod)).setColor(color1); 
                            
                            System.out.println("Ingrese el año del vehiculo");
                            añito1= leer2.next();
                            
                            año1 = fgh.parse(añito1);
                            ((Autobus)vehiculos.get(opcionMod)).setAño(año1);     
                            
                            

                            System.out.println("Ingrese la capacidad de pasajeros: ");
                            capacidadPasajeros = leer.nextInt();
                            

                            while(capacidadPasajeros<0 ){
                                System.out.println("Ingrese una cantidad coherente de puertas: ");
                                capacidadPasajeros = leer.nextInt();
                            }
                             ((Autobus)vehiculos.get(opcionMod)).setCapacidadPasajeros(capacidadPasajeros);     
                            
                            System.out.println("Ingrese los numeros de ejes: ");
                            numEjesB = leer.nextInt();
                            
                            while(numEjesB<0){
                                System.out.println("Ingrese la cantidad de asientos correcta: ");
                                numEjesB = leer.nextInt();
                            }
                            ((Autobus)vehiculos.get(opcionMod)).setNumeroEjes(numEjesB); 
                            
                            System.out.println("Ingrese la longitud del bus: ");
                            longitudB = leer.nextInt();
                            

                            while(longitudB<0){
                                System.out.println("Ingrese la cantidad de asientos correcta: ");
                                longitudB = leer.nextInt();
                            }
                            ((Autobus)vehiculos.get(opcionMod)).setLongitud(longitudB);
                           

                            System.out.println("moto modificada correctamente ");
                              
                            }
                            
                            }
                        }
                    }
                    
                    break;
                    
                case 5:
                    
                    if(vehiculos.isEmpty()){
                        System.out.println("No hay nada mi bro ingresa vehiculos");
                    }else{
                        
                    
                    int opcionEliminar=0;
                    
                    
                    vehiculos(vehiculos);
                    
                    System.out.println("Ingrese la posicion de un vehiculo para eliminar: ");
                    opcionEliminar = leer.nextInt();
                    
                    while(opcionEliminar<0 && opcionEliminar>vehiculos.size()){
                        System.out.println("Ingrese una posicion correcta de un vehiculo para eliminar: ");
                        opcionEliminar = leer.nextInt();
                    }
                    
                    vehiculos.remove(opcionEliminar);
                    
                    System.out.println("vehiculo eliminado exitosamente... ");
                    
                 } 
                    break;
                    
                case 6:
                    if(vehiculos.isEmpty()){
                        System.out.println("no hay nada mi bro ingresa vehiculos");
                    }else{
                        
                    
                    System.out.println("Automoviles: ");
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(i) instanceof Automovil) {
                            System.out.println((Vehiculo)vehiculos.get(i));
                            
                        }
  
                    }
                    System.out.println();
                    System.out.println("Motocicletas: ");
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(i) instanceof Motocicleta) {
                            System.out.println((Motocicleta)vehiculos.get(i));
                            
                        }
  
                    }
                    System.out.println("");
                    System.out.println("Autobuses: ");
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(i) instanceof Autobus) {
                            System.out.println((Autobus)vehiculos.get(i));
                            
                        }
  
                    }
                }
                    break;
                
                case 7:
                    
                    if(vehiculos.isEmpty()){
                        System.out.println("no hay nada mi bro ingresa vehiculos");
                    }else{
                        
                    
                    int Total=0;
                    int totalApagar=275; 
                    /*
                    placa
                    marca
                    modelo
                    tipo
                    color
                    año
                    */
                                        
                    vehiculos(vehiculos);
                    
                    System.out.println("Ingrese una posicion para generar la boleta de revision vehicular: ");
                    int opcionBoleta = leer.nextInt();
                  
                    
                    System.out.println("BOLETA REVISION VEHICULAR");
                    
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(opcionBoleta) instanceof Automovil) {
                            System.out.println("Automovil");
                            System.out.println("Placa: "+ ((Automovil)vehiculos.get(opcionBoleta)).getPlaca());
                            System.out.println("Marca: "+((Automovil)vehiculos.get(opcionBoleta)).getMarca());
                            System.out.println("Modelo: "+ ((Automovil)vehiculos.get(opcionBoleta)).getModelo());
                            System.out.println("Tipo: "+((Automovil)vehiculos.get(opcionBoleta)).getTipo());
                            System.out.println("Color: "+((Automovil)vehiculos.get(opcionBoleta)).getColor());
                            System.out.println("Año: "+((Automovil)vehiculos.get(opcionBoleta)).getMarca());
                            Total=totalApagar+250+1200;
                            
                            System.out.println("Total a pagar: " + Total);
                            
                        }
  
                    }
                    
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(opcionBoleta) instanceof Motocicleta) {
                           System.out.println("Motocicleta");
                           
                           
                           System.out.println("Placa: "+ ((Motocicleta)vehiculos.get(opcionBoleta)).getPlaca());
                           System.out.println("Marca: "+((Motocicleta)vehiculos.get(opcionBoleta)).getMarca());
                           System.out.println("Modelo: "+ ((Motocicleta)vehiculos.get(opcionBoleta)).getModelo());
                           System.out.println("Tipo: "+((Motocicleta)vehiculos.get(opcionBoleta)).getTipo());
                           System.out.println("Color: "+((Motocicleta)vehiculos.get(opcionBoleta)).getColor());
                           System.out.println("Año: "+((Motocicleta)vehiculos.get(opcionBoleta)).getMarca());
                            
                           Total=totalApagar+250+200;
                            
                           System.out.println("Total a pagar: " + Total);  
                            
                        }
  
                    }
                
                    
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(opcionBoleta) instanceof Autobus) {
                            System.out.println("Autobus");
                            System.out.println("Placa: "+ ((Autobus)vehiculos.get(opcionBoleta)).getPlaca());
                            System.out.println("Marca: "+((Autobus)vehiculos.get(opcionBoleta)).getMarca());
                            System.out.println("Modelo: "+ ((Autobus)vehiculos.get(opcionBoleta)).getModelo());
                            System.out.println("Tipo: "+((Autobus)vehiculos.get(opcionBoleta)).getTipo());
                            System.out.println("Color: "+((Autobus)vehiculos.get(opcionBoleta)).getColor());
                            System.out.println("Año: "+((Autobus)vehiculos.get(opcionBoleta)).getMarca());
                          
                            
                          Total=totalApagar+250+1000;
                            
                          System.out.println("Total a pagar: " + Total);   
                            
                        }
  
                    }
                    
                    
                    
               }    
                    
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
 
 public static void vehiculos(ArrayList vehiculos){
     
     for (int i = 0; i < vehiculos.size(); i++) {
         System.out.println(i+" -"+ vehiculos.get(i)+ "\n");
         
     }
 }
}
