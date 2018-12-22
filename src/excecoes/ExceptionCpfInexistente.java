package excecoes;

/**
 * Exceção do tipo Exception
 * @author Rayana
 */
public class ExceptionCpfInexistente extends Exception
{
    /**
     * Método cria um construtor da exceção com uma mensagem
     * @param message -
     */
    public ExceptionCpfInexistente(String message)
    {
        super(message);
    }
    
    /**
     * Construtor padrão
     */
    public ExceptionCpfInexistente()
    {
    }
}
