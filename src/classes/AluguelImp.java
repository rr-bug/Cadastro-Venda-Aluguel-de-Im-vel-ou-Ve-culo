package classes;

import modelo.Periodo;
import interfaces.Aluguel;
import interfaces.ProdutoAlugavel;
import java.io.Serializable;

public class AluguelImp implements Serializable, Aluguel, Cloneable
{
    private int codigo;
    private Periodo periodo;
    private Cliente cliente;
    double valorMensalFinal;
    ProdutoAlugavel produtoAlugado;

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 83 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final AluguelImp other = (AluguelImp) obj;
        if (this.codigo != other.codigo) 
        {
            return false;
        }
        return true;
    }
    
    @Override
    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    @Override
    public Periodo getPeriodo() 
    {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) 
    {
        this.periodo = periodo;
    }

    @Override
    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    @Override
    public double getValorMensalFinal() 
    {
        return valorMensalFinal;
    }

    public void setValorMensalFinal(double valorMensalFinal) 
    {
        this.valorMensalFinal = valorMensalFinal;
    }

    @Override
    public ProdutoAlugavel getProdutoAlugado()
    {
        return produtoAlugado;
    }

    public void setProdutoAlugado(ProdutoAlugavel produtoAlugado) 
    {
        this.produtoAlugado = produtoAlugado;
    }

    @Override
    public String toString() 
    {
        return "codigo = " + codigo + ", periodo = " + periodo + ", " + cliente + ", valor mensal aluguel = " + valorMensalFinal + ", produtoAlugado = " + produtoAlugado;
    }
    
    public AluguelImp clone() throws CloneNotSupportedException 
    {
          return (AluguelImp)super.clone();
    }
}
