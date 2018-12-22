package interfaces;

import java.io.Serializable;

/**
 * Interface
 * @author Rayana
 */
public interface ImovelVendavel extends ProdutoVendavel, Serializable
{
    /**
     * Método que mostra o endereço do imóvel vendável
     * @return String -
     */
    public String getEndereco();
}
