package comparadores;

import java.util.Comparator;
import classes.Cliente;

/**
 * @author Rayana
 */
public class ComparadorClientePorNome implements Comparator<Cliente>
{
    /**
     * Método que retorna um inteiro de acordo com sua comparação de acordo com o nome maior, menor ou igual
     * @param o1 - do tipo Cliente
     * @param o2 - do tipo Cliente
     * @return int
     */
    @Override
    public int compare(Cliente o1, Cliente o2) 
    {
        return o1.getNome().compareTo(o2.getNome());
    }    
}
