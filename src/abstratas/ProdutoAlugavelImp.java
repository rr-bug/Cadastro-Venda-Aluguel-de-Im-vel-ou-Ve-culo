package abstratas;

import interfaces.ProdutoAlugavel;
import java.io.Serializable;

/**
 * @author Rayana
 */
public abstract class ProdutoAlugavelImp extends ProdutoImp implements ProdutoAlugavel, Serializable
{
    /**
     * Atributo valor diária do produto que é para alugar
     */
    private double valorDiaria;
    
    /**
     * Reescrita do método que mostra o valor da diária do produto
     * @return double
     */
    @Override
    public double getValorDiaria() 
    {
        return this.valorDiaria;
    }

    /**
     * Método que altera o valor da diária do produto
     * @param valorDiaria 
     */
    public void setValorDiaria(double valorDiaria)
    {
        this.valorDiaria = valorDiaria;
    }

    /**
     * Reescrita do método que mostra as informações do produto alugável
     * @return String
     */
    @Override
    public String toString() 
    {
        return super.toString() + ", valorDiaria = " + valorDiaria;
    }
}
