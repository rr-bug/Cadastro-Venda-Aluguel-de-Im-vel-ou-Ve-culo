package classes;

import abstratas.ImovelVendavelImp;
import java.io.Serializable;

public class CasaVenda extends ImovelVendavelImp implements Serializable, Cloneable
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
    
    @Override
    public String toString() 
    {
        return super.toString() + ", areaConstruida = " + areaConstruida + ", terrea = " + terrea + ", piscina = " + piscina;
    }
    
    public CasaVenda clone() throws CloneNotSupportedException 
    {
          return (CasaVenda)super.clone();
    }
}
