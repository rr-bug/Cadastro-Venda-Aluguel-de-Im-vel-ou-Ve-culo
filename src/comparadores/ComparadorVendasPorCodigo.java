package comparadores;

import interfaces.Venda;
import java.util.Comparator;

/**
 * @author Rayana
 */
public class ComparadorVendasPorCodigo implements Comparator<Venda>
{
    /**
     * Método que retorna um inteiro de acordo com sua comparação de acordo com o código maior, menor ou igual
     * @param v1 - do tipo Venda
     * @param v2 - do tipo Venda
     * @return int
     */
    @Override
    public int compare(Venda v1, Venda v2) 
    {
        if(v1.getCodigo() < v2.getCodigo())
        {
            return -1;
        }
        else if(v1.getCodigo() > v2.getCodigo())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
