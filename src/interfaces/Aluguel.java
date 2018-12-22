package interfaces;

import classes.Cliente;
import modelo.Periodo;

/**
 * Interface
 * @author Rayana
 */
public interface Aluguel
{
    /**
     * Método que mostra o código do aluguel
     * @return int -
     */
    int getCodigo();
    /**
     * Método que mostra o período do aluguel
     * @return Periodo -
     */
    Periodo getPeriodo();
    /**
     * Método que mostra o cliente do aluguel
     * @return Cliente -
     */
    Cliente getCliente();
    /**
     * Método que mostra o valor mensal final do aluguel
     * @return double -
     */
    double getValorMensalFinal();
    /**
     * Método que mostra o produto alugável do aluguel
     * @return ProdutoAlugavel
     */
    ProdutoAlugavel getProdutoAlugado();
}
