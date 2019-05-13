/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;

import Form.F_User;

/**
 *
 * @author KEEN-JAVA
 */
public class F_Utility extends javax.swing.JFrame {

    /**
     * Creates new form F_Utility
     */
    public F_Utility() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        buttonUtama1 = new koperasi.ButtonUtama();
        buttonUtama9 = new koperasi.ButtonUtama();
        jLabel1 = new javax.swing.JLabel();
        buttonUtama6 = new koperasi.ButtonUtama();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonUtama1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/home3.png"))); // NOI18N
        buttonUtama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 20, 87, -1));

        buttonUtama9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Tambah User.png"))); // NOI18N
        buttonUtama9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama9ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 160, 156));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Management User");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        buttonUtama6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/export.png"))); // NOI18N
        buttonUtama6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama6ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, 156));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("About Program");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUtama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama1ActionPerformed
        new F_Utama().show();
        F_Utility.this.dispose();
    }//GEN-LAST:event_buttonUtama1ActionPerformed

    private void buttonUtama6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama6ActionPerformed
        new F_About(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_buttonUtama6ActionPerformed

    private void buttonUtama9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama9ActionPerformed
        new F_User(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_buttonUtama9ActionPerformed

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
            java.util.logging.Logger.getLogger(F_Utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Utility().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private koperasi.ButtonUtama buttonUtama1;
    private koperasi.ButtonUtama buttonUtama6;
    private koperasi.ButtonUtama buttonUtama9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
