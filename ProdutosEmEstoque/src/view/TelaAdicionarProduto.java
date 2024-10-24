/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TelaAdicionarProdutoController;
import controller.TelaPrincipalController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class TelaAdicionarProduto extends javax.swing.JDialog {

    private TelaAdicionarProdutoController controller;
    private TelaPrincipalController telaPrincipalController;

    /**
     * Creates new form TelaAdicionarProduto
     */
    public TelaAdicionarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.controller = new TelaAdicionarProdutoController(this);
    }
    
    public TelaAdicionarProduto(java.awt.Frame parent, boolean modal, TelaPrincipalController telaPrincipalController) {
        this(parent, modal);
        this.telaPrincipalController = telaPrincipalController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImagemDivisoriaHorizontal = new javax.swing.JLabel();
        labelAdicionarProduto = new javax.swing.JLabel();
        labelDescricaoProduto = new javax.swing.JLabel();
        textFieldDescricaoProduto = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        labelImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar produto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImagemDivisoriaHorizontal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/divisoria-horizontal-tela-opcoes.png"))); // NOI18N
        getContentPane().add(labelImagemDivisoriaHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 1));

        labelAdicionarProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelAdicionarProduto.setText("<html><center>Adicionar um produto na <strong>LISTA DE<br/>PRODUTOS EM ESTOQUE</strong></center></html>");
        getContentPane().add(labelAdicionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 11, -1, -1));

        labelDescricaoProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelDescricaoProduto.setText("Descrição do produto");
        getContentPane().add(labelDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, -1, -1));

        textFieldDescricaoProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(textFieldDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 380, -1));

        buttonCancelar.setBackground(new java.awt.Color(204, 0, 0));
        buttonCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 168, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 168, -1, -1));

        labelImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/fundo-tela-opcoes.png"))); // NOI18N
        getContentPane().add(labelImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.controller.cancelar();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.controller.adicionar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdicionarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAdicionarProduto dialog = new TelaAdicionarProduto(new javax.swing.JFrame(), true);
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

    public JTextField getTextFieldDescricaoProduto() {
        return textFieldDescricaoProduto;
    }

    public void setTextFieldDescricaoProduto(JTextField textFieldDescricaoProduto) {
        this.textFieldDescricaoProduto = textFieldDescricaoProduto;
    }

    public TelaAdicionarProdutoController getController() {
        return controller;
    }

    public void setController(TelaAdicionarProdutoController controller) {
        this.controller = controller;
    }

    public TelaPrincipalController getTelaPrincipalController() {
        return telaPrincipalController;
    }

    public void setTelaPrincipalController(TelaPrincipalController telaPrincipalController) {
        this.telaPrincipalController = telaPrincipalController;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelAdicionarProduto;
    private javax.swing.JLabel labelDescricaoProduto;
    private javax.swing.JLabel labelImagemDivisoriaHorizontal;
    private javax.swing.JLabel labelImagemFundo;
    private javax.swing.JTextField textFieldDescricaoProduto;
    // End of variables declaration//GEN-END:variables
}