/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import javax.swing.JOptionPane;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Cidade;

/**
 *
 * @author Daniel
 */
public class GuiCidadeAlterarJD extends javax.swing.JDialog {

    Fachada fachada = new Fachada();
    
    /**
     * Creates new form GuiCidadeAlterarJD
     */
    public GuiCidadeAlterarJD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public GuiCidadeAlterarJD() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFieldCidadeNova.requestFocus();
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
            java.util.logging.Logger.getLogger(GuiCidadeAlterarJD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCidadeAlterarJD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCidadeAlterarJD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCidadeAlterarJD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GuiCidadeAlterarJD dialog = new GuiCidadeAlterarJD(new javax.swing.JFrame(), true);
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidadeOld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCidadeNova = new javax.swing.JTextField();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelCidade.setText("Cidade.:");

        jTextFieldCidadeOld.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCidadeOld.setEditable(false);

        jLabel1.setText("Nova Cidade.:");

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setMaximumSize(new java.awt.Dimension(75, 23));
        jButtonAlterar.setMinimumSize(new java.awt.Dimension(75, 23));
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(75, 23));
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCidadeOld)
                    .addComponent(jTextFieldCidadeNova, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCidadeOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCidadeNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterarCidade();
    }//GEN-LAST:event_jButtonAlterarActionPerformed
    
    /**
     * Método que altera um registro selecionado;
     */
    private void alterarCidade() {
        String cdOld;
        int validoString;
        int cidades_Codigo;
        try {
            cdOld = jTextFieldCidadeOld.getText();
            Cidade cd;
            cd = fachada.consultarCidade(cdOld);
            try {
                validoString = Integer.parseInt(jTextFieldCidadeNova.getText());
                JOptionPane.showMessageDialog(null, "Digita apenas o nome da cidade!");
                jTextFieldCidadeNova.requestFocus();
                jTextFieldCidadeNova.setText("");
            } catch (NumberFormatException e) {
                Cidade cdAlterar = new Cidade();
                cidades_Codigo = cd.getCidades_Codigo();
                cdAlterar.setCidades_Codigo(cidades_Codigo);
                cdAlterar.setCidades_Nome(jTextFieldCidadeNova.getText());
                fachada.alterarCidade(cdAlterar);
                JOptionPane.showMessageDialog(null, "Cidade Alterada!");
                dispose();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCidadeNova;
    public javax.swing.JTextField jTextFieldCidadeOld;
    // End of variables declaration//GEN-END:variables
}
