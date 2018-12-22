package interfaces;

import java.io.Serializable;

/**
 * Interface
 * @author Rayana
 */
public interface ProdutoAlugavel extends Produto, Serializable
{
    /**
     * Método que mostra o valor diário do produto alugável
     * @return double -
     */
    double getValorDiaria();
}
