package modelo;

import classes.Cliente;
import classes.AluguelImp;
import classes.VendaImp;
import abstratas.ImovelAlugavelImp;
import classes.ApartamentoAluguel;
import classes.CarroAluguel;
import classes.CasaAluguel;
import classes.MotoAluguel;
import comparadores.ComparadorAlugueisPorCodigo;
import comparadores.ComparadorClientePorNome;
import comparadores.ComparadorProdutoPorCodigo;
import comparadores.ComparadorProdutoPorMenorPrecoDiaria;
import comparadores.ComparadorProdutoPorMenorPrecoVenda;
import comparadores.ComparadorVendasPorCodigo;
import excecoes.ExceptionCodigoInexistente;
import excecoes.ExceptionCpfInexistente;
import excecoes.ExceptionVendaNaoEfetuada;
import interfaces.Aluguel;
import interfaces.Factory;
import interfaces.ImovelVendavel;
import interfaces.Produto;
import interfaces.ProdutoAlugavel;
import interfaces.ProdutoVendavel;
import interfaces.Venda;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 * @author Rayana
 */
public class Empresa implements Serializable
{
    /**
     * Atributo cnpj
     */
    private long cnpj;
    /**
     * Atributo nome
     */
    private String nome;
    /**
     * Atributo endereco =
     */
    private String endereco;
    /**
     * Atributo de um set de produto
     */
    private Set<Produto> produtos = new HashSet();
    /**
     * Atributo de um set de alugados
     */
    private Set<Aluguel> alugados = new HashSet();
    /**
     * Atributo de um set de vendidos
     */
    private Set<Venda> vendidos = new HashSet();
    /**
     * Atributo de um set de cliente
     */
    private Set<Cliente> clientes = new HashSet();
    /**
     * Atributo factory do padrão de projeto
     */
    Factory factory = new FactoryImp();
        
    /**
     * Construtor completo
     * @param cnpj -
     * @param nome -
     * @param endereco -
     */
    public Empresa(long cnpj, String nome, String endereco) 
    {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        produtos = new HashSet();
    }
    
    /**
     * Método que mostra o factory do padrão de projeto
     * @return Factory
     */
    public Factory getFactory()
    {
        return this.factory;
    }
    
    /**
     * Construtor padrão
     */
    public Empresa()
    {
    }
    
    /**
     * Método que adiciona um cliente no set clientes
     * @param c -
     * @return boolean -
     */
    public boolean adicionaCliente(Cliente c)
    {
        if(c == null)
        {
            return false;
        } 
        this.clientes.add(c);
        return true;
    }
        
    /**
     * Método que procura no set de produtos a partir do código um produto vendável
     * @param codigoProduto -
     * @return ProdutoVendavel
     */
    public ProdutoVendavel encontrarProdutoVendido(int codigoProduto) throws ExceptionCodigoInexistente 
    {
        ProdutoVendavel p1 = null; 
        ProdutoVendavel clone;
        if(this.produtos.size()==0)
        {
            return null;
        }
        for(Produto p : this.produtos)
        {
            if(p.getCodigo() == codigoProduto)
            {
                p1 = (ProdutoVendavel) p;
            }
        }
        if(p1 == null)
        {
            throw new ExceptionCodigoInexistente("Código Inexistente");
        }
        clone = (ProdutoVendavel) this.getFactory().gerarCloneProduto(p1);
        return clone;
    }
    
    /**
     * Método que procura no set de produtos a partir do código um produto alugável
     * @param codigoProduto -
     * @return ProdutoAlugavel
     */
    public ProdutoAlugavel encontrarProdutoAlugado(int codigoProduto) throws ExceptionCodigoInexistente 
    {
        ProdutoAlugavel p1 = null; 
        ProdutoAlugavel clone;
        if(this.produtos.size()==0)
        {
            return null;
        }
        for(Produto p : this.produtos)
        {
            if(p.getCodigo() == codigoProduto)
            {
                p1 = (ProdutoAlugavel) p;
            }
        }
        if(p1 == null)
        {
            throw new ExceptionCodigoInexistente("Código Inexistente");
        }
        clone = (ProdutoAlugavel) this.getFactory().gerarCloneProduto(p1);
        return clone;
    }
    
    /**
     * Método que procura no set de clientes a partir do cpf um cliente
     * @param cpfCliente -
     * @return Cliente
     */
    public Cliente encontrarCliente(long cpfCliente) throws ExceptionCpfInexistente 
    {
        Cliente c1 = null; 
        Cliente clone = null;
        if(this.clientes.size()==0)
        {
            return null;
        }
        for(Cliente c : this.clientes)
        {
            if(c.getCpf() == cpfCliente)
            {
                c1 = c;
            }
        }
        if(c1 == null)
        {
            throw new ExceptionCpfInexistente("Código Inexistente");
        }
        try 
        {
            clone = c1.clone();
        } 
        catch (CloneNotSupportedException ex) 
        {
            System.out.println("Clone deu errado");
        }
        return clone;
    }
    
    /**
     * Método que procura no set de produtos a partir do código um produto
     * @param codigo -
     * @return Produto
     */
    public Produto encontrarProduto(int codigo) throws ExceptionCodigoInexistente
    {
        Produto p1 = null; 
        Produto clone;
        if(this.produtos.size()==0)
        {
            return null;
        }
        for(Produto p : this.produtos)
        {
            if(p.getCodigo() == codigo)
            {
                p1 = p;
            }
        }
        if(p1 == null)
        {
            throw new ExceptionCodigoInexistente("Código Inexistente");
        }
        clone = (Produto) this.getFactory().gerarCloneProduto(p1);
        return p1;
    }
    
    public boolean venderProduto(Produto p, Cliente c) throws ExceptionVendaNaoEfetuada
    {
        boolean podeVender = true;
        if(this.vendidos.size() == 0)
        {
            podeVender = true;
        }    
        else
        {
            for(Venda v : this.vendidos)
            {
                if(v.getProdutoVendavel().equals((ProdutoVendavel)p))
                {
                    throw new ExceptionVendaNaoEfetuada("Venda não efetuada");
                }  
            }    
        }
        if((podeVender == false))
        {
            throw new ExceptionVendaNaoEfetuada("Venda não efetuada");
        }
        VendaImp vendaImp = (VendaImp) this.getFactory().gerarProduto("vendaimp");
        vendaImp.setCodigo(this.vendidos.size()+10);
        vendaImp.setCliente(c);
        vendaImp.setProdutoVendavel((ProdutoVendavel) p);
        vendaImp.setData(Data.getDataAtual());
        this.vendidos.add(vendaImp);
        return true;
    }
   
    /**
     * Método que aluga um produto para um cliente
     * @param p -
     * @param c -
     * @param dataInicial -
     * @param dataFinal -
     * @return boolean -
     * @throws ParseException - usada para verificar a formatação da data
     */
    public boolean alugarProduto(Produto p, Cliente c, String dataInicial, String dataFinal) throws ParseException 
    {        
        Date d = (Date) this.getFactory().gerarProduto("date");
        d.setDate(Data.getDataAtual().getDia());
        d.setMonth(Data.getDataAtual().getMes());
        d.setYear(Data.getDataAtual().getAno());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataI = null;
        Date dataF = null;
        try
        {
            dataI = formato.parse(dataInicial);
            dataF = formato.parse(dataFinal);
        }
        catch(ParseException e)
        {
            System.out.println("erro formatação data");
        }
        
        if(dataI == null || dataF == null)
        {
            return false;
        }
        
        if(dataI.after(d) || dataF.after(d))
        {
            return false;
        }
        
        boolean disponivel = true;
        if(this.alugados.size() == 0)
        {
            disponivel = true;
        }
        else
        {
            for(Aluguel a : this.alugados)
            {
                    if(a.getProdutoAlugado().equals(p))
                    {
                            if((dataI.compareTo(a.getPeriodo().getInicio())>=0 && dataI.compareTo(a.getPeriodo().getFim())<=0) ||
                                dataF.compareTo(a.getPeriodo().getInicio())>=0 && dataF.compareTo(a.getPeriodo().getFim())<=0)
                            {
                                disponivel = false;
                            }
                            else if(dataI.compareTo(a.getPeriodo().getInicio())<=0 && dataF.compareTo(a.getPeriodo().getFim())>=0)
                            {
                                disponivel = false;
                            }
                    }
                    else
                    {
                        disponivel = false;
                    }
            }
        }
        if(disponivel == false)
        {
            return false;
        }
        if((dataF.compareTo(dataI)<0))
        {
            return false;
        }
        AluguelImp aluguelImp = (AluguelImp) this.getFactory().gerarProduto("aluguelimp");
        aluguelImp.setCodigo(this.alugados.size()+20);
        aluguelImp.setCliente(c);
        Periodo periodo = (Periodo) this.getFactory().gerarProduto("periodo");
        periodo.setFim(dataF);
        periodo.setInicio(dataI);
        aluguelImp.setPeriodo(periodo);
        aluguelImp.setProdutoAlugado((ProdutoAlugavel) p);
        double valorMensal;
        int dias;
        Data d1 = (Data) this.getFactory().gerarProduto("data");
        d1.setDia(periodo.getInicio().getDate());
        d1.setMes(periodo.getInicio().getMonth()+1);
        d1.setAno(periodo.getInicio().getYear()+1900);
        Data d2 = (Data) this.getFactory().gerarProduto("data");
        d2.setDia(periodo.getFim().getDate());
        d2.setMes(periodo.getFim().getMonth()+1);
        d2.setAno(periodo.getFim().getYear()+1900);
        dias = (d1.diferencaEmDias(d2))*-1;
        dias++;
        System.out.println("dias: " + dias);
        int diaria = dias % 30;
        int meses = dias / 30;
        valorMensal = ((((ProdutoAlugavel) p).getValorDiaria()) * diaria);
        if(p instanceof ApartamentoAluguel)
        {
            valorMensal += meses * ((ApartamentoAluguel)p).getValorMensalDiario();
        }
        else if(p instanceof CasaAluguel)
        {
            valorMensal += meses * ((CasaAluguel)p).getValorMensalDiario();
        }
        else if(p instanceof CarroAluguel)
        {
            valorMensal += meses * ((CarroAluguel)p).getValorMensalDiario();
        }
        else if(p instanceof MotoAluguel)
        {
            valorMensal += meses * ((MotoAluguel)p).getValorMensalDiario();
        }
        else
        {
            System.out.println("Erro, p não é do tipo alugável");
        }
        aluguelImp.setValorMensalFinal(valorMensal);
        
        this.alugados.add(aluguelImp);
        return true;
    }
    
    /**
     * Método que adiciona um produto no set de produtos
     * @param produto -
     * @return boolean -
     */
    public boolean adicionaProduto(Produto produto)
    {
        if(produto == null)
        {
            return false;
        } 
        this.produtos.add(produto);
        return true;
    }
    
    /**
     * Mostra as informações de produto
     * @return String -
     */
    public String listarProdutos()
    {
        String s = "";
        for(Produto p: produtos)
        {
            s += p.toString() + "\n";
        }
        return s;
    }  
    
    /**
     * Método que lista os produtos por código
     * @return List -
     */
    public List<Produto> listarProdutosPorCodigo()
    {
        List<Produto> produtosP = new ArrayList();       
        produtosP.addAll(this.produtos);
        Collections.sort(produtosP, new ComparadorProdutoPorCodigo());
        return produtosP;
    }
    
    /**
     * Método que lista os produtos por menor preço venda
     * @return List -
     */
    public List<ProdutoVendavel> listarProdutosPorMenorPrecoVenda()
    {
        List<ProdutoVendavel> produtosP = new ArrayList();       
        for(Produto p : this.produtos)
        {
            if(p instanceof ProdutoVendavel)
            {
                produtosP.add((ProdutoVendavel) p);
            }
        }
        Collections.sort(produtosP, new ComparadorProdutoPorMenorPrecoVenda());
        return produtosP;
    }
    
    /**
     * Método de listar produtos por menor preço diária
     * @return List -
     */
    public List<ProdutoAlugavel> listarProdutoPorMenorPrecoDiaria()
    {
        List<ProdutoAlugavel> produtosP = new ArrayList();       
        for(Produto p : this.produtos)
        {
            if(p instanceof ProdutoAlugavel)
            {
                produtosP.add((ProdutoAlugavel) p);
            }
        }
        Collections.sort(produtosP, new ComparadorProdutoPorMenorPrecoDiaria());
        return produtosP;
    }
    
    /**
     * Método que lista as vendas por código
     * @return List -
     */
    public List<Venda> listarVendasPorCodigo()
    {
        List<Venda> produtosP = new ArrayList();       
        produtosP.addAll(this.vendidos);
        Collections.sort(produtosP, new ComparadorVendasPorCodigo());
        return produtosP;
    }
    
    /**
     * Método que lista alugados por código
     * @return List -
     */
    public List<Aluguel> listarAlugadosPorCodigo()
    {
        List<Aluguel> produtosP = new ArrayList();       
        produtosP.addAll(this.alugados);
        Collections.sort(produtosP, new ComparadorAlugueisPorCodigo());
        return produtosP;
    }
    
    /**
     * Método que lista clientes por nome
     * @return List -
     */
    public List<Cliente> listarClientePorNome()
    {
        List<Cliente> produtosP = new ArrayList();       
        produtosP.addAll(this.clientes);
        Collections.sort(produtosP, new ComparadorClientePorNome());
        return produtosP;
    }
    
    /**
     * Método que mostra os alugados
     * @return Set -
     */
    public Set<Aluguel> listarAlugadosSet()
    {
        return this.alugados;
    }
    
    /**
     * Método que mostra as vendas
     * @return Set -
     */
    public Set<Venda> listarVendidosSet()
    {
        return this.vendidos;
    }
    
    /**
     * Método que mostra os imóveis na venda
     * @return Set -
     */
    public Set<Produto> listarImoveisVenda()
    {
        Set<Produto> imoveisVenda = new HashSet();       
        for(Produto p: produtos)
        {
            if(p instanceof ImovelVendavel)
            {
                imoveisVenda.add(p);
            }
        }
        return imoveisVenda;
    }  
        
    /**
     * Método que mostra os imóveis alugados
     * @return Set -
     */
    public Set<Produto> listarImoveisAlugaveis()
    {
        Set<Produto> imoveisAluguel = new HashSet();        
        for(Produto p: produtos)
        {
            if(p instanceof ImovelAlugavelImp)
            {
                imoveisAluguel.add(p);
            }
        }
        return imoveisAluguel;
    }
         
    /**
     * Método que mostra produtos
     * @return Set -
     */
    public Set<Produto> getProdutos()
    {
        return produtos;
    }
    
    /**
     * Método que mostra clientes
     * @return Set -
     */
    public Set<Cliente> getClientes()
    {
        return clientes;
    }
        
    /**
     * Método que mostra cnpj de empresa
     * @return long -
     */
    public long getCnpj()
    {
        return cnpj;
    }

    /**
     * Método que altera cnpj de empresa
     * @param cnpj -
     */
    public void setCnpj(long cnpj) 
    {
        this.cnpj = cnpj;
    }

    /**
     * Método que mostra nome de empresa
     * @return String -
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * Método que altera o nome da empresa
     * @param nome -
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * Método que mostra endereço de empresa
     * @return String -
     */
    public String getEndereco() 
    {
        return endereco;
    }

    /**
     * Método que altera o endereço da empresa
     * @param endereco -
     */
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    /**
     * Reescrita de método que mostra informações de empresa
     * @return String -
     */
    @Override
    public String toString() 
    {
        return "nome = " + nome + ", cnpj = " + cnpj +  ", endereco = " + endereco;
    }

    /**
     * Método que gera o hashCode de empresa
     * @return int -
     */
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 13 * hash + (int) (this.cnpj ^ (this.cnpj >>> 32));
        return hash;
    }

    /**
     * Método que verifica se duas empresas são iguais a partir do seu cnpj
     * @param obj -
     * @return boolean
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
        final Empresa other = (Empresa) obj;
        if (this.cnpj != other.cnpj) 
        {
            return false;
        }
        return true;
    }    
}