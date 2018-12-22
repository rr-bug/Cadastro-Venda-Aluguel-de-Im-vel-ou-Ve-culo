package visao;

import classes.Cliente;
import excecoes.ExceptionCpfInexistente;
import excecoes.ExceptionVendaNaoEfetuada;
import interfaces.Produto;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Ferramentas;
import modelo.Serializador;

/**
 * JInternalFrame 
 * @author Rayana
 */
public class PropostaComercialVendaForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa para adicionar os produtos, clientes, alugueis, vendas, etc
     */
    private Empresa empresa;
    /**
     * Atributo produto
     */
    Produto p;
    
    /**
     * Construtor padrão
     */
    public PropostaComercialVendaForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor com parâmetros de acordo com necessidade
     * @param empresa -
     * @param pro -
     */
    public PropostaComercialVendaForm(Empresa empresa, Produto pro) 
    {
        initComponents();
        cpf.requestFocus();
        this.empresa = empresa;   
        this.empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        p = pro;
        dadosProduto.setText(p.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dadosProduto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jButtonSair.setText("sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        dadosProduto.setColumns(20);
        dadosProduto.setRows(5);
        jScrollPane1.setViewportView(dadosProduto);

        jLabel1.setText("CPF do Cliente");

        jButton1.setText("Realizar Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método de sair
     * @param evt -
     */
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * Método que vende um produto
     * @param evt -
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        long variavelLong = -1;
        
        if(cpf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, assim não será efetuado o cadastro");
        }
        else
        {
            variavelLong = Ferramentas.verificaCpf(cpf.getText());
            if(Serializador.recuperarObjeto("banco_dados_empresa.ser") != null)
            {
                empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
            }
            if(empresa != null)
            {
                Cliente cliente = null;
                try 
                {
                    cliente = empresa.encontrarCliente(variavelLong);
                } 
                catch (ExceptionCpfInexistente ex) 
                {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
                if(cliente != null)
                {
                    //não precisa tratar, pois é do tipo runtime
                    if(empresa.venderProduto(p, cliente))
                    {
                        Serializador.gravarObjeto(empresa, "banco_dados_empresa.ser");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Não conseguiu vender");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Não conseguiu vender");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Não conseguiu vender");
            }
        }
        cpf.setText("");
        cpf.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpf;
    private javax.swing.JTextArea dadosProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
