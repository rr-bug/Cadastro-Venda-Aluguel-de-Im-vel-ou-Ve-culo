package comparadores;

import interfaces.ProdutoVendavel;
import java.util.Comparator;

/**
 * @author Rayana
 */
public class ComparadorProdutoPorMenorPrecoVenda implements Comparator<ProdutoVendavel>
{
    /**
     * Método que retorna um inteiro de acordo com sua comparação de acordo com o valor venda maior, menor ou igual
     * @param p1 - do tipo Produto Vendável
     * @param p2 - do tipo Produto Vendável
     * @return int
     */
    @Override
    public int compare(ProdutoVendavel p1, ProdutoVendavel p2) 
    {
        if(p1.getValorVenda() < p2.getValorVenda())
        {
            return -1;
        }
        else if(p1.getValorVenda() > p2.getValorVenda())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
