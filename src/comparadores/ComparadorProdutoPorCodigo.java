package comparadores;

import interfaces.Produto;
import java.util.Comparator;

/**
 * @author Rayana
 */
public class ComparadorProdutoPorCodigo implements Comparator<Produto>
{
    /**
     * Método que retorna um inteiro de acordo com sua comparação de acordo com o código maior, menor ou igual
     * @param p1 - do tipo Produto
     * @param p2 - do tipo Produto
     * @return int -
     */
    @Override
    public int compare(Produto p1, Produto p2) 
    {
        if(p1.getCodigo() < p2.getCodigo())
        {
            return -1;
        }
        else if(p1.getCodigo() > p2.getCodigo())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
