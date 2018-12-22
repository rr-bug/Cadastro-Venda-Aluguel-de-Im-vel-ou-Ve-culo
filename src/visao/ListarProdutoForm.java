package visao;

import interfaces.Produto;
import java.util.List;
import modelo.Empresa;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class ListarProdutoForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa
     */
    private Empresa empresa;
    /**
     * Atributo lista de objeto com informações de empresa
     */
    private List<Object> informacoesEmpresa;
    
    /**
     * Construtor padrão
     */
    public ListarProdutoForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com os parâmetros
     * @param empresa -
     * @param informacoesEmpresa -
     */
    public ListarProdutoForm(Empresa empresa, List<Object> informacoesEmpresa) 
    {
        initComponents();
        this.informacoesEmpresa = informacoesEmpresa;
        this.empresa = empresa;              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListarProdutos = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dadosProduto = new javax.swing.JTextArea();
        dadosEmpresa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        ListarProdutos.setText("Listar Produtos");
        ListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarProdutosActionPerformed(evt);
            }
        });

        jButtonSair.setText("sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        dadosProduto.setColumns(20);
        dadosProduto.setRows(5);
        jScrollPane1.setViewportView(dadosProduto);

        jButton1.setText("Código");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Menor Preço Venda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Menor Preço Diária");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(dadosEmpresa)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ListarProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(0, 342, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListarProdutos)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(dadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Lista os produtos
     * @param evt -
     */
    private void ListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarProdutosActionPerformed
        informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
        empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        
        if(informacoesEmpresa != null)
        {
            dadosEmpresa.setText("CNPJ: " + informacoesEmpresa.get(0).toString());
        }
        else
        {
            dadosEmpresa.setText("Não tem informações de empresa");
        }
        String resumo="";
        if(empresa != null)
        {
            if(!empresa.getProdutos().isEmpty())
            {
                for(Produto p : empresa.getProdutos())
                {
                    resumo += p.toString() + "\n";
                }
                dadosProduto.setText(resumo);
            }
            else
            {
                dadosProduto.setText("Não tem informações de produtos");
            }
        }
        else
        {
            dadosProduto.setText("Não tem informações de produtos");
        }
    }//GEN-LAST:event_ListarProdutosActionPerformed

    /**
     * Método de sair
     * @param evt -
     */
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * Método de listar produtos por menor preço diária
     * @param evt -
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
        empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        
        if(informacoesEmpresa != null)
        {
            dadosEmpresa.setText("CNPJ: " + informacoesEmpresa.get(0).toString());
        }
        else
        {
            dadosEmpresa.setText("Não tem informações de empresa");
        }
        String resumo="";
        if(empresa != null)
        {
            if(!empresa.listarProdutoPorMenorPrecoDiaria().isEmpty())
            {
                for(Produto p : empresa.listarProdutoPorMenorPrecoDiaria())
                {
                    resumo += p.toString() + "\n";
                }
                dadosProduto.setText(resumo);
            }
            else
            {
                dadosProduto.setText("Não tem informações de produtos");
            }
        }
        else
        {
            dadosProduto.setText("Não tem informações de produtos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Método de listar produtos por menor preço venda
     * @param evt -
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
        empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        
        if(informacoesEmpresa != null)
        {
            dadosEmpresa.setText("CNPJ: " + informacoesEmpresa.get(0).toString());
        }
        else
        {
            dadosEmpresa.setText("Não tem informações de empresa");
        }
        String resumo="";
        if(empresa != null)
        {
            if(!empresa.listarProdutosPorMenorPrecoVenda().isEmpty())
            {
                for(Produto p : empresa.listarProdutosPorMenorPrecoVenda())
                {
                    resumo += p.toString() + "\n";
                }
                dadosProduto.setText(resumo);
            }
            else
            {
                dadosProduto.setText("Não tem informações de produtos");
            }
        }
        else
        {
            dadosProduto.setText("Não tem informações de produtos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Método de listar produtos por código
     * @param evt -
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
        empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        
        if(informacoesEmpresa != null)
        {
            dadosEmpresa.setText("CNPJ: " + informacoesEmpresa.get(0).toString());
        }
        else
        {
            dadosEmpresa.setText("Não tem informações de empresa");
        }
        String resumo="";
        if(empresa != null)
        {
            if(!empresa.listarProdutosPorCodigo().isEmpty())
            {
                for(Produto p : empresa.listarProdutosPorCodigo())
                {
                    resumo += p.toString() + "\n";
                }
            }
            else
            {
                dadosProduto.setText("Não tem informações de produtos");
            }
        }
        else
        {
            dadosProduto.setText("Não tem informações de produtos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarProdutos;
    private javax.swing.JTextField dadosEmpresa;
    private javax.swing.JTextArea dadosProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
