package modelo;

import java.io.Serializable;

/**
 * @author Rayana
 */
public class Informacao implements Serializable, Cloneable
{
    /**
     * Atributo descrição da informação
     */
    private String descricao;
    /**
     * Atributo valor da informação
     */
    private String valor;

    /**
     * Método que mostra a descrição da informação
     * @return String -
     */
    public String getDescricao() 
    {
        return descricao;
    }

    /**
     * Método que altera a descrição da informação
     * @param descricao -
     */
    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    /**
     * Método que mostra o valor da informação
     * @return String -
     */
    public String getValor() 
    {
        return valor;
    }

    /**
     * Método que altera o valor da informação
     * @param valor -
     */
    public void setValor(String valor) 
    {
        this.valor = valor;
    }   

    /**
     * Reescrita de método que mostra informações da informação
     * @return String -
     */
    @Override
    public String toString() 
    {
        return " descricao = " + descricao + ", valor = " + valor;
    }
    
    /**
     * Reescrita de método clone que clona uma informação
     * @return Informacao - 
     * @throws CloneNotSupportedException - usada para fazer o clone
     */
    public Informacao clone() throws CloneNotSupportedException 
    {
          return (Informacao)super.clone();
    }
}
