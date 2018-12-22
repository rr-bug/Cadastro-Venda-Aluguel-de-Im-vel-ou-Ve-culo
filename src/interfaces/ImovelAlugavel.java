package interfaces;

import java.io.Serializable;

/**
 * Interface
 * @author Rayana
 */
public interface ImovelAlugavel extends ProdutoAlugavel, Serializable
{
    /**
     * Método que mostra o endereço do imóvel alugável
     * @return String -
     */
    public String getEndereco();
}
