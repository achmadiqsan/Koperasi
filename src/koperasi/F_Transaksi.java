/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;

import Form.F_Angsuran;
import Form.F_Pinjaman;
import Form.F_PinjamanBaru;
import Form.F_SHU;
import Form.F_Simpanan;

/**
 *
 * @author KEEN-JAVA
 */
public class F_Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form F_Transaksi
     */
    public F_Transaksi() {
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
        buttonUtama10 = new koperasi.ButtonUtama();
        buttonUtama13 = new koperasi.ButtonUtama();
        buttonUtama12 = new koperasi.ButtonUtama();
        buttonUtama11 = new koperasi.ButtonUtama();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        buttonUtama9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Pekerjaan.png"))); // NOI18N
        buttonUtama9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama9ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 160, 156));

        buttonUtama10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Jabatan.png"))); // NOI18N
        buttonUtama10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama10ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 161, 156));

        buttonUtama13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Jabatan.png"))); // NOI18N
        buttonUtama13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama13ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 170, 156));

        buttonUtama12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Bunga.png"))); // NOI18N
        buttonUtama12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama12ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, 156));

        buttonUtama11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Agama.png"))); // NOI18N
        buttonUtama11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama11ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, 156));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("TRANSAKSI PINJAMAN");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("PEMBAGIAN SHU");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("SIMPANAN");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("PINJAMAN");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("PERPANJANG PINJAMAN");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUtama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama1ActionPerformed
        new F_Utama().show();
        F_Transaksi.this.dispose();
    }//GEN-LAST:event_buttonUtama1ActionPerformed

    private void buttonUtama9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama9ActionPerformed
        new F_Simpanan(this, rootPaneCheckingEnabled).show();

    }//GEN-LAST:event_buttonUtama9ActionPerformed

    private void buttonUtama10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama10ActionPerformed
        new F_Pinjaman(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_buttonUtama10ActionPerformed

    private void buttonUtama13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama13ActionPerformed
        new F_PinjamanBaru(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_buttonUtama13ActionPerformed

    private void buttonUtama12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama12ActionPerformed
        new F_SHU(this, false).show();
    }//GEN-LAST:event_buttonUtama12ActionPerformed

    private void buttonUtama11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama11ActionPerformed
        new F_Angsuran(this, false).show();
    }//GEN-LAST:event_buttonUtama11ActionPerformed

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
            java.util.logging.Logger.getLogger(F_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private koperasi.ButtonUtama buttonUtama1;
    private koperasi.ButtonUtama buttonUtama10;
    private koperasi.ButtonUtama buttonUtama11;
    private koperasi.ButtonUtama buttonUtama12;
    private koperasi.ButtonUtama buttonUtama13;
    private koperasi.ButtonUtama buttonUtama9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
