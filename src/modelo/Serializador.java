package modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

/**
 * @author Rayana
 */
public class Serializador implements Serializable 
{  
    /**
     * Método que grava objeto em um arquivo
     * @param o -  
     * @param nomeArquivo -
     * @return boolean
     */
    public static boolean gravarObjeto(Object o, String nomeArquivo)
    {
        if(o == null)
        {
            return false;
        }
        Empresa empresa = (Empresa)o;
        FileOutputStream os = null; 
        ObjectOutputStream output = null; 
        try 
        {
            os = new FileOutputStream(nomeArquivo);
            output = new ObjectOutputStream(os);
            output.writeObject(empresa);           
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("\nErro ao abrir o arquivo");
            //e.printStackTrace();
        } 
        catch (NotSerializableException e) 
        {
            System.out.println("\nObjeto nao serializavel");
        } 
        catch (IOException e) 
        {
            System.out.println("\nErro de entrada e saida no arquivo");
        } 
        finally
        {
            if (os != null)
            {
                try 
                {
                    os.close();
                    output.close();
                } 
                catch (IOException e)
                {
                    System.out.println("\nErro ao fechar o arquivo");
                }
            }
        }
        return true;
    }    
    
    /**
     * Método que recupera objeto do arquivo
     * @param nomeArquivo -
     * @return Object -
     */
    public static Object recuperarObjeto(String nomeArquivo)
    {        
        Empresa empresa = null;
        FileInputStream is = null;
        ObjectInputStream input = null;      
        try 
        {
            is = new FileInputStream(nomeArquivo);
            input = new ObjectInputStream(is);
            try 
            {
                while (true) 
                {
                    empresa = (Empresa) input.readObject();
                }
            } 
            catch (EOFException e)
            {
                System.out.println("\nObjeto recuperado, fim do arquivo");
               
            } 
            catch (ClassNotFoundException ex) 
            {
                System.out.println("\nClasse não encontrada");
            }
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("\nErro ao abrir o arquivo");
        } 
        catch (IOException e) 
        {
            System.out.println("\nErro de entrada e saida no arquivo");
        } 
        finally 
        {
            if (is != null) 
            {
                try 
                {
                    input.close();
                    is.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("\nErro ao fechar o arquivo");
                }
            }
        }                   
        return empresa;
    }
    
    /**
     * Método que grava uma lista de objeto em um arquivo
     * @param lista -
     * @param nomeArq - 
     */
    public static void gravarArquivo1(List<Object> lista, String nomeArq) 
    {
        OutputStream os = null;
        ObjectOutputStream output = null;
        try 
        {
            os =  new FileOutputStream(nomeArq);
            output = new ObjectOutputStream(os);
            output.writeObject(lista);
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("Erro ao abrir o arquivo");            
        } 
        catch (NotSerializableException e) 
        {
            System.out.println("Objeto nao serializavel");
        } 
        catch (IOException e) 
        {
            System.out.println("Erro de entrada e saida no arquivo");
        } 
        finally 
        {
            if (os != null)
            {
                try 
                {
                    os.close();
                    System.out.println("Arquivo de saida fechado");
                } 
                catch (IOException e)
                {
                    System.out.println("Erro ao fechar o arquivo");
                }
            }
        }
    }
    
    /**
     * Método que recupera de um arquivo uma lista de objetos
     * @param nomeArq -
     * @return List
     */
    public static List<Object> lerArquivo1(String nomeArq) 
    {
      List<Object> lista = null;
      ObjectInputStream input = null;
      InputStream is = null;
      try 
      {
           is = new FileInputStream(nomeArq);
           input = new ObjectInputStream(is);
           try 
           {
               lista = (List<Object>)input.readObject(); 
           } 
           catch (EOFException e) 
           {
                System.out.println("Telefones recuperados");
                System.out.println("Fim do arquivo");
           } 
           catch (ClassNotFoundException ex) 
           {
                System.out.println("Classe nao encontrada");
           }
      } 
      catch (FileNotFoundException e) 
      {
            System.out.println("Erro ao abrir o arquivo");            
      } 
      catch (IOException e) 
      {
            System.out.println("Erro de entrada e saida no arquivo");            
      } 
      finally 
      {
            if (is != null)
            {
                try
                {
                    is.close();
                    System.out.println("Arquivo de entrada fechado");
                } 
                catch (IOException e) 
                {
                    System.out.println("Erro ao fechar o arquivo");
                }
            }
        } 
        return lista;
    }
}
