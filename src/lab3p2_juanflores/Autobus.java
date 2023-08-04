
package lab3p2_juanflores;

import java.awt.Color;
import java.util.Date;

public class Autobus extends Vehiculo{
    private int CapacidadPasajeros;
    private int numeroEjes;
    private int Longitud;// m-metros

    public Autobus() {
    }

    public Autobus(int CapacidadPasajeros, int numeroEjes, int Longitud) {
        this.CapacidadPasajeros = CapacidadPasajeros;
        this.numeroEjes = numeroEjes;
        this.Longitud = Longitud;
    }

    public Autobus(int CapacidadPasajeros, int numeroEjes, int Longitud, String Placa, String Marca, String Modelo, String Tipo, Color color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, color, Año);
        this.CapacidadPasajeros = CapacidadPasajeros;
        this.numeroEjes = numeroEjes;
        this.Longitud = Longitud;
    }

    public int getCapacidadPasajeros() {
        return CapacidadPasajeros;
    }

    public void setCapacidadPasajeros(int CapacidadPasajeros) {
        this.CapacidadPasajeros = CapacidadPasajeros;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    @Override
    public String toString() {
        return super.toString()+" Autobus{" + "CapacidadPasajeros=" + CapacidadPasajeros + ", numeroEjes=" + numeroEjes + ", Longitud=" + Longitud + '}';
    }
 
    
}
