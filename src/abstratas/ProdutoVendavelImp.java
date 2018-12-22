package abstratas;

import interfaces.ProdutoVendavel;
import java.io.Serializable;

/**
 * Classe abstrata
 * @author Rayana
 */
public abstract class ProdutoVendavelImp extends ProdutoImp implements ProdutoVendavel, Serializable
{
    /**
     * Atributo valor venda do produto que é para venda
     */
    private double valorVenda;
    
    /**
     * Reescrita do método que mostra o valor venda do produto
     * @return double -
     */
    @Override
    public double getValorVenda() 
    {
        return this.valorVenda;
    }

    /**
     * Método que altera o valor venda do produto
     * @param valorVenda -
     */
    public void setValorVenda(double valorVenda) 
    {
        this.valorVenda = valorVenda;
    }
    
    /**
     * Reescrita do método que mostra as informações de um produto vendável
     * @return String -
     */
    @Override
    public String toString() 
    {
        return super.toString() + ", valorVenda = " + valorVenda;
    }
}
