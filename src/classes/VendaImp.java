package classes;

import interfaces.ProdutoVendavel;
import interfaces.Venda;
import java.io.Serializable;
import modelo.Data;

public class VendaImp implements Serializable, Venda, Cloneable
{
    private int codigo;
    private Data data = null;
    private Cliente cliente;
    ProdutoVendavel produtoVendavel;

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
    public Data getData() 
    {
        return data;
    }

    public void setData(Data data) 
    {
        this.data = data;
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
    public ProdutoVendavel getProdutoVendavel() 
    {
        return produtoVendavel;
    }

    public void setProdutoVendavel(ProdutoVendavel produtoVendavel) 
    {
        this.produtoVendavel = produtoVendavel;
    }

    @Override
    public String toString() 
    {
        return "codigo = " + codigo + ", data = " + data + ", cliente = " + cliente + ", produtoVendavel = " + produtoVendavel;
    }    
    
    public VendaImp clone() throws CloneNotSupportedException 
    {
          return (VendaImp)super.clone();
    }
}
