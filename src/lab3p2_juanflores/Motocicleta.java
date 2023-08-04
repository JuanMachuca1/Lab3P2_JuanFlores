
package lab3p2_juanflores;

import java.awt.Color;
import java.util.Date;

public class Motocicleta extends Vehiculo{
    private int velocidadMax; // km/h
    private int peso;// kg
    private int ConsumoCombustible;//L/km

    public Motocicleta() {
    }

    public Motocicleta(int velocidadMax, int peso, int ConsumoCombustible) {
        this.velocidadMax = velocidadMax;
        this.peso = peso;
        this.ConsumoCombustible = ConsumoCombustible;
    }

    public Motocicleta(int velocidadMax, int peso, int ConsumoCombustible, String Placa, String Marca, String Modelo, String Tipo, Color color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, color, Año);
        this.velocidadMax = velocidadMax;
        this.peso = peso;
        this.ConsumoCombustible = ConsumoCombustible;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getConsumoCombustible() {
        return ConsumoCombustible;
    }

    public void setConsumoCombustible(int ConsumoCombustible) {
        this.ConsumoCombustible = ConsumoCombustible;
    }

    @Override
    public String toString() {
        return super.toString() + " Motocicleta{" + "velocidadMax=" + velocidadMax + ", peso=" + peso + ", ConsumoCombustible=" + ConsumoCombustible + '}';
    }
    
    
    
}
