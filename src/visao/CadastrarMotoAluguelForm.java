package visao;

import classes.MotoAluguel;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class CadastrarMotoAluguelForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa
     */
    Empresa empresa;
     
    /**
     * Construtor padrão
     */
    public CadastrarMotoAluguelForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com parâmetros
     * @param empresa -
     */
    public CadastrarMotoAluguelForm(Empresa empresa) 
    {
        initComponents();
        this.empresa = empresa;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cadastrarTreinador = new javax.swing.JButton();
        solicitaNome = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        valorDiaria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        foto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        cadastrarTreinador.setText("Cadastrar Moto Aluguel");
        cadastrarTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarTreinadorActionPerformed(evt);
            }
        });

        solicitaNome.setText("Valor Diária");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição");

        jLabel2.setText("Foto");

        jLabel3.setText("Ano");

        jLabel4.setText("OffRoad");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Sim");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Não");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(valorDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                .addComponent(descricao)
                                .addComponent(foto)
                                .addComponent(ano))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(cadastrarTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(31, 31, 31)
                .addComponent(cadastrarTreinador)
                .addGap(64, 64, 64)
                .addComponent(sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * Método de cadastrar moto aluguel
     * @param evt -
     */
    private void cadastrarTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTreinadorActionPerformed
        MotoAluguel motoAluguel = (MotoAluguel) empresa.getFactory().gerarProduto("motoaluguel");
        String  variavelTexto;
        boolean cadastrar = true;
        int variavelInt;
        double variavelDouble;
        if(jRadioButton1.isSelected())
        {
            motoAluguel.setOffRoad(true);
        }
        else if(jRadioButton2.isSelected())
        {
            motoAluguel.setOffRoad(false);
        }
        else
        {
            cadastrar = false;
        }
        if(valorDiaria.getText().isEmpty() || descricao.getText().isEmpty() || 
           foto.getText().isEmpty() || ano.getText().isEmpty() || cadastrar == false)
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, assim não será efetuado o cadastro");
        }
        else
        {
            variavelTexto = valorDiaria.getText();
            variavelDouble = Double.parseDouble(variavelTexto);
            motoAluguel.setValorDiaria(variavelDouble);
            variavelTexto = descricao.getText();
            motoAluguel.setDescricao(variavelTexto);
            variavelTexto = foto.getText();
            motoAluguel.setFoto(variavelTexto);
            variavelTexto = ano.getText();
            variavelInt = Integer.parseInt(variavelTexto);
            motoAluguel.setAno(variavelInt);
            motoAluguel.setCodigo(empresa.getProdutos().size()+1);
        
            if(empresa.adicionaProduto(motoAluguel))
            {
                Serializador.gravarObjeto(empresa, "banco_dados_empresa.ser");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Não conseguiu cadastrar");
            }
        }
        valorDiaria.setText("");
        descricao.setText("");
        foto.setText("");
        ano.setText("");
        buttonGroup1.clearSelection();
        valorDiaria.requestFocus();
    }//GEN-LAST:event_cadastrarTreinadorActionPerformed

    /**
     * Método de sair
     * @param evt -
     */
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastrarTreinador;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton sair;
    private javax.swing.JLabel solicitaNome;
    private javax.swing.JTextField valorDiaria;
    // End of variables declaration//GEN-END:variables
}
