package interfaces;

import java.io.Serializable;

public interface VeiculoVendavel extends ProdutoVendavel, Serializable
{
    /**
     * Método que mostra o ano do produto vendável 
     * @return int -
     */
    int getAno();
}
