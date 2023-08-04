
package lab3p2_juanflores;

import java.awt.Color;
import java.util.Date;

public class Automovil extends Vehiculo{
    
    private String TipoCombustible;
    private int puertas;
    private String TipoTransmision;
    private int asientos;

    public Automovil() {
    }

    public Automovil(String TipoCombustible, int puertas, String TipoTransmision, int asientos) {
        this.TipoCombustible = TipoCombustible;
        this.puertas = puertas;
        this.TipoTransmision = TipoTransmision;
        this.asientos = asientos;
    }

    public Automovil(String TipoCombustible, int puertas, String TipoTransmision, int asientos, String Placa, String Marca, String Modelo, String Tipo, Color color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, color, Año);
        this.TipoCombustible = TipoCombustible;
        this.puertas = puertas;
        this.TipoTransmision = TipoTransmision;
        this.asientos = asientos;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTipoTransmision() {
        return TipoTransmision;
    }

    public void setTipoTransmision(String TipoTransmision) {
        this.TipoTransmision = TipoTransmision;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return super.toString()+ " Automovil{" + "TipoCombustible=" + TipoCombustible + ", puertas=" + puertas + ", TipoTransmision=" + TipoTransmision + ", asientos=" + asientos + '}';
    }
    
     
}
