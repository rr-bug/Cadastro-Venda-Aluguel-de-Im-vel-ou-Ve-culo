package classes;

import abstratas.VeiculoVendavelImp;
import java.io.Serializable;

public class CarroVenda extends VeiculoVendavelImp implements Serializable, Cloneable
{
    private int numeroPassageiros;
    private String categoria;

    public int getNumeroPassageiros() 
    {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) 
    {
        this.numeroPassageiros = numeroPassageiros;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + ", numeroPassageiros = " + numeroPassageiros + ", categoria = " + categoria;
    }
    
    public CarroVenda clone() throws CloneNotSupportedException 
    {
          return (CarroVenda)super.clone();
    }
}
