package visao;

import classes.Cliente;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class CadastrarClienteForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa
     */
    Empresa empresa;
     
    /**
     * Construtor padrão
     */
    public CadastrarClienteForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com parâmetro
     * @param empresa -
     */
    public CadastrarClienteForm(Empresa empresa) 
    {
        initComponents();
        this.empresa = empresa;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarCliente = new javax.swing.JButton();
        solicitaNome = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        cpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();

        cadastrarCliente.setText("Cadastrar Cliente");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });

        solicitaNome.setText("CPF");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cpf)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(cadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(cadastrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * Método de cadastrar cliente
     * @param evt -
     */
    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        Cliente cliente = (Cliente) empresa.getFactory().gerarProduto("cliente");
        String  variavelTexto;
        if(cpf.getText().isEmpty() || nome.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, então não será cadastrado");
        }
        else
        {
            cliente.setCpf(cpf.getText());
            if(cliente.getCpf() != 0)
            {
                variavelTexto = nome.getText();
                cliente.setNome(variavelTexto);       
                if(empresa.adicionaCliente(cliente))
                {
                    Serializador.gravarObjeto(empresa, "banco_dados_empresa.ser");
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane,"Não conseguiu cadastrar");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Não conseguiu cadastrar");
            }
        }
        cpf.setText("");
        nome.setText("");
        cpf.requestFocus();
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    /**
     * Método de sair
     * @param evt -
     */
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JTextField cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton sair;
    private javax.swing.JLabel solicitaNome;
    // End of variables declaration//GEN-END:variables
}
