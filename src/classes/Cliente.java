package classes;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Cliente implements Serializable, Cloneable
{
    private long cpf = 0;
    private String nome;

    public long getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        try
        {
            this.cpf = Long.parseLong(cpf);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Cpf inválido, digite só números");
        }
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
    public String toString() 
    {
        return "cpf = " + cpf + ", nome = " + nome;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 29 * hash + (int) (this.cpf ^ (this.cpf >>> 32));
        return hash;
    }

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
        final Cliente other = (Cliente) obj;
        if (this.cpf != other.cpf) 
        {
            return false;
        }
        return true;
    }
    
    public Cliente clone() throws CloneNotSupportedException 
    {
          return (Cliente)super.clone();
    }
}
