package visao;

import java.util.List;
import classes.Cliente;
import modelo.Empresa;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class ListarClienteForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa
     */
    private Empresa empresa;
    /**
     * Atributo lista de objetos com informções de empresa
     */
    private List<Object> informacoesEmpresa;
    
    /**
     * Construtor padrãos
     */
    public ListarClienteForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com os parâmetros 
     * @param empresa -
     * @param informacoesEmpresa -
     */
    public ListarClienteForm(Empresa empresa, List<Object> informacoesEmpresa) 
    {
        initComponents();
        this.empresa = empresa;   
        this.informacoesEmpresa = informacoesEmpresa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListarClientes = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dadosCliente = new javax.swing.JTextArea();
        dadosEmpresa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        ListarClientes.setText("Listar Clientes");
        ListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClientesActionPerformed(evt);
            }
        });

        jButtonSair.setText("sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        dadosCliente.setColumns(20);
        dadosCliente.setRows(5);
        jScrollPane1.setViewportView(dadosCliente);

        jButton1.setText("Nome");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ListarClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 665, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(dadosEmpresa))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListarClientes)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(dadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método de listar clientes
     * @param evt -
     */
    private void ListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClientesActionPerformed
        informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
        empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        
        if(informacoesEmpresa!=null)
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
            if(!empresa.getClientes().isEmpty())
            {
                for(Cliente c : empresa.getClientes())
                {
                    resumo += c.toString() + "\n";
                }
                dadosCliente.setText(resumo);
            }
            else
            {
                dadosCliente.setText("Não tem informações de clientes");
            }
        }
        else
        {
            dadosCliente.setText("Não tem informações de clientes");
        }
    }//GEN-LAST:event_ListarClientesActionPerformed

    /**
     * Método de sair
     * @param evt -
     */
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * Método de listar clientes por nome
     * @param evt -
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        informacoesEmpresa = Serializador.lerArquivo1("dadosEmpresa.ser");
        empresa = (Empresa)Serializador.recuperarObjeto("banco_dados_empresa.ser");
        
        if(informacoesEmpresa!=null)
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
            if(!empresa.listarClientePorNome().isEmpty())
            {
                for(Cliente c : empresa.listarClientePorNome())
                {
                    resumo += c.toString() + "\n";
                }
                dadosCliente.setText(resumo);
            }
            else
            {
                dadosCliente.setText("Não tem informações de clientes");
            }
        }
        else
        {
            dadosCliente.setText("Não tem informações de clientes");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarClientes;
    private javax.swing.JTextArea dadosCliente;
    private javax.swing.JTextField dadosEmpresa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
