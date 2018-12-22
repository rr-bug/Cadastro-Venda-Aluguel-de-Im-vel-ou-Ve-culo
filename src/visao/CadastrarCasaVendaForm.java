package visao;

import classes.CasaVenda;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class CadastrarCasaVendaForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa
     */
    Empresa empresa;
     
    /**
     * Construtor padrão
     */
    public CadastrarCasaVendaForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com parâmetro
     * @param empresa -
     */
    public CadastrarCasaVendaForm(Empresa empresa) 
    {
        initComponents();
        this.empresa = empresa;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        cadastrarTreinador = new javax.swing.JButton();
        solicitaNome = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        valorVenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        foto = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        cadastrarTreinador.setText("Cadastrar Casa Venda");
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

        jLabel4.setText("Área Construída");

        jLabel5.setText("Térrea");

        jLabel6.setText("Piscina");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Sim");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Não");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Sim");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Não");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(valorVenda)
                                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(endereco, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(foto)
                                        .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(cadastrarTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addComponent(cadastrarTreinador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * Método de cadastrar casa venda
     * @param evt 
     */
    private void cadastrarTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTreinadorActionPerformed
        CasaVenda casaVenda = (CasaVenda) empresa.getFactory().gerarProduto("casavenda");
        String  variavelTexto;
        boolean cadastrar = true;
        double variavelDouble;
        if(jRadioButton1.isSelected())
        {
            casaVenda.setTerrea(true);
        }
        else if(jRadioButton2.isSelected())
        {
            casaVenda.setTerrea(false);
        }
        else
        {
            cadastrar = false;
        }
        if(jRadioButton3.isSelected())
        {
            casaVenda.setPiscina(true);
        }
        else if(jRadioButton4.isSelected())
        {
            casaVenda.setPiscina(false);
        }
        else
        {
            cadastrar = false;
        }
        if(valorVenda.getText().isEmpty() || descricao.getText().isEmpty() || foto.getText().isEmpty()
           || endereco.getText().isEmpty() || area.getText().isEmpty() || cadastrar == false)
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, assim não será efetuado o cadastro");
        }
        else
        {
            variavelTexto = valorVenda.getText();
            variavelDouble = Double.parseDouble(variavelTexto);
            casaVenda.setValorVenda(variavelDouble);
            casaVenda.setCodigo(empresa.getProdutos().size()+1);
            variavelTexto = descricao.getText();
            casaVenda.setDescricao(variavelTexto);
            variavelTexto = foto.getText();
            casaVenda.setFoto(variavelTexto);
            variavelTexto = endereco.getText();
            casaVenda.setEndereco(variavelTexto);
            variavelTexto = area.getText();
            variavelDouble = Double.parseDouble(variavelTexto);
            casaVenda.setAreaConstruida(variavelDouble);

           if(empresa.adicionaProduto(casaVenda))
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
        area.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
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
    private javax.swing.JTextField area;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cadastrarTreinador;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JButton sair;
    private javax.swing.JLabel solicitaNome;
    private javax.swing.JTextField valorVenda;
    // End of variables declaration//GEN-END:variables
}
