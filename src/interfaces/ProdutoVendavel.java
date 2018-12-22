package interfaces;

import java.io.Serializable;

/**
 * Interface
 * @author Rayana
 */
public interface ProdutoVendavel extends Produto, Serializable
{
    /**
     * Método que mostra o valor de venda do produto vendável
     * @return double -
     */
    double getValorVenda();
}
