package visao;

import interfaces.Aluguel;
import java.util.List;
import modelo.Empresa;
import modelo.Serializador;

/**
 * @author Rayana
 */
public class ListarAlugadosForm extends javax.swing.JInternalFrame 
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
    public ListarAlugadosForm() 
    {
        initComponents();
    }
    
    /**
     * Construto de acordo com parâmetros
     * @param empresa -
     * @param informacoesEmpresa -
     */
    public ListarAlugadosForm(Empresa empresa, List<Object> informacoesEmpresa) 
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
        dadosAlugados = new javax.swing.JTextArea();
        dadosEmpresa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        ListarClientes.setText("Listar Alugados");
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

        dadosAlugados.setColumns(20);
        dadosAlugados.setRows(5);
        jScrollPane1.setViewportView(dadosAlugados);

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
                .addGap(366, 366, 366)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosEmpresa)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ListarClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 653, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método de listar alugados
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
            if(!empresa.listarAlugadosSet().isEmpty())
            {
                for(Aluguel a : empresa.listarAlugadosSet())
                {
                    resumo += a.toString() + "\n";
                }
                dadosAlugados.setText(resumo);
            }
            else
            {
                dadosAlugados.setText("Não tem informações de produtos alugados");
            }
        }
        else
        {
            dadosAlugados.setText("Não tem informações de produtos alugados");
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
     * Método de listar alugados por código
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
            if(!empresa.listarAlugadosPorCodigo().isEmpty())
            {
                for(Aluguel a : empresa.listarAlugadosPorCodigo())
                {
                    resumo += a.toString() + "\n";
                }
                dadosAlugados.setText(resumo);
            }
            else
            {
                dadosAlugados.setText("Não tem informações de produtos alugados");
            }
        }
        else
        {
            dadosAlugados.setText("Não tem informações de produtos alugados");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarClientes;
    private javax.swing.JTextArea dadosAlugados;
    private javax.swing.JTextField dadosEmpresa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
