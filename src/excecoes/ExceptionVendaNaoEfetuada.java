package excecoes;

/**
 * Exceção do tipo Exception
 * @author Rayana
 */
public class ExceptionVendaNaoEfetuada extends RuntimeException
{
    /**
     * Método cria um construtor da exceção com uma mensagem
     * @param message -
     */
    public ExceptionVendaNaoEfetuada(String message)
    {
        super(message);
    }
    
    /**
     * Construtor padrão
     */
    public ExceptionVendaNaoEfetuada()
    {
    }
}