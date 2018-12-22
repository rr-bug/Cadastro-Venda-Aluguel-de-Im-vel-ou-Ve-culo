package interfaces;

import classes.Cliente;
import modelo.Data;

/**
 * Interface
 * @author Rayana
 */
public interface Venda 
{
    /**
     * Método que mostra o código da venda
     * @return int -
     */
    int getCodigo();
    /**
     * Método que mostra a data de venda
     * @return Data - 
     */
    Data getData();
    /**
     * Método que mostra o cliente da venda
     * @return Cliente -
     */
    Cliente getCliente();
    /**
     * Método que mostra o produto vendável de venda
     * @return ProdutoVendavel
     */
    ProdutoVendavel getProdutoVendavel();
}
