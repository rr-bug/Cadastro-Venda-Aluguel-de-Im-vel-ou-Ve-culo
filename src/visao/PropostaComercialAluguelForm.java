package visao;

import classes.Cliente;
import excecoes.ExceptionCpfInexistente;
import interfaces.Produto;
import java.text.ParseException;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Ferramentas;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class PropostaComercialAluguelForm extends javax.swing.JInternalFrame 
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
    public PropostaComercialAluguelForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com a necessidade de parâmetros
     * @param empresa -
     * @param pro -
     */
    public PropostaComercialAluguelForm(Empresa empresa,Produto pro) 
    {
        initComponents();
        this.empresa = empresa;   
        p = pro;
        dadosProdutos.setText(p.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dadosProdutos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dataInicial = new javax.swing.JTextField();
        dataFinal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButtonSair.setText("sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        dadosProdutos.setColumns(20);
        dadosProdutos.setRows(5);
        jScrollPane1.setViewportView(dadosProdutos);

        jLabel1.setText("CPF do Cliente");

        jLabel2.setText("Data Inicial");

        jLabel3.setText("Data Final");

        jButton1.setText("Realizar Aluguel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ex.: 03/12/2018");

        jLabel5.setText("Ex.: 15/12/2018");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addGap(5, 5, 5))
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
     * Método de alugar produto
     * @param evt -
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String variavelTexto;
        long variavelLong = -1;
        
        if(cpf.getText().isEmpty() || dataInicial.getText().isEmpty() || dataFinal.getText().isEmpty())
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
                    JOptionPane.showMessageDialog(rootPane,"Cpf inexistente");
                }
                if(cliente != null)
                {
                    try 
                    {
                        if(!empresa.alugarProduto(p, cliente, dataInicial.getText(), dataFinal.getText()))
                        {
                            JOptionPane.showMessageDialog(rootPane, "Não conseguiu alugar");
                        }
                        else
                        {
                            Serializador.gravarObjeto(empresa, "banco_dados_empresa.ser");
                        }
                    } 
                    catch (ParseException ex) 
                    {
                        JOptionPane.showMessageDialog(rootPane,"Formato de Data Errado... Ex.: 03/12/2018");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Não conseguiu alugar");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Não conseguiu alugar");
            }
        }
        
        cpf.setText("");
        dataInicial.setText("");
        dataFinal.setText("");
        cpf.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpf;
    private javax.swing.JTextArea dadosProdutos;
    private javax.swing.JTextField dataFinal;
    private javax.swing.JTextField dataInicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
