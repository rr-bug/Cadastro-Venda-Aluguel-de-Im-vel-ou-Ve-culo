package abstratas;

import interfaces.Produto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import modelo.Informacao;

/**
 * Classe abstrata
 * @author Rayana
 */
public abstract class ProdutoImp implements Produto, Serializable
{
    /**
     * Atributo codigo do produto
     */
    private int codigo;
    /**
     * Atributo descricao do produto
     */
    private String descricao;
    /**
     * Atributo foto do produto
     */
    private String foto;
    /**
     * Atributo List de informações do produto
     */
    private List<Informacao> informacoes = new ArrayList();

    /**
     * Reescrita do método que mostra a descrição do produto
     * @return String -
     */
    @Override
    public String getDescricao() 
    {
        return descricao;
    }

    /**
     * Método que altera a descrição do produto
     * @param descricao -
     */
    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    /**
     * Reescrita do método que mostra a foto do produto
     * @return String -
     */
    @Override
    public String getFoto() 
    {
        return foto;
    }

    /**
     * Método que altera a foto do produto
     * @param foto -
     */
    public void setFoto(String foto) 
    {
        this.foto = foto;
    }

    /**
     * Reescrita do método que mostra as informações do produto
     * @return List -
     */
    @Override
    public List<Informacao> getInformacoes() 
    {
        return informacoes;
    }

    /**
     * Método que adiciona uma informação no list de informações do produto
     * @param informacao -
     * @return boolean -
     */
    public boolean adicionaInformacao(Informacao informacao)
    {
        return this.informacoes.add(informacao);
    }
    
    /**
     * Reescrita do método que mostra o código do produto
     * @return int -
     */
    @Override
    public int getCodigo() 
    {
        return codigo;
    }

    /**
     * Método que altera o código do produto
     * @param codigo -
     */
    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    /**
     * Reescrita do método toString que motra as informações do produto
     * @return String -
     */
    @Override
    public String toString() 
    {
        String s="";
        for(Informacao i : this.informacoes)
        {
            s+=i.toString();
        }
        return "codigo = " + codigo + ", descricao = " + descricao + ", foto = " + foto + ", informacao [ " + s + " ] ";
    }

    /**
     * Reescrita do método hashCode que mostra um código do objeto
     * @return int - 
     */
    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 67 * hash + this.codigo;
        return hash;
    }

    /**
     * Reescrita do método equals que verifica se dois produtos são iguais de acordo com seu código
     * @param obj
     * @return boolean -
     */
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final ProdutoImp other = (ProdutoImp) obj;
        if (this.codigo != other.codigo) 
        {
            return false;
        }
        return true;
    }
}
