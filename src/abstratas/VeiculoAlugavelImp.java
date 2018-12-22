package abstratas;

import interfaces.VeiculoAlugavel;
import java.io.Serializable;

/**
 * Classe abstrata
 * @author Rayana
 */
public abstract class VeiculoAlugavelImp extends ProdutoAlugavelImp implements VeiculoAlugavel, Serializable
{
    /**
     * Atributo ano do veículo
     */
    private int ano;
    
    /**
     * Reescrita do método que mostra o ano do veículo
     * @return int -
     */
    @Override
    public int getAno() 
    {
        return this.ano;
    }

    /**
     * Método que altera o ano do veículo
     * @param ano -
     */
    public void setAno(int ano) 
    {
        this.ano = ano;
    }

    /**
     * Reescrita do método que mostra as informações do veículo alugável
     * @return String -
     */
    @Override
    public String toString() 
    {
        return super.toString() + ", ano = " + ano;
    }   
}
