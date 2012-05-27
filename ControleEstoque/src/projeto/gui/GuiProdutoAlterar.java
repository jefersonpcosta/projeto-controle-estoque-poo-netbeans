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
import projeto.modelo.to.Marca;
import projeto.modelo.to.Produto;
import projeto.modelo.to.Segmento;
import projeto.modelo.to.Tipo;

/**
 *
 * @author diego
 */
public class GuiProdutoAlterar extends javax.swing.JFrame {

    Fachada fachada = new Fachada();
    private GuiProduto guiPro;
    /**
     * Creates new form GuiProdutoAlterar
     */
    public GuiProdutoAlterar() {
        initComponents();
        guiPro = new GuiProduto();
        setLocationRelativeTo(null);//mostra no centro da tela 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDescricaoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jValorUnitarioField = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jQtdeField = new javax.swing.JTextField();
        jSegmentoBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTipoBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jMarcaBox = new javax.swing.JComboBox();
        jbAlterar = new javax.swing.JButton();
        jSegmentoField = new javax.swing.JTextField();
        jTipoField = new javax.swing.JTextField();
        jMarcaField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setText("Descrição.:");

        jValorUnitarioField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));

        jLabel3.setText("Valor Unitário R$.:");

        jLabel4.setText("Quantidade.:");

        jLabel1.setText("Segmento.:");

        jLabel5.setText("Tipo.:");

        jLabel6.setText("Marca.:");

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jSegmentoField.setBackground(new java.awt.Color(204, 204, 204));
        jSegmentoField.setEditable(false);
        jSegmentoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSegmentoFieldActionPerformed(evt);
            }
        });

        jTipoField.setBackground(new java.awt.Color(204, 204, 204));
        jTipoField.setEditable(false);

        jMarcaField.setBackground(new java.awt.Color(204, 204, 204));
        jMarcaField.setEditable(false);

        jLabel7.setText("Alterar para.:");

        jLabel8.setText("Alterar para.:");

        jLabel9.setText("Alterar para.:");

        jButton1.setText("Teste");
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDescricaoField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jValorUnitarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jQtdeField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 183, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTipoField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jSegmentoField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMarcaField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTipoBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSegmentoBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jMarcaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jDescricaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jQtdeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jValorUnitarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSegmentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSegmentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jMarcaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar)
                    .addComponent(jMarcaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jSegmentoField.getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:    

        try {
            //preparando o novo produto para ser salvo no DAO
            Produto pAlterar = new Produto();
            
            //pegando o codigo do segmento selecionado
            Segmento sgsalvar = fachada.consultarSegmentos((String) jSegmentoBox.getSelectedItem());
            pAlterar.setSegmentos_Codigo(sgsalvar.getSegmentos_Codigo());

            //pegando o codigo do tipo selecionado
            Tipo tpsalvar = fachada.consultarTipos((String) jTipoBox.getSelectedItem());
            pAlterar.setTipos_Codigo(tpsalvar.getTipos_Codigo());

            //pegando o codigo da marca selecionada
            Marca masalvar = fachada.consultarMarcas((String) jMarcaBox.getSelectedItem());
            pAlterar.setMarcas_Codigo(masalvar.getMarcas_Codigo());

            pAlterar.setProdutos_Descricao(jDescricaoField.getText());

            //CONVERTE O VALOR INFORMADO
            String converterValor = converterValorReal(jValorUnitarioField.getText());
            pAlterar.setProdutos_ValorVenda(Double.parseDouble(converterValor));

            pAlterar.setProdutos_Quantidade(Integer.parseInt(jQtdeField.getText()));

            //CHAMAR O DAO ALTERAR
            fachada.alterarProduto(pAlterar);

            JOptionPane.showMessageDialog(null, "Produto Alterado!");
            dispose();

        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

       //LISTA DO SEGMENTO
       Segmento sg;
       ArrayList<Segmento> listasg;
	try{
		//Lista dos os segmentos
		listasg = (ArrayList<Segmento>)fachada.listarSegmentos("");
		for(Iterator<Segmento> it = listasg.iterator(); it.hasNext();){
                    sg = it.next();
                    jSegmentoBox.addItem(sg.getSegmentos_Descricao());	
		}
	}catch (GeralException ex){
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
        //LISTAR OS TIPOS
        Tipo tp;
        ArrayList<Tipo> listatp;
        try{
                listatp = (ArrayList<Tipo>) fachada.listarTipo("");
                for(Iterator<Tipo> it = listatp.iterator(); it.hasNext();){
                    tp = it.next();
                    jTipoBox.addItem(tp.getTipos_Descricao());
                }
        }catch (GeralException ex){
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
        //LISTAR MARCA
        Marca ma;
        ArrayList<Marca> listama;
        try{
                listama = (ArrayList<Marca>) fachada.listarMarca("");
                for(Iterator<Marca> it = listama.iterator(); it.hasNext();){
                    ma = it.next();
                    jMarcaBox.addItem(ma.getMarcas_Descricao());
                }
        }catch (GeralException ex){
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
        
    }//GEN-LAST:event_formComponentShown

    private void jSegmentoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSegmentoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSegmentoFieldActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
       guiPro.atualizarTabela(); 
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiProdutoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiProdutoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiProdutoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiProdutoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GuiProdutoAlterar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JTextField jDescricaoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox jMarcaBox;
    public javax.swing.JTextField jMarcaField;
    public javax.swing.JTextField jQtdeField;
    private javax.swing.JComboBox jSegmentoBox;
    public javax.swing.JTextField jSegmentoField;
    private javax.swing.JComboBox jTipoBox;
    public javax.swing.JTextField jTipoField;
    public javax.swing.JFormattedTextField jValorUnitarioField;
    private javax.swing.JButton jbAlterar;
    // End of variables declaration//GEN-END:variables
 
  //CONVERTE O VALOR DOUBLE PARA SALVAR DO BD
    private String converterValorReal(String valorx){
        String valorConvertido = "";
        
        for(int i =0,x =1; i< valorx.length(); i++,x++){
            
            if(valorx.substring(i,x).equals(",")){
                
                valorConvertido = valorConvertido + ".";
                
            }else if(!valorx.substring(i,x).equals(".")){
                 valorConvertido = valorConvertido + valorx.substring(i,x);       
            }
        } 
        return valorConvertido;
    }   
  
 //CONVERTE O DOUBLE EM MOEDA 
    private String formataMoeda(double valormodeda){
        java.text.DecimalFormat df = new java.text.DecimalFormat("###,###,##0.00");
    return df.format(valormodeda);
    }
    
}
