package visao;

import classes.TerrenoVenda;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Serializador;

/**s
 * @author Rayana
 */
public class CadastrarTerrenoVendaForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa
     */
    Empresa empresa;
     
    /**
     * Construtor padrão
     */
    public CadastrarTerrenoVendaForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com parâmetro
     * @param empresa -
     */
    public CadastrarTerrenoVendaForm(Empresa empresa) 
    {
        initComponents();
        this.empresa = empresa;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        cadastrarTreinador = new javax.swing.JButton();
        solicitaNome = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        valorVenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        foto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qtdMuros = new javax.swing.JTextField();

        jTextField3.setText("jTextField3");

        cadastrarTreinador.setText("Cadastrar Terreno Venda");
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

        jLabel1.setText("Foto");

        jLabel2.setText("Descrição");

        jLabel3.setText("Endereço");

        jLabel4.setText("Quantidade de Muros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(valorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(qtdMuros, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(75, 75, 75)
                                    .addComponent(descricao))
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(121, 121, 121)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(cadastrarTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(qtdMuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(cadastrarTreinador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * Método de cadastrar terreno venda
     * @param evt -
     */
    private void cadastrarTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTreinadorActionPerformed
        TerrenoVenda terrenoVenda = (TerrenoVenda) empresa.getFactory().gerarProduto("terrenovenda");
        String  variavalTexto;
        int variavelInt;
        double variavelDouble;
        if(valorVenda.getText().isEmpty() || foto.getText().isEmpty() || descricao.getText().isEmpty()
          || endereco.getText().isEmpty() || qtdMuros.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, assim não será efetuado o cadastro");
        }
        else
        {
            variavalTexto = valorVenda.getText();
            variavelDouble = Double.parseDouble(variavalTexto);
            terrenoVenda.setValorVenda(variavelDouble);
            terrenoVenda.setCodigo(empresa.getProdutos().size()+1);
            variavalTexto = foto.getText();
            terrenoVenda.setFoto(variavalTexto);
            variavalTexto = descricao.getText();
            terrenoVenda.setDescricao(variavalTexto);
            variavalTexto = endereco.getText();
            terrenoVenda.setEndereco(variavalTexto);
            variavalTexto = qtdMuros.getText();
            variavelInt = Integer.parseInt(variavalTexto);
            terrenoVenda.setQuantidadeMuros(variavelInt);
        
            if(empresa.adicionaProduto(terrenoVenda))
            {
                Serializador.gravarObjeto(empresa, "banco_dados_empresa.ser");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Não conseguiu cadastrar");
            }    
        }
        valorVenda.setText("");
        foto.setText("");
        descricao.setText("");
        endereco.setText("");
        qtdMuros.setText("");
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
    private javax.swing.JButton cadastrarTreinador;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField qtdMuros;
    private javax.swing.JButton sair;
    private javax.swing.JLabel solicitaNome;
    private javax.swing.JTextField valorVenda;
    // End of variables declaration//GEN-END:variables
}
