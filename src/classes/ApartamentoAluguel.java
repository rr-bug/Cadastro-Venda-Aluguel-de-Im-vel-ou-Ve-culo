package classes;

import abstratas.ImovelAlugavelImp;
import java.io.Serializable;

public class ApartamentoAluguel extends ImovelAlugavelImp implements Serializable, Cloneable
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

    public double getValorMensalDiario() 
    {
        return (super.getValorDiaria() * 0.25) * 30;
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + ", andar = " + andar;
    }
    
    public ApartamentoAluguel clone() throws CloneNotSupportedException 
    {
          return (ApartamentoAluguel)super.clone();
    }
}
