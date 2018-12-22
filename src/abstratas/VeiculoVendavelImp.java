package abstratas;

import interfaces.VeiculoVendavel;
import java.io.Serializable;

/**
 * Classe abstrata
 * @author Rayana
 */
public abstract class VeiculoVendavelImp extends ProdutoVendavelImp implements VeiculoVendavel, Serializable
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
     * Método que mostra as informações de veículo vendável
     * @return String -
     */    
    @Override
    public String toString() 
    {
        return super.toString() + ", ano = " + ano;
    }   
}
