package interfaces;

import java.io.Serializable;
import java.util.List;
import modelo.Informacao;

/**
 * Interface
 * @author Rayana
 */
public interface Produto extends Serializable
{
    /**
     * Método que mostra o código do produto
     * @return int -
     */
    int getCodigo();
    /**
     * Método que mostra a descrição do produto
     * @return String -
     */
    String getDescricao();
    /**
     * Método que mostra a foto do produto
     * @return String -
     */
    String getFoto();
    /**
     * Método que mostra informações de produto
     * @return List
     */
    List<Informacao> getInformacoes();
}
