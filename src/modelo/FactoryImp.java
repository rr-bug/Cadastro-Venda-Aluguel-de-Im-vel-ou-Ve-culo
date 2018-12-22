package modelo;

import classes.AluguelImp;
import classes.ApartamentoAluguel;
import classes.ApartamentoVenda;
import classes.CarroAluguel;
import classes.CarroVenda;
import classes.CasaAluguel;
import classes.CasaVenda;
import classes.Cliente;
import classes.MotoAluguel;
import classes.TerrenoVenda;
import classes.VendaImp;
import interfaces.Factory;
import interfaces.Produto;
import java.io.Serializable;
import java.util.Date;

/**
 * Class Factory que implementa Factory que é um dos padrões de projeto
 * @author Rayana
 */
public class FactoryImp implements Factory, Serializable, Cloneable       
{
    /**
     * Método que gera um objeto de acordo com o nome de parâmetro
     * @param nome -
     * @return Object
     */
    @Override
    public Object gerarProduto(String nome) 
    {
        if(nome.equals("") || nome == null)
        {
            return null;
        }
        else if(nome.toUpperCase().equals("DATE"))
        {
            return new Date();
        }
        else if(nome.toUpperCase().equals("DATA"))
        {
            return new Data();
        }
        else if(nome.toUpperCase().equals("PERIODO"))
        {
            return new Periodo();
        }
        else if(nome.toUpperCase().equals("ALUGUELIMP"))
        {
            return new AluguelImp();
        }
        else if(nome.toUpperCase().equals("VENDAIMP"))
        {
            return new VendaImp();
        }
        else if(nome.toUpperCase().equals("CLIENTE"))
        {
            return new Cliente();
        }
        else if(nome.toUpperCase().equals("CASAVENDA"))
        {
            return new CasaVenda();
        }
        else if(nome.toUpperCase().equals("CASAALUGUEL"))
        {
            return new CasaAluguel();
        }
        else if(nome.toUpperCase().equals("TERRENOVENDA"))
        {
            return new TerrenoVenda();
        }
        else if(nome.toUpperCase().equals("MOTOALUGUEL"))
        {
            return new MotoAluguel();
        }
        else if(nome.toUpperCase().equals("CARROVENDA"))
        {
            return new CarroVenda();
        }
        else if(nome.toUpperCase().equals("CARROALUGUEL"))
        {
            return new CarroAluguel();
        }
        else if(nome.toUpperCase().equals("APARTAMENTOVENDA"))
        {
            return new ApartamentoVenda();
        }
        else if(nome.toUpperCase().equals("APARTAMENTOALUGUEL"))
        {
            return new ApartamentoAluguel();
        }
        return null;
    }  
    
    /**
     * Método que gera um clone em relação ao produto que passa pelo parâmetro
     * @param p -
     * @return Object -
     */
    @Override
    public Object gerarCloneProduto(Produto p) 
    {
        String nome = p.getClass().getSimpleName();
        if(nome.equals("") || nome == null)
        {
            return null;
        }
        else if(nome.toUpperCase().equals("ALUGUELIMP"))
        {
            try 
            {
                return ((AluguelImp)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("VENDAIMP"))
        {
            try 
            {
                return ((VendaImp)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("CASAVENDA"))
        {
            try 
            {
                return ((CasaVenda)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("CASAALUGUEL"))
        {
            try 
            {
                return ((CasaAluguel)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("TERRENOVENDA"))
        {
            try 
            {
                return ((TerrenoVenda)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("MOTOALUGUEL"))
        {
            try 
            {
                return ((MotoAluguel)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("CARROVENDA"))
        {
            try 
            {
                return ((CarroVenda)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("CARROALUGUEL"))
        {
            try 
            {
                return ((CarroAluguel)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("APARTAMENTOVENDA"))
        {
            try 
            {
                return ((ApartamentoVenda)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        else if(nome.toUpperCase().equals("APARTAMENTOALUGUEL"))
        {
            try 
            {
                return ((ApartamentoAluguel)p).clone();
            }
            catch (CloneNotSupportedException e)
            {
                System.out.println ("Clone deu errado" );
            }
        }
        return null;
    }    
}
