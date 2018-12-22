package visao;

import interfaces.Produto;
import interfaces.Venda;
import java.util.List;
import modelo.Empresa;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class ListarVendidosForm extends javax.swing.JInternalFrame 
{
    /**
     * Atributo empresa 
     */
    private Empresa empresa;
    /**
     * Atributo lista de objetos com informações de empresa
     */
    private List<Object> informacoesEmpresa;
    
    /**
     * Construtor padrão
     */
    public ListarVendidosForm() 
    {
        initComponents();
    }
    
    /**
     * Construtor de acordo com os parâmetros de necessidade
     * @param empresa -
     * @param informacoesEmpresa -
     */
    public ListarVendidosForm(Empresa empresa, List<Object> informacoesEmpresa) 
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
        dadosVendidos = new javax.swing.JTextArea();
        dadosEmpresa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        ListarClientes.setText("Listar Vendidos");
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

        dadosVendidos.setColumns(20);
        dadosVendidos.setRows(5);
        jScrollPane1.setViewportView(dadosVendidos);

        jButton1.setText("Código");
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
                        .addGap(374, 374, 374)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dadosEmpresa)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ListarClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListarClientes)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Lista as vendas
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
            if(!empresa.listarVendidosSet().isEmpty())
            {
                for(Venda v : empresa.listarVendidosSet())
                {
                    resumo += v.toString() + "\n";
                }
                dadosVendidos.setText(resumo);
            }
            else
            {
                dadosVendidos.setText("Não tem informações de vendidos");
            }
        }
        else
        {
            dadosVendidos.setText("Não tem informações de vendidos");
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
     * Lista as vendas por código
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
            if(!empresa.listarVendasPorCodigo().isEmpty())
            {
                for(Venda v : empresa.listarVendasPorCodigo())
                {
                    resumo += v.toString() + "\n";
                }
                dadosVendidos.setText(resumo);
            }
            else
            {
                dadosVendidos.setText("Não tem informações de vendidos");
            }
        }
        else
        {
            dadosVendidos.setText("Não tem informações de vendidos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarClientes;
    private javax.swing.JTextField dadosEmpresa;
    private javax.swing.JTextArea dadosVendidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
