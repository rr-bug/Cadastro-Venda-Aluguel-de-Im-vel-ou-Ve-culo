package classes;

import abstratas.ImovelVendavelImp;
import java.io.Serializable;

public class ApartamentoVenda extends ImovelVendavelImp implements Serializable, Cloneable
{
    private int andar;

    public int getAndar()
    {
        return andar;
    }

    public void setAndar(int andar)
    {
        this.andar = andar;
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + ", andar = " + andar;
    }
    
    public ApartamentoVenda clone() throws CloneNotSupportedException 
    {
          return (ApartamentoVenda)super.clone();
    }
}
