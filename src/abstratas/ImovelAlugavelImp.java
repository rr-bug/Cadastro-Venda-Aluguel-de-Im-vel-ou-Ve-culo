package abstratas;

import interfaces.ImovelAlugavel;
import java.io.Serializable;

/**
 * Class abstrata
 * @author Rayana
 */
public abstract class ImovelAlugavelImp extends ProdutoAlugavelImp implements ImovelAlugavel, Serializable
{
    /**
     * Atributo com o endereço do imóvel
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
     * Método que pode alterar o endereço do imóvel
     * @param endereco -
     */
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }
    
    /**
     * Reescrita do método toString que mostra todas as informações de um imóvel alugável
     * @return String -
     */
    @Override
    public String toString() 
    {
        return super.toString() + ", endereco = " + endereco;
    }
}
