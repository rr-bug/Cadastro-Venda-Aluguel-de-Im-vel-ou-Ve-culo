package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Rayana
 */
public class Periodo implements Serializable, Cloneable
{
    /**
     * Atributo data de início do período
     */
    private Date inicio;
    /**
     * Atributo data de fim do períodos
     */
    private Date fim;

    /**
     * Método que mostra a data de início do período
     * @return Date -
     */
    public Date getInicio() 
    {
        return inicio;
    }

    /**
     * Método que altera a data início do período
     * @param inicio -
     */
    public void setInicio(Date inicio) 
    {
        this.inicio = inicio;
    }

    /**
     * Método que mostra a data final do período
     * @return Date
     */
    public Date getFim() 
    {
        return fim;
    }

    /**
     * Método que altera a data fim do período
     * @param fim -
     */
    public void setFim(Date fim) 
    {
        this.fim = fim;
    }

    /**
     * Reescrita de método que mostra informações do período
     * @return String -
     */
    @Override
    public String toString()
    {
        
        Data dataI = new Data();
        Data dataF = new Data();
        dataI.setDia(this.inicio.getDate());
        dataI.setMes(this.inicio.getMonth()+1);
        dataI.setAno(this.inicio.getYear()+1900);
        dataF.setDia(this.fim.getDate());
        dataF.setMes(this.fim.getMonth()+1);
        dataF.setAno(this.fim.getYear()+1900);
        return "[inicio = " + dataI + ", fim = " + dataF + ']';
    }
    
    /**
     * Reescrita de método clone do objeto Período
     * @return Periodo -
     * @throws CloneNotSupportedException - usada para o clone
     */
    public Periodo clone() throws CloneNotSupportedException 
    {
          return (Periodo)super.clone();
    }
}
