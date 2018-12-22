package excecoes;

/**
 * Exceção do tipo Exception
 * @author Rayana
 */
public class ExceptionCodigoInexistente extends Exception
{
    /**
     * Método cria um construtor da exceção com uma mensagem
     * @param message -
     */
    public ExceptionCodigoInexistente(String message)
    {
        super(message);
    }
    
    /**
     * Construtor padrão
     */
    public ExceptionCodigoInexistente()
    {
    }
}
