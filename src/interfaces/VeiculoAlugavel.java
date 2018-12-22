package interfaces;

import java.io.Serializable;

/**
 * Interface
 * @author Rayana
 */
public interface VeiculoAlugavel extends ProdutoAlugavel, Serializable
{
    /**
     * Método que mostra o ano do véiculo alugável
     * @return int -
     */
    int getAno();
}
