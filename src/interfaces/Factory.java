package interfaces;

import java.io.Serializable;

/**
 * Interface do padrão de projeto factory
 * @author Rayana
 */
public interface Factory extends Serializable, Cloneable
{
    /**
     * Método que gera um objeto de acordo com o nome de parâmetro
     * @param nome -
     * @return Object -
     */
    Object gerarProduto(String nome);
    
    /**
     * Método que gera um clone em relação ao produto que passa pelo parâmetro
     * @param c -
     * @return Object -
     */
    Object gerarCloneProduto(Produto c);
}
