package classes;

import abstratas.VeiculoAlugavelImp;
import java.io.Serializable;

public class MotoAluguel extends VeiculoAlugavelImp implements Serializable, Cloneable
{
    private boolean offRoad;

    public boolean isOffRoad()
    {
        return offRoad;
    }

    public void setOffRoad(boolean offRoad)
    {
        this.offRoad = offRoad;
    }    
    
    public double getValorMensalDiario() 
    {
        return (super.getValorDiaria() * 0.70) * 30;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", offRoad = " + offRoad;
    }
    
    public MotoAluguel clone() throws CloneNotSupportedException 
    {
          return (MotoAluguel)super.clone();
    }
}
