package comparadores;

import interfaces.Aluguel;
import java.util.Comparator;

/**
 * @author Rayana
 */
public class ComparadorAlugueisPorCodigo implements Comparator<Aluguel>
{
    /**
     * Método que retorna um inteiro de acordo com sua comparação de acordo com o código maior, menor ou igual
     * @param a1 - do tipo Aluguel
     * @param a2 - do tipo Aluguel
     * @return int -
     */
    @Override
    public int compare(Aluguel a1, Aluguel a2) 
    {
        if(a1.getCodigo() < a2.getCodigo())
        {
            return -1;
        }
        else if(a1.getCodigo() > a2.getCodigo())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
