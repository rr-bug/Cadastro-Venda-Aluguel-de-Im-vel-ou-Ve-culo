package classes;

import abstratas.VeiculoAlugavelImp;
import java.io.Serializable;

public class CarroAluguel extends VeiculoAlugavelImp implements Serializable, Cloneable
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

    public double getValorMensalDiario() 
    {
        return (super.getValorDiaria() * 0.65) * 30;
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + ", numeroPassageiros = " + numeroPassageiros + ", categoria = " + categoria;
    }
    
    public CarroAluguel clone() throws CloneNotSupportedException 
    {
          return (CarroAluguel)super.clone();
    }
}
