package visao;

import classes.ApartamentoVenda;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class CadastrarApartamentoVendaForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa
     */
    Empresa empresa;
     
    /**
     * Construtor padrão
     */
    public CadastrarApartamentoVendaForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com parâmetro
     * @param empresa -
     */
    public CadastrarApartamentoVendaForm(Empresa empresa) 
    {
        initComponents();
        this.empresa = empresa;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarTreinador = new javax.swing.JButton();
        solicitaNome = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        valorVenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        foto = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        andar = new javax.swing.JTextField();

        cadastrarTreinador.setText("Cadastrar Apartamento Venda");
        cadastrarTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarTreinadorActionPerformed(evt);
            }
        });

        solicitaNome.setText("Valor Venda");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição");

        jLabel2.setText("Foto");

        jLabel3.setText("Endereço");

        jLabel4.setText("Andar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorVenda)
                    .addComponent(descricao)
                    .addComponent(foto)
                    .addComponent(endereco)
                    .addComponent(andar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(237, 237, 237))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadastrarTreinador)
                        .addGap(334, 334, 334))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(andar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(cadastrarTreinador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * Método de cadastrar apartamento venda
     * @param evt -
     */
    private void cadastrarTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTreinadorActionPerformed
        ApartamentoVenda apartamentoVenda = (ApartamentoVenda) empresa.getFactory().gerarProduto("apartamentovenda");
        String  variavelTexto;
        double variavelDouble;
        int variavelInt;
        if(valorVenda.getText().isEmpty() || descricao.getText().isEmpty() || foto.getText().isEmpty()
           || andar.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, assim não será efetuado o cadastro");
        }
        else
        {
            variavelTexto = valorVenda.getText();
            variavelDouble = Double.parseDouble(variavelTexto);
            apartamentoVenda.setValorVenda(variavelDouble);
            apartamentoVenda.setCodigo(empresa.getProdutos().size()+1);
            variavelTexto = descricao.getText();
            apartamentoVenda.setDescricao(variavelTexto);
            variavelTexto = foto.getText();
            apartamentoVenda.setFoto(variavelTexto);
            variavelTexto = endereco.getText();
            apartamentoVenda.setEndereco(variavelTexto);
            variavelTexto = andar.getText();
            variavelInt = Integer.parseInt(variavelTexto);
            apartamentoVenda.setAndar(variavelInt);

            if(empresa.adicionaProduto(apartamentoVenda))
            {
                Serializador.gravarObjeto(empresa, "banco_dados_empresa.ser");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Não conseguiu cadastrar");
            }
        }
        valorVenda.setText("");
        descricao.setText("");
        foto.setText("");
        endereco.setText("");
        andar.setText("");
        valorVenda.requestFocus();
    }//GEN-LAST:event_cadastrarTreinadorActionPerformed

    /**
     * Método de sair
     * @param evt -
     */
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField andar;
    private javax.swing.JButton cadastrarTreinador;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sair;
    private javax.swing.JLabel solicitaNome;
    private javax.swing.JTextField valorVenda;
    // End of variables declaration//GEN-END:variables
}
