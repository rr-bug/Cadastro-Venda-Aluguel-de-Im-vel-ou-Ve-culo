package modelo;

import javax.swing.JOptionPane;

/**
 * @author Rayana
 */
public class Ferramentas 
{
    /**
     * Método estático que altera o cpf do cliente e verifica se ele é válido ou não
     * @param cpf -
     * @return long - 
     */
    public static long verificaCpf(String cpf)
    {
        long a;
        try
        {
            a = Long.parseLong(cpf);
            return a;
        }
        catch (NumberFormatException n) 
        {
            JOptionPane.showMessageDialog(null,"Cpf inválido, digite só números");
        }
        return -1;
    }
    
    /**
     * Método estático que veririfa o código do produto e verifica se é válido ou não
     * @param codigo -
     * @return int -
     */
    public static int verificaCodigo(String codigo) 
    {  
        int a;
        try
        {
            a = Integer.parseInt(codigo);
            return a;
        }
        catch (NumberFormatException n) 
        {
            JOptionPane.showMessageDialog(null,"Código inválido, digite só números");
        }
        return -1;
    }
}
