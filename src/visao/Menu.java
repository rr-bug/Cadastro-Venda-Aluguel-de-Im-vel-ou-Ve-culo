package visao;

import excecoes.ExceptionCodigoInexistente;
import interfaces.Produto;
import interfaces.ProdutoAlugavel;
import interfaces.ProdutoVendavel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Ferramentas;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class Menu extends javax.swing.JFrame 
{
    /**
     * Atributo empresa para uso de todos os seus atributos
     */
    private Empresa empresa = new Empresa();
    /**
     * Atributo lista de objetos para informações de empresa
     */
    private List<Object> informacoesEmpresa;            
    
    /**
     * Construtor padrão com uso de cadastro da empresa apenas uma vez
     */
    public Menu() 
    {
        initComponents();
        if(Serializador.lerArquivo1("dadosEmpresa.ser") == null)
        {
            informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
            if(informacoesEmpresa == null)
            {
                String cnpj;
                cnpj = JOptionPane.showInputDialog(null, "Digite o cnpj da empresa: ");
                while(cnpj.isEmpty())
                {
                    cnpj = JOptionPane.showInputDialog(null, "Digite o cnpj da empresa: ");
                }
                try
                {
                    empresa.setCnpj(Long.parseLong(cnpj));
                    Object o = (Object) cnpj;
                    informacoesEmpresa = new ArrayList();
                    if(informacoesEmpresa.add(o))
                    {
                        Serializador.gravarArquivo1(informacoesEmpresa, "dadosEmpresa.ser");
                    }
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(rootPane,"CNPJ inválido, digite só números");
                    throw new NumberFormatException("CNPJ inválido, digite só números");
                }
                
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        motoAluguel = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        cadastroTerrenoVendaForm = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        editMenuPartidas = new javax.swing.JMenu();
        ListarTreinadorMenuItem = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastro Produto");

        jMenuItem13.setText("Lista de Informação de Produto");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem13);

        motoAluguel.setText("Moto Aluguel");
        motoAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motoAluguelActionPerformed(evt);
            }
        });
        fileMenu.add(motoAluguel);

        jMenuItem3.setText("Carro Aluguel");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem3);

        jMenuItem4.setText("Carro Venda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem4);

        cadastroTerrenoVendaForm.setMnemonic('s');
        cadastroTerrenoVendaForm.setText("Terreno Venda");
        cadastroTerrenoVendaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTerrenoVendaFormActionPerformed(evt);
            }
        });
        fileMenu.add(cadastroTerrenoVendaForm);

        jMenuItem5.setText("Casa Aluguel");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem5);

        jMenuItem6.setText("Casa Venda");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem6);

        jMenuItem7.setText("Apartamento Venda");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem7);

        jMenuItem8.setText("Apartamento Aluguel");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem8);

        menuBar.add(fileMenu);

        jMenu3.setText("Cadastro Cliente");

        jMenuItem9.setText("Cliente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        menuBar.add(jMenu3);

        jMenu1.setText("Proposta Comercial");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        menuBar.add(jMenu1);

        editMenuPartidas.setMnemonic('e');
        editMenuPartidas.setText("Listagem");

        ListarTreinadorMenuItem.setMnemonic('p');
        ListarTreinadorMenuItem.setText("Produtos");
        ListarTreinadorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTreinadorMenuItemActionPerformed(evt);
            }
        });
        editMenuPartidas.add(ListarTreinadorMenuItem);

        jMenuItem10.setText("Clientes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        editMenuPartidas.add(jMenuItem10);

        jMenuItem11.setText("Alugados");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        editMenuPartidas.add(jMenuItem11);

        jMenuItem12.setText("Vendidos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        editMenuPartidas.add(jMenuItem12);

        menuBar.add(editMenuPartidas);

        jMenu2.setText("Exit");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de terreno venda
     * @param evt -
     */
    private void cadastroTerrenoVendaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTerrenoVendaFormActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        CadastrarTerrenoVendaForm form = new CadastrarTerrenoVendaForm(this.empresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_cadastroTerrenoVendaFormActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de listar produto
     * @param evt -
     */
    private void ListarTreinadorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTreinadorMenuItemActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        ListarProdutoForm form = new ListarProdutoForm(this.empresa, this.informacoesEmpresa);
        this.desktopPane.add(form);
        form.setVisible(true);         
    }//GEN-LAST:event_ListarTreinadorMenuItemActionPerformed

    /**
     * Método de sair
     * @param evt -
     */
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de moto aluguel
     * @param evt -
     */
    private void motoAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoAluguelActionPerformed
            if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
            {
                empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
            }
            CadastrarMotoAluguelForm form = new CadastrarMotoAluguelForm(this.empresa);
            this.desktopPane.add(form);
            form.setVisible(true);       
    }//GEN-LAST:event_motoAluguelActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de carro aluguel
     * @param evt -
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        CadastrarCarroAluguelForm form = new CadastrarCarroAluguelForm(this.empresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de carro venda
     * @param evt -
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        CadastrarCarroVendaForm form = new CadastrarCarroVendaForm(this.empresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de casa aluguel
     * @param evt -
     */
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        CadastrarCasaAluguelForm form = new CadastrarCasaAluguelForm(this.empresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de casa venda
     * @param evt -
     */
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        CadastrarCasaVendaForm form = new CadastrarCasaVendaForm(this.empresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de apartamento venda
     * @param evt -
     */
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        CadastrarApartamentoVendaForm form = new CadastrarApartamentoVendaForm(this.empresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de apartamento aluguel
     * @param evt -
     */
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        CadastrarApartamentoAluguelForm form = new CadastrarApartamentoAluguelForm(this.empresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de cliente
     * @param evt -
     */
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        CadastrarClienteForm form = new CadastrarClienteForm(this.empresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de listar cliente
     * @param evt -
     */
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        ListarClienteForm form = new ListarClienteForm(this.empresa, this.informacoesEmpresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de listar alugados
     * @param evt -
     */
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        ListarAlugadosForm form = new ListarAlugadosForm(this.empresa, this.informacoesEmpresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de listar vendidos
     * @param evt -
     */
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        ListarVendidosForm form = new ListarVendidosForm(this.empresa, this.informacoesEmpresa);
        this.desktopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    /**
     * Método que recupera do arquivo dados e vai para JInternalFrame de cadastro de informação em um certo produto
     * @param evt -
     */
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        String codigo;
        int codigoInt = -1;
        codigo = JOptionPane.showInputDialog(null, "Digite o código do produto: ");
        if(codigo.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, assim não será efetuado o cadastro");
        }
        else
        {
            codigoInt = Ferramentas.verificaCodigo(codigo);            
            Produto p = null;
            try
            {
                p = empresa.encontrarProduto(codigoInt);
            } 
            catch (ExceptionCodigoInexistente ex)
            {
                JOptionPane.showMessageDialog(rootPane,ex.getMessage());
            }
            if(p != null)
            {
                CadastrarInformacaoForm form = new CadastrarInformacaoForm(this.empresa, p);
                this.desktopPane.add(form);
                form.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Código Inexistente, inserção de informações em produto não efetuada");
            }
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        if(Serializador.lerArquivo1("dadosEmpresa.ser") == null)
        {
            informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
        }
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        String codigo;
        int codigoInt = -1;
        codigo = JOptionPane.showInputDialog(null, "Digite o código do produto: ");
        Produto pro = null;
        try 
        {
            pro = empresa.encontrarProduto(codigoInt);
        }
        catch (ExceptionCodigoInexistente ex) 
        {
            JOptionPane.showMessageDialog(rootPane,ex.getMessage());
        }
        if(pro != null)
        {
                if(pro instanceof ProdutoAlugavel)
                {
                    PropostaComercialAluguelForm form = new PropostaComercialAluguelForm(this.empresa,pro);
                    this.desktopPane.add(form);
                    form.setVisible(true);
                }
                else if(pro instanceof ProdutoVendavel)
                {
                    PropostaComercialVendaForm form = new PropostaComercialVendaForm(this.empresa,pro);
                    this.desktopPane.add(form);
                    form.setVisible(true);
                }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Código Inexistente");
        }
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        if(Serializador.lerArquivo1("dadosEmpresa.ser") == null)
        {
            informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
        }
        if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
        {
            empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        }
        String codigo;
        int codigoInt = -1;
        codigo = JOptionPane.showInputDialog(null, "Digite o código do produto: ");
        if(codigo.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, assim não será efetuado o cadastro");
        }
        else
        {
            codigoInt = Ferramentas.verificaCodigo(codigo);
            Produto pro = null;
            try 
            {
                pro = empresa.encontrarProduto(codigoInt);
            } 
            catch (ExceptionCodigoInexistente ex) 
            {
                JOptionPane.showMessageDialog(rootPane,ex.getMessage());
            }
                    if(pro instanceof ProdutoAlugavel)
                    {
                        PropostaComercialAluguelForm form = new PropostaComercialAluguelForm(this.empresa, pro);
                        this.desktopPane.add(form);
                        form.setVisible(true);
                    }
                    else if(pro instanceof ProdutoVendavel)
                    {
                        PropostaComercialVendaForm form = new PropostaComercialVendaForm(this.empresa,pro);
                        this.desktopPane.add(form);
                        form.setVisible(true);
                    }
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ListarTreinadorMenuItem;
    private javax.swing.JMenuItem cadastroTerrenoVendaForm;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenuPartidas;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem motoAluguel;
    // End of variables declaration//GEN-END:variables
}
