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
import projeto.modelo.to.PessoaFisica;

/**
 *
 * @author Sandro
 */
public class GuiPessoaFisicaNovoM extends javax.swing.JDialog {
    
    public static Fachada fachada = new Fachada();


    /**
     * Creates new form GuiPessoaFisicaNovoM
     */
    public GuiPessoaFisicaNovoM(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    GuiPessoaFisicaNovoM() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jbSalvarPF = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextLogradouro = new javax.swing.JTextField();
        jTextNumeroRes = new javax.swing.JTextField();
        jComboBoxCidade = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jFormatTextCEP = new javax.swing.JFormattedTextField();
        jbGerenciarCidade = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jFormatTextCPF = new javax.swing.JFormattedTextField();
        jRadioBMasculino = new javax.swing.JRadioButton();
        jRadioBFemnino = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jbSalvarPF.setText("Salvar");
        jbSalvarPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarPFActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel5.setText("Logradouro :");

        jLabel6.setText("Número :");

        jLabel7.setText("Cidade :");

        jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadeActionPerformed(evt);
            }
        });

        jLabel4.setText("CEP.:");

        try {
            jFormatTextCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatTextCEP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormatTextCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormatTextCEPActionPerformed(evt);
            }
        });

        jbGerenciarCidade.setText("Incluir Cidade");
        jbGerenciarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerenciarCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jFormatTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxCidade, 0, 159, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGerenciarCidade))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextLogradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNumeroRes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumeroRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormatTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGerenciarCidade)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel1.setText("NOME");

        jLabel2.setText("CPF");

        jLabel3.setText("SEXO.:");

        jButton1.setText("Pesquisar");

        try {
            jFormatTextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA.AAA.AAA-AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatTextCPF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(jRadioBMasculino);
        jRadioBMasculino.setText("Masculino");

        buttonGroup1.add(jRadioBFemnino);
        jRadioBFemnino.setText("Feminino");

        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFormatTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioBMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioBFemnino)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jRadioBMasculino)
                        .addComponent(jRadioBFemnino))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jFormatTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jbSalvarPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvarPF))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCidadeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jFormatTextCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormatTextCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormatTextCEPActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        atualizarComboCidade();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jbGerenciarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerenciarCidadeActionPerformed
        // TODO add your handling code here:
        GuiCidade novaCidade = new GuiCidade();
        novaCidade.setVisible(true);
    }//GEN-LAST:event_jbGerenciarCidadeActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarPFActionPerformed
        // TODO add your handling code here:
        salvarPF();
    }//GEN-LAST:event_jbSalvarPFActionPerformed

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
            java.util.logging.Logger.getLogger(GuiPessoaFisicaNovoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPessoaFisicaNovoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPessoaFisicaNovoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPessoaFisicaNovoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                GuiPessoaFisicaNovoM dialog = new GuiPessoaFisicaNovoM(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
        private void salvarPF() {
        int resposta;
        int enderecos_Codigo = 0;
        int cidades_Codigo;
        String sexo;
        String enderecos_CEP, pf_CPF;
        String enderecos_Logradouro;
        String cidades_Nome;
        String str_cep, str_cpf;
        Endereco end;
        PessoaFisica pf;
        try {
            str_cpf = jFormatTextCPF.getText();
            str_cpf = str_cpf.replace('.', ' ');
            str_cpf = str_cpf.replace('-', ' ');
            str_cpf = str_cpf.replaceAll(" ", "");
            pf_CPF = str_cpf;

            str_cep = jFormatTextCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            enderecos_CEP = str_cep;
            enderecos_Codigo = consultarCep(str_cep);
            cidades_Nome = jComboBoxCidade.getSelectedItem().toString();
            Cidade cd = fachada.consultarCidade(cidades_Nome);
            cidades_Codigo = cd.getCidades_Codigo();
            enderecos_Logradouro = jTextLogradouro.getText();
            JOptionPane.showMessageDialog(null,enderecos_Codigo );
            if (enderecos_Codigo==0){
                end= new Endereco();
                end.setCidades_Codigo(cidades_Codigo);
                end.setEnderecos_CEP(enderecos_CEP);
                end.setEnderecos_Logradouro(enderecos_Logradouro);
                fachada.salvarEndereco(end);
                enderecos_Codigo = consultarCep(str_cep);
            }
            pf = new PessoaFisica();
            pf.setClientes_NumeroResidencia(jTextNumeroRes.getText());
            pf.setClientes_Tipo("F");
            pf.setEnderecos_Codigo(enderecos_Codigo);
            pf.setPessoasFisica_CPF(pf_CPF);
            pf.setPessoasFisica_Nome(jTextPF.getText());
            if (jRadioBMasculino.isSelected()==true){
                sexo = "M";
            }else{
                sexo = "F";
            }
            pf.setPessoasFisica_Sexo(sexo);
            fachada.salvarCliente(pf);
            
            resposta = JOptionPane.showConfirmDialog(null, "Registro salvo com sucesso!\nDeseja cadastrar outro Cliente?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                dispose();                
            } else {
                //limparCampos();
                //bloquearTela();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    
        private void atualizarComboCidade() {
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
    }

    private int consultarCep(String cep) {
        //int resComCadastro;
        //int resSemCadastro;
        //String str_cep;
        //String enderecos_CEP;
        Endereco end;
        int endereco_codigo=0;
        try {
            //str_cep = jFormatTextCEP.getText();
            //str_cep = str_cep.replace('-', ' ');
            //str_cep = str_cep.replaceAll(" ", "");
            //enderecos_CEP = str_cep;
            if((cep == null) || (cep.equals(""))){
                JOptionPane.showMessageDialog(null, "Digite um CEP!");
                //bloquearTela();
            } else {
                end = fachada.consultarEndCep(cep);
                if (end != null) {
                    endereco_codigo = end.getEnderecos_Codigo();
                    //resComCadastro = JOptionPane.showConfirmDialog(null, "CEP já está cadastrado!\nDeseja cadastrar outro?", "", JOptionPane.YES_NO_OPTION);
                    /*if (resComCadastro == JOptionPane.YES_OPTION) {
                        limparCampos();
                        bloquearTela();
                    } else {
                        dispose();
                    }*/
                }
                    /*resSemCadastro = JOptionPane.showConfirmDialog(null, "CEP não está cadastrado!\nDeseja continuar?", "", JOptionPane.YES_NO_OPTION);
                    if (resSemCadastro == JOptionPane.YES_OPTION) {
                        liberarTela();
                    } else {
                        dispose();
                    }*/
                
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return endereco_codigo;
    }


    

    private void limparCampos() {
        //jFormattedTextFieldCEP.setText("");
        //jTextFieldEntradaLog.setText("");
        //jFormattedTextFieldCEP.requestFocus();
    }

        private void gerenciarCidadeEnd(){
        String cep = jFormatTextCEP.getText();
        String log = jTextLogradouro.getText();
        dispose();
        GuiCidade cidade = new GuiCidade();
        cidade.setVisible(true);
        GuiEnderecoNovo guiEnderecoNovo = new GuiEnderecoNovo();
        GuiEnderecoNovo.jFormattedTextFieldCEP.setText(cep);
        GuiEnderecoNovo.jTextFieldEntradaLog.setText(log);
        //liberarTela();
        jComboBoxCidade.requestFocus();
        guiEnderecoNovo.setVisible(true);
    }

    /**
     * Define o padrão da tabela e insere os dados da tabela Endereco em um
     * ArrayList;
     *
     * @param listaEndereco
     * @return
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBoxCidade;
    private javax.swing.JFormattedTextField jFormatTextCEP;
    private javax.swing.JFormattedTextField jFormatTextCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioBFemnino;
    private javax.swing.JRadioButton jRadioBMasculino;
    private javax.swing.JTextField jTextLogradouro;
    private javax.swing.JTextField jTextNumeroRes;
    private javax.swing.JTextField jTextPF;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGerenciarCidade;
    private javax.swing.JButton jbSalvarPF;
    // End of variables declaration//GEN-END:variables
}
