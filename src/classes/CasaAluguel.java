package classes;

import abstratas.ImovelAlugavelImp;
import java.io.Serializable;

public class CasaAluguel extends ImovelAlugavelImp implements Serializable, Cloneable
{
    private double areaConstruida;
    private boolean terrea;
    private boolean piscina;

    public double getAreaConstruida()
    {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) 
    {
        this.areaConstruida = areaConstruida;
    }

    public boolean isTerrea() 
    {
        return terrea;
    }

    public void setTerrea(boolean terrea) 
    {
        this.terrea = terrea;
    }

    public boolean isPiscina()
    {
        return piscina;
    }

    public void setPiscina(boolean piscina) 
    {
        this.piscina = piscina;
    }
    
    public double getValorMensalDiario() 
    {
        return (super.getValorDiaria() * 0.25) * 30;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", areaConstruida = " + areaConstruida + ", terrea = " + terrea + ", piscina = " + piscina;
    }
    
    public CasaAluguel clone() throws CloneNotSupportedException 
    {
          return (CasaAluguel)super.clone();
    }
}
