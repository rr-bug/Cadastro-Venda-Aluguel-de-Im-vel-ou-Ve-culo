package comparadores;

import interfaces.ProdutoAlugavel;
import java.util.Comparator;

/**
 * @author Rayana
 */
public class ComparadorProdutoPorMenorPrecoDiaria implements Comparator<ProdutoAlugavel>
{
    /**
     * Método que retorna um inteiro de acordo com sua comparação de acordo com o valor diária maior, menor ou igual
     * @param p1 - do tipo Produto Alugável
     * @param p2 - do tipo Produto Alugável
     * @return int
     */
    @Override
    public int compare(ProdutoAlugavel p1, ProdutoAlugavel p2) 
    {
        if(p1.getValorDiaria() < p2.getValorDiaria())
        {
            return -1;
        }
        else if(p1.getValorDiaria() > p2.getValorDiaria())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
