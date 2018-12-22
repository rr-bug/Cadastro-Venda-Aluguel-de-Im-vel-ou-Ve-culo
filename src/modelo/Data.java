package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Rayana
 */
public class Data implements Serializable 
{
    /**
     * Atributo dia da data
     */
    private int dia;
    /**
     * Atributo mes da data
     */
    private int mes;
    /**
     * Atributo ano da data
     */
    private int ano;

    /**
     * Calcula e retorna a diferenca em dias entre uma data informada como parametro.
     * @param d a data a partir da qual se deseja calcular a diferenca
     * @return diferenca em dias, que pode ser negativo (quando o parametro d
     * representar uma data menor) ou positivo (quando d representar uma data
     * maior). Se o retorno for ZERO as datas são iguais.
     */
    public int diferencaEmDias(Data d) 
    {
        Calendar d1 = new GregorianCalendar(this.getAno(), this.getMes() - 1, this.getDia());
        Calendar d2 = new GregorianCalendar(d.getAno(), d.getMes() - 1, d.getDia());
        long diferenca = (d1.getTimeInMillis() - d2.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        return (int) diferenca;
    }

    /**
     * Diminui a data em uma quantidade determinada de dias
     * @param dias a quantidade de dias que a data deve ser diminuida
     */
    public void diminuiDias(int dias) 
    {
        this.acrescentaDias(dias * -1);
    }

    /**
     * Acrescenta a data em uma quantidade determinada de dias
     * @param dias a quantidade de dias que a data deve ser acrescida
     */
    public void acrescentaDias(int dias) 
    {
        Calendar calendar = new GregorianCalendar(this.getAno(), this.getMes() - 1, this.getDia());
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        this.setDia(calendar.get(GregorianCalendar.DAY_OF_MONTH));
        this.setMes(calendar.get(GregorianCalendar.MONTH) + 1);
        this.setAno(calendar.get(GregorianCalendar.YEAR));
    }

    /**
     * Método estático que mostra a data atual
     * @return Data -
     */
    public static Data getDataAtual() 
    {
        Calendar today = GregorianCalendar.getInstance();
        Data hoje = new Data();
        hoje.setDia(today.get(GregorianCalendar.DAY_OF_MONTH));
        hoje.setMes(today.get(GregorianCalendar.MONTH) + 1);
        hoje.setAno(today.get(GregorianCalendar.YEAR));
        return hoje;
    }

    /**
     * Reescrita do método que mostra informação de uma data
     * @return String -
     */
    @Override
    public String toString() 
    {
        return dia + "/" + mes + "/" + ano;
    }

    /**
     * Método que motra o dia da data 
     * @return int -
     */
    public int getDia() 
    {
        return dia;
    }

    /**
     * Método que altera o dia da data
     * @param dia -
     */
    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    /**
     * Método que mostra o mês da data
     * @return int -
     */
    public int getMes() 
    {
        return mes;
    }

    /**
     * Método que altera o mês da data
     * @param mes -
     */
    public void setMes(int mes) 
    {        
        this.mes = mes>=1&&mes<=12?mes:this.mes;
    }

    /**
     * Método que mostra o ano da data
     * @return int -
     */
    public int getAno()
    {
        return ano;
    }

    /**
     * Método que altera o ano da data
     * @param ano -
     */
    public void setAno(int ano) 
    {
        this.ano = ano;
    }

    /**
     * Reescrita do método que faz um clone da data
     * @return Object -
     */
    @Override
    public Object clone()
    {
        return new Data(this.dia, this.mes, this.ano);
    }

    /**
     * Construtor padrão
     */
    public Data() 
    {
    }

    /**
     * Construtor completo
     * @param dia -
     * @param mes -
     * @param ano -
     */
    public Data(int dia, int mes, int ano) 
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    /**
     * Sobrecarga de método que altera a data mas usando como string
     * @param data -
     */
    public Data(String data)
    {
        this.setData(data);
    }
    
    /**
     * Método que verifica se uma data está no formato correto
     * @param data
     * @return boolean
     */
    public boolean setData(String data)
    {
        String campos [] = data.split("/");
        this.setDia(Integer.parseInt(campos[0]));
        this.setMes(Integer.parseInt(campos[1]));
        this.setAno(Integer.parseInt(campos[1]));
        return true;
    }
}
