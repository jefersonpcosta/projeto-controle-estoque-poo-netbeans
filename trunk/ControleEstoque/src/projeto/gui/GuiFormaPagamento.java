/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.FormaPagamento;

/**
 *
 * @author Bruno Pinheiro
 */
public class GuiFormaPagamento extends javax.swing.JDialog {

    ArrayList<FormaPagamento> listaFormaPagamento = null;
    public static Fachada fachada = new Fachada();

    /**
     * Creates new form GuiFormaPagamento
     */
    public GuiFormaPagamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public GuiFormaPagamento() {
        initComponents();
        listaTabelaFormaPagamento();
        // JtListarFormaPagamentos.isCellEditable(0, 0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTPesq = new javax.swing.JTextField();
        JlFuncionario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtListarFormaPagamentos = new javax.swing.JTable();
        btnAlterarM = new javax.swing.JButton();
        btnSalvarM = new javax.swing.JButton();
        btnExcluirM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FormaPagamentos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 82));

        jTPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPesqKeyReleased(evt);
            }
        });

        JlFuncionario.setText("Descrição");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPesq, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtListarFormaPagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtListarFormaPagamentos.setShowHorizontalLines(false);
        JtListarFormaPagamentos.setShowVerticalLines(false);
        JtListarFormaPagamentos.getTableHeader().setReorderingAllowed(false);
        JtListarFormaPagamentos.setUpdateSelectionOnSort(false);
        JtListarFormaPagamentos.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(JtListarFormaPagamentos);
        JtListarFormaPagamentos.getColumnModel().getColumn(0).setResizable(false);
        JtListarFormaPagamentos.getColumnModel().getColumn(1).setResizable(false);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 376, 180));

        btnAlterarM.setText("Alterar");
        btnAlterarM.setMaximumSize(new java.awt.Dimension(63, 23));
        btnAlterarM.setMinimumSize(new java.awt.Dimension(63, 23));
        btnAlterarM.setPreferredSize(new java.awt.Dimension(63, 23));
        btnAlterarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarMActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 56, 70, 30));

        btnSalvarM.setText("Novo");
        btnSalvarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 20, 70, 30));

        btnExcluirM.setText("Excluir");
        btnExcluirM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluirM, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 92, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, 489, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPesqKeyReleased
        // TODO add your handling code here:
        pesquisarFormaPagamento();
    }//GEN-LAST:event_jTPesqKeyReleased

    private void btnAlterarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarMActionPerformed
        // TODO add your handling code here:
        alterarFormaPagamento();
    }//GEN-LAST:event_btnAlterarMActionPerformed

    private void btnSalvarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMActionPerformed
        // TODO add your handling code here:
        GuiFormaPagamentoSalvar tela = new GuiFormaPagamentoSalvar();
        tela.setVisible(true);
    }//GEN-LAST:event_btnSalvarMActionPerformed

    private void btnExcluirMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMActionPerformed
        // TODO add your handling code here:
        apagarFormaPagamento();
        listaTabelaFormaPagamento();
    }//GEN-LAST:event_btnExcluirMActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        listaTabelaFormaPagamento();
    }//GEN-LAST:event_formWindowGainedFocus

    private DefaultTableModel geramodelo(ArrayList<FormaPagamento> listaFormaPagamento) {

        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Descrição"}, 0) {

            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };
        //DefaultTableModel modelo = new DefaultTableModel();
        //modelo.addColumn("Código");
        //modelo.addColumn("Descrição");
        ArrayList<String> valores;
        int i = 0;
        for (FormaPagamento m : listaFormaPagamento) {
            valores = new ArrayList<String>();
            valores.add(String.valueOf(m.getFormaPagamento_Codigo()));
            valores.add(m.getFormaPagamento_Descricao());
            modelo.insertRow(i, valores.toArray());
            i++;
        }
        return modelo;
    }

    /**
     * Método para listar todos os registros de Tipo;
     */
    private void listaTabelaFormaPagamento() {
        //MOSTRAR TODOS OS REGISTRO DE TIPOS

        try {
            listaFormaPagamento = (ArrayList<FormaPagamento>) fachada.listarFormasPagamentos();
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaFormaPagamento);
        JtListarFormaPagamentos.setModel(modelo);
    }

    /**
     * Método para apagar um registro selecionado na tabela;
     */
    private void apagarFormaPagamento() {
        int resposta;
        try {
            FormaPagamento m = listaFormaPagamento.get(JtListarFormaPagamentos.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Apagar ?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                FormaPagamento mConsult = fachada.consultarFormaPagamento(m.getFormaPagamento_Codigo());
                if (mConsult != null) {
                    fachada.excluirFormaPagamento(m.getFormaPagamento_Codigo());
                    JOptionPane.showMessageDialog(null, "Registro excluído!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione o Tipo!");
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void pesquisarFormaPagamento() {

        try {

            if ((jTPesq.getText() == "") || (jTPesq.getText() == null)) {
                listaFormaPagamento = (ArrayList<FormaPagamento>) fachada.listarFormasPagamentos();
                DefaultTableModel modelo = geramodelo(listaFormaPagamento);
            } else {
                listaFormaPagamento = (ArrayList<FormaPagamento>) fachada.listarFormasPagamentosDescricao(jTPesq.getText());
                DefaultTableModel modelo = geramodelo(listaFormaPagamento);
                JtListarFormaPagamentos.setModel(modelo);
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    private void alterarFormaPagamento() {
        int resposta;
        try {
            FormaPagamento mOld = listaFormaPagamento.get(JtListarFormaPagamentos.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Alterar?", "Confirma", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                 GuiFormaPagamentoAlterar guiAlterarFormaPagamentosTeste= new GuiFormaPagamentoAlterar();
                 guiAlterarFormaPagamentosTeste.jTDescFormaPagamento.setText(mOld.getFormaPagamento_Descricao());
                 guiAlterarFormaPagamentosTeste.jTCodFormaPagamento.setText(String.valueOf(mOld.getFormaPagamento_Codigo()));
                 guiAlterarFormaPagamentosTeste.setVisible(true);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um endereço!");
        }
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
            java.util.logging.Logger.getLogger(GuiFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                GuiFormaPagamento dialog = new GuiFormaPagamento(new javax.swing.JFrame(), true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlFuncionario;
    private javax.swing.JTable JtListarFormaPagamentos;
    private javax.swing.JButton btnAlterarM;
    private javax.swing.JButton btnExcluirM;
    private javax.swing.JButton btnSalvarM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPesq;
    // End of variables declaration//GEN-END:variables
}
