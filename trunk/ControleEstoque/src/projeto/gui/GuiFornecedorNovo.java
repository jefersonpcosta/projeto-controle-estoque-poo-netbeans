/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Cidade;
import projeto.modelo.to.Endereco;
import projeto.modelo.to.Fornecedor;

/**
 *
 * @author Daniel
 */
public class GuiFornecedorNovo extends javax.swing.JFrame {
    public static Fachada fachada = new Fachada();
    /**
     * Creates new form GuiFornecedorNovo
     */
    public GuiFornecedorNovo() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GuiFornecedorNovo().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFiltro = new javax.swing.JPanel();
        jLabelCNPJ = new javax.swing.JLabel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldEntradaRS = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jTextFieldEntradaLog = new javax.swing.JTextField();
        jButtonPesquisaCNPJ = new javax.swing.JButton();
        jButtonPesquisaCEP = new javax.swing.JButton();
        jLabelCidade = new javax.swing.JLabel();
        jComboBoxCidade = new javax.swing.JComboBox();
        jButtonGerenciarCidade = new javax.swing.JButton();
        jLabelNumero = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jButtonSalvarFornecedor = new javax.swing.JButton();
        jFormattedTextFieldEntradaNumero = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEntradaCNPJ = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEntradaCEP = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Fornecedor");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanelFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        jLabelCNPJ.setText("CNPJ.:");

        jLabelRazaoSocial.setText("Razão Social.:");

        jTextFieldEntradaRS.setEditable(false);

        jLabelCEP.setText("CEP.:");

        jTextFieldEntradaLog.setEditable(false);
        jTextFieldEntradaLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntradaLogActionPerformed(evt);
            }
        });

        jButtonPesquisaCNPJ.setText("Pesquisar");
        jButtonPesquisaCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaCNPJActionPerformed(evt);
            }
        });

        jButtonPesquisaCEP.setText("Pesquisar");
        jButtonPesquisaCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaCEPActionPerformed(evt);
            }
        });

        jLabelCidade.setText("Cidade.:");

        jButtonGerenciarCidade.setText("Gerenciar Cidade");
        jButtonGerenciarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenciarCidadeActionPerformed(evt);
            }
        });

        jLabelNumero.setText("Número.:");

        jLabelLogradouro.setText("Logradouro.:");

        jButtonSalvarFornecedor.setText("Salvar Fornecedor");
        jButtonSalvarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFornecedorActionPerformed(evt);
            }
        });

        jFormattedTextFieldEntradaNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));

        try {
            jFormattedTextFieldEntradaCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldEntradaCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelFiltroLayout = new javax.swing.GroupLayout(jPanelFiltro);
        jPanelFiltro.setLayout(jPanelFiltroLayout);
        jPanelFiltroLayout.setHorizontalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumero)
                    .addComponent(jLabelCEP)
                    .addComponent(jLabelCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFiltroLayout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldEntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabelCidade))
                    .addComponent(jFormattedTextFieldEntradaCNPJ)
                    .addComponent(jFormattedTextFieldEntradaCEP))
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltroLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabelRazaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEntradaRS))
                    .addGroup(jPanelFiltroLayout.createSequentialGroup()
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonPesquisaCNPJ)
                                    .addGroup(jPanelFiltroLayout.createSequentialGroup()
                                        .addComponent(jButtonPesquisaCEP)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelLogradouro))))
                            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                                .addComponent(jButtonGerenciarCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jButtonSalvarFornecedor))
                            .addComponent(jTextFieldEntradaLog))))
                .addContainerGap())
        );
        jPanelFiltroLayout.setVerticalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltroLayout.createSequentialGroup()
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCNPJ)
                            .addComponent(jButtonPesquisaCNPJ)
                            .addComponent(jFormattedTextFieldEntradaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCEP)
                            .addComponent(jButtonPesquisaCEP)
                            .addComponent(jFormattedTextFieldEntradaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumero)
                            .addComponent(jLabelCidade)
                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGerenciarCidade)
                            .addComponent(jFormattedTextFieldEntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFiltroLayout.createSequentialGroup()
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRazaoSocial)
                            .addComponent(jTextFieldEntradaRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEntradaLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLogradouro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvarFornecedor)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Cidade cid;
        ArrayList<Cidade> listaCd;
        try {
            listaCd = (ArrayList<Cidade>) fachada.listarCidadeTudo();
            for (Iterator<Cidade> it = listaCd.iterator(); it.hasNext();) {
                cid = it.next();
                jComboBoxCidade.addItem(cid.getCidades_Nome());
            }
        } catch (GeralException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_formComponentShown

    private void jTextFieldEntradaLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntradaLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntradaLogActionPerformed

    private void jButtonGerenciarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenciarCidadeActionPerformed
        GuiCidade cidade = new GuiCidade();
        cidade.setVisible(true);
    }//GEN-LAST:event_jButtonGerenciarCidadeActionPerformed

    private void jButtonPesquisaCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaCEPActionPerformed
        pesquisarCEP();
    }//GEN-LAST:event_jButtonPesquisaCEPActionPerformed

    private void jButtonPesquisaCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaCNPJActionPerformed
        pesquisarCNPJ();
    }//GEN-LAST:event_jButtonPesquisaCNPJActionPerformed

    private void jButtonSalvarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFornecedorActionPerformed
        salvarFornecedor();
    }//GEN-LAST:event_jButtonSalvarFornecedorActionPerformed
    
    private void salvarFornecedor() {
        int resposta;
        int fornecedores_Codigo = 0;
        String fornecedores_CNPJ;
        String fornecedores_RazaoSocial;
        int fornecedores_NumeroResidencia;
        int enderecos_Codigo;
        String enderecos_CEP;
        String enderecos_Logradouro;
        int cidades_Codigo;
        String cidades_Nome;
        String str_cep;
        String str_cnpj;
        try {
            str_cnpj = jFormattedTextFieldEntradaCNPJ.getText();
            str_cnpj = str_cnpj.replace('.', ' ');
            str_cnpj = str_cnpj.replace('/', ' ');
            str_cnpj = str_cnpj.replace('-', ' ');
            str_cnpj = str_cnpj.replaceAll(" ", "");
            fornecedores_CNPJ = str_cnpj;
            fornecedores_RazaoSocial = jTextFieldEntradaRS.getText();
            fornecedores_NumeroResidencia = Integer.parseInt(jFormattedTextFieldEntradaNumero.getText());
            str_cep = jFormattedTextFieldEntradaCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            Endereco end = fachada.consultarEndCep(str_cep);
            enderecos_Codigo = end.getEnderecos_Codigo();
            enderecos_CEP = end.getEnderecos_CEP();
            enderecos_Logradouro = end.getEnderecos_Logradouro();
            cidades_Codigo = end.getCidades_Codigo();
            cidades_Nome = end.getCidades_Nome();
            Fornecedor f = new Fornecedor(fornecedores_Codigo,fornecedores_CNPJ,fornecedores_RazaoSocial,fornecedores_NumeroResidencia,enderecos_Codigo,enderecos_CEP,enderecos_Logradouro, cidades_Codigo, cidades_Nome);
            fachada.salvarFornecedor(f);
            resposta = JOptionPane.showConfirmDialog(null, "Registro salvo com sucesso!\nDeseja continuar?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                dispose();
            } else {
                limparCampos();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void pesquisarCEP() {
        String str_cep;
        try {
            str_cep = jFormattedTextFieldEntradaCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            if ((str_cep == null) || (str_cep.equals(""))) {
                JOptionPane.showMessageDialog(null, "Digite o CEP!");
                jFormattedTextFieldEntradaCEP.requestFocus();
            } else {
                Endereco end = fachada.consultarEndCep(str_cep);
                if (end != null) {
                    jFormattedTextFieldEntradaCEP.setText(end.getEnderecos_CEP());
                    jTextFieldEntradaLog.setText(end.getEnderecos_Logradouro());
                } else {
                    jTextFieldEntradaLog.setEditable(true);
                    jTextFieldEntradaLog.requestFocus();
                }
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }
    
    private void pesquisarCNPJ() {
        String str_cnpj;
        String fornecedores_CNPJ;
        int resComCadastro;
        int resSemCadastro;
        try {
            str_cnpj = jFormattedTextFieldEntradaCNPJ.getText();
            str_cnpj = str_cnpj.replace('.', ' ');
            str_cnpj = str_cnpj.replace('/', ' ');
            str_cnpj = str_cnpj.replace('-', ' ');
            str_cnpj = str_cnpj.replaceAll(" ", "");
            fornecedores_CNPJ = str_cnpj;
            if ((fornecedores_CNPJ == null) || (fornecedores_CNPJ.equals(""))) {
                JOptionPane.showMessageDialog(null, "Digite o CNPJ!");
                jFormattedTextFieldEntradaCNPJ.requestFocus();
            } else {
                Fornecedor f = fachada.consultarForCNPJ(fornecedores_CNPJ);
                if (f != null) {
                    resComCadastro = JOptionPane.showConfirmDialog(null, "CNPJ já está cadastrado!\nDeseja cadastrar outro?", "", JOptionPane.YES_NO_OPTION);
                    if (resComCadastro == JOptionPane.YES_OPTION) {
                        jFormattedTextFieldEntradaCNPJ.setValue(null);
                        jFormattedTextFieldEntradaCNPJ.requestFocus();
                    } else {
                        dispose();
                    }
                } else {
                    resSemCadastro = JOptionPane.showConfirmDialog(null, "CNPJ não está cadastrado!\nDeseja continuar?", "", JOptionPane.YES_NO_OPTION);
                    if (resSemCadastro == JOptionPane.YES_OPTION) {
                        jTextFieldEntradaRS.setEditable(true);
                        jTextFieldEntradaRS.requestFocus();
                    } else {
                        dispose();
                    }
                }
            }
        } catch (GeralException ex) {
            
        }
    }
    
    private void limparCampos() {
        //limpar os edits
        jFormattedTextFieldEntradaCNPJ.setText("");
        jTextFieldEntradaRS.setText("");
        jFormattedTextFieldEntradaNumero.setText("");
        jFormattedTextFieldEntradaCEP.setText("");
        jTextFieldEntradaLog.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerenciarCidade;
    private javax.swing.JButton jButtonPesquisaCEP;
    private javax.swing.JButton jButtonPesquisaCNPJ;
    private javax.swing.JButton jButtonSalvarFornecedor;
    private javax.swing.JComboBox jComboBoxCidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldEntradaCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldEntradaCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldEntradaNumero;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JTextField jTextFieldEntradaLog;
    private javax.swing.JTextField jTextFieldEntradaRS;
    // End of variables declaration//GEN-END:variables
}