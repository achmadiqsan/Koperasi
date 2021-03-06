/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;

import Database.Koneksi2;
import Laporan.LapAnggota;
import Laporan.LapAngsur;
import Laporan.LapNeraca;
import Laporan.LapPinjaman;
import Laporan.LapSaham;
import Laporan.LapSimpanan;
import Laporan.lapSHU;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author KEEN-JAVA
 */
public class F_Laporan extends javax.swing.JFrame {

    /**
     * Creates new form F_Laporan
     */
    public F_Laporan() {
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
        buttonUtama11 = new koperasi.ButtonUtama();
        buttonUtama6 = new koperasi.ButtonUtama();
        buttonUtama12 = new koperasi.ButtonUtama();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonUtama1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/home3.png"))); // NOI18N
        buttonUtama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 87, -1));

        buttonUtama9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Lap Anggota.png"))); // NOI18N
        buttonUtama9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama9ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 160, 156));

        buttonUtama10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Lap Karyawan.png"))); // NOI18N
        buttonUtama10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama10ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 161, 156));

        buttonUtama11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/lap Simpanan.png"))); // NOI18N
        buttonUtama11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama11ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, 156));

        buttonUtama6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/Lap Angsuran.png"))); // NOI18N
        buttonUtama6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama6ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, 156));

        buttonUtama12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/128/lap Pinjaman.png"))); // NOI18N
        buttonUtama12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUtama12ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonUtama12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 161, 156));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("Lap. Pinjaman");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Lap. Simpanan");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Lap. Saham");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("Lap. Angsuran");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Lap. Anggota");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUtama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama1ActionPerformed
        new F_Utama().show();
        F_Laporan.this.dispose();
    }//GEN-LAST:event_buttonUtama1ActionPerformed

    private void buttonUtama9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama9ActionPerformed
        new LapAnggota(this, false).show();
    }//GEN-LAST:event_buttonUtama9ActionPerformed

    private void buttonUtama10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama10ActionPerformed
        new LapSaham(this, false).show();
        /*try {
                   String path = System.getProperty ("user.dir") +"/src/Report/LapSaham.jasper";
                  //  File file=new File("src/nyobarepotlagi/report1.jrxml");
                  //  JasperDesign jasperdesign=JRXmlLoader.load(file);
                    HashMap parameter = new HashMap();
                   // JasperReport jasperreport=JasperCompileManager.compileReport(jasperdesign);
                    JasperPrint print = JasperFillManager.fillReport(path, parameter, Koneksi2.getkoneksi());
                    JasperViewer.viewReport(print, false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Dokumen Tidak Ada" + ex);
            }*/
    }//GEN-LAST:event_buttonUtama10ActionPerformed

    private void buttonUtama11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama11ActionPerformed
        new LapSimpanan(this, false).show();
    }//GEN-LAST:event_buttonUtama11ActionPerformed

    private void buttonUtama6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama6ActionPerformed
        new LapAngsur(this, false).show();
    }//GEN-LAST:event_buttonUtama6ActionPerformed

    private void buttonUtama12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUtama12ActionPerformed
        new LapPinjaman(this, false).show();
    }//GEN-LAST:event_buttonUtama12ActionPerformed

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
            java.util.logging.Logger.getLogger(F_Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private koperasi.ButtonUtama buttonUtama1;
    private koperasi.ButtonUtama buttonUtama10;
    private koperasi.ButtonUtama buttonUtama11;
    private koperasi.ButtonUtama buttonUtama12;
    private koperasi.ButtonUtama buttonUtama6;
    private koperasi.ButtonUtama buttonUtama9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
