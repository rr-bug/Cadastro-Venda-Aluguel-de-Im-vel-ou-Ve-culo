package classes;

import abstratas.ImovelVendavelImp;
import java.io.Serializable;

public class TerrenoVenda extends ImovelVendavelImp implements Serializable, Cloneable
{
    private int quantidadeMuros;
    
    public int getQuantidadeMuros() 
    {
        return quantidadeMuros;
    }

    public void setQuantidadeMuros(int quantidadeMuros) 
    {
        this.quantidadeMuros = quantidadeMuros;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", quantidadeMuros = " + quantidadeMuros;
    }
    
    public TerrenoVenda clone() throws CloneNotSupportedException 
    {
          return (TerrenoVenda)super.clone();
    }
}
