package visao;

import abstratas.ProdutoImp;
import interfaces.Produto;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Informacao;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class CadastrarInformacaoForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa
     */
    Empresa empresa;
    /**
     * Atributo produto
     */
    Produto produto;
     
    /**
     * Construtor padrão
     */
    public CadastrarInformacaoForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com parâmetro
     * @param empresa -
     * @param p -
     */
    public CadastrarInformacaoForm(Empresa empresa, Produto p) 
    {
        initComponents();
        this.empresa = empresa;        
        produto = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarInformacao = new javax.swing.JButton();
        solicitaNome = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        descricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();

        cadastrarInformacao.setText("Cadastrar Informação");
        cadastrarInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarInformacaoActionPerformed(evt);
            }
        });

        solicitaNome.setText("Descrição");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(descricao)
                                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(cadastrarInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solicitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(cadastrarInformacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * Método que cadastra informação de produto
     * @param evt -
     */
    private void cadastrarInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarInformacaoActionPerformed
        Informacao informacao = new Informacao();
        String  variavelTexto;
        if(descricao.getText().isEmpty() || valor.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Algum campo está nulo, assim não será efetuado o cadastro");
        }
        else
        {
            variavelTexto = descricao.getText();
            informacao.setDescricao(variavelTexto);
            variavelTexto = valor.getText();
            informacao.setValor(variavelTexto);        
        
            for(Produto p1 : empresa.getProdutos())
            {
                if(p1.equals(produto))
                {
                    if(((ProdutoImp)p1).adicionaInformacao(informacao))
                    {
                        Serializador.gravarObjeto(empresa, "banco_dados_empresa.ser");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane,"Não conseguiu cadastrar");
                    }
                }
            }
        }        
        descricao.setText("");
        valor.setText("");
        descricao.requestFocus();
    }//GEN-LAST:event_cadastrarInformacaoActionPerformed

    /**
     * Método de sair
     * @param evt -
     */
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarInformacao;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sair;
    private javax.swing.JLabel solicitaNome;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
