package abstratas;

import interfaces.ImovelVendavel;
import java.io.Serializable;

/**
 * Classe abstrata
 * @author Rayana
 */
public abstract class ImovelVendavelImp extends ProdutoVendavelImp implements ImovelVendavel, Serializable
{
    /**
     * Atributo endereço do imóvel
     */
    private String endereco;
    
    /**
     * Reescrita do método que mostra o endereço do imóvel
     * @return String -
     */
    @Override
    public String getEndereco() 
    {
        return this.endereco;
    }
    
    /**
     * Método que altera o endereço do imóvel
     * @param endereco -
     */
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }
    
    /**
     * Reescrita de método que mostra as informações deu um imóvel vendável
     * @return String -
     */
    @Override
    public String toString() 
    {
        return super.toString() + ", endereco = " + endereco;
    }
}
