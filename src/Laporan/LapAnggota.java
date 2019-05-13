package Laporan;


import Database.Koneksi;
import Database.Koneksi2;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRDesignViewer;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;


public class LapAnggota extends javax.swing.JDialog {
//private com.toedter.calendar.JDateChooser DtAwal;
//private com.toedter.calendar.JDateChooser DtAkhir;

private SimpleDateFormat frmtgl = new SimpleDateFormat("yyyy-MM-dd");
    
    public String No_anggota, Nama;
    
    //Deklarasi Get
    public String getNo_anggota() {
        return No_anggota;
    }

    public String getNama() {
        return Nama;
    }
    
    public LapAnggota(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
//        aturRd(false, true);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdTampil = new javax.swing.JRadioButton();
        rdRentang = new javax.swing.JRadioButton();
        DtAwal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        DtAkhir = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CETAK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pilih Kriteria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rdTampil);
        rdTampil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdTampil.setText("Tampil Semua Data");
        rdTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdTampilActionPerformed(evt);
            }
        });
        jPanel1.add(rdTampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        buttonGroup1.add(rdRentang);
        rdRentang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdRentang.setText("Periode");
        rdRentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdRentangActionPerformed(evt);
            }
        });
        jPanel1.add(rdRentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel1.add(DtAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("s/d");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));
        jPanel1.add(DtAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("KELUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(405, 240));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (rdTampil.isSelected()){
            try {
                   String path = System.getProperty ("user.dir") +"/src/Report/LAnggotaAll.jasper";
                  //  File file=new File("src/nyobarepotlagi/report1.jrxml");
                  //  JasperDesign jasperdesign=JRXmlLoader.load(file);
                    HashMap parameter = new HashMap();
                   // JasperReport jasperreport=JasperCompileManager.compileReport(jasperdesign);
                    JasperPrint print = JasperFillManager.fillReport(path, parameter, Koneksi2.getkoneksi());
                    JasperViewer.viewReport(print, false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Dokumen Tidak Ada" + ex);
            }
        }
        /*if (rdPilihan.isSelected()){
            if(rdID.isSelected()){
                try {
                   String path = "src/Report/LapAnggotaID.jasper";
                  //  File file=new File("src/nyobarepotlagi/report1.jrxml");
                  //  JasperDesign jasperdesign=JRXmlLoader.load(file);
                    HashMap parameter = new HashMap();
                    parameter.put("No_Anggota", txCari.getText());
                   // JasperReport jasperreport=JasperCompileManager.compileReport(jasperdesign);
                    JasperPrint print = JasperFillManager.fillReport(path, parameter, Koneksi2.getkoneksi());
                    JasperViewer.viewReport(print, false);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Dokumen Tidak Ada");
                }
            }
            if(rdNama.isSelected()){
                try {
                   String path = System.getProperty ("user.dir") +"/src/Report/LapAnggotaNama.jasper";
                  //  File file=new File("src/nyobarepotlagi/report1.jrxml");
                  //  JasperDesign jasperdesign=JRXmlLoader.load(file);
                    HashMap parameter = new HashMap();
                    parameter.put("Nama", txCari.getText());
                   // JasperReport jasperreport=JasperCompileManager.compileReport(jasperdesign);
                    JasperPrint print = JasperFillManager.fillReport(path, parameter, Koneksi2.getkoneksi());
                    JasperViewer.viewReport(print, false);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Dokumen Tidak Ada");
                }
            }
        }*/
        if (rdRentang.isSelected()){
            try {
                   String path = System.getProperty ("user.dir") +"/src/Report/LapAnggotaP.jasper";
                  //  File file=new File("src/nyobarepotlagi/report1.jrxml");
                  //  JasperDesign jasperdesign=JRXmlLoader.load(file);
                    HashMap parameter = new HashMap();
                    parameter.put("Tgl1",frmtgl.format(DtAwal.getDate()));
                    parameter.put("Tgl2",frmtgl.format(DtAkhir.getDate()));
                   // JasperReport jasperreport=JasperCompileManager.compileReport(jasperdesign);
                    JasperPrint print = JasperFillManager.fillReport(path, parameter, Koneksi2.getkoneksi());
                    JasperViewer.viewReport(print, false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Dokumen Tidak Ada" + ex);
            }
        }
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LapAnggota.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rdTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdTampilActionPerformed
//        aturRd(false, true);
    }//GEN-LAST:event_rdTampilActionPerformed

    private void rdRentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdRentangActionPerformed
//        aturRd(false, true);
    }//GEN-LAST:event_rdRentangActionPerformed

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
            java.util.logging.Logger.getLogger(LapAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LapAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LapAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LapAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LapAnggota dialog = new LapAnggota(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser DtAkhir;
    private com.toedter.calendar.JDateChooser DtAwal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdRentang;
    private javax.swing.JRadioButton rdTampil;
    // End of variables declaration//GEN-END:variables

    /*void aturRd(boolean a, boolean b){
        rdID.setEnabled(a);
        rdNama.setEnabled(a);
    }*/
    
    public void itemTerpilihID(){
        view_LapAnggotaID LA = new view_LapAnggotaID(null, rootPaneCheckingEnabled);
        LA.LAP=this;
//        txCari.setText(No_anggota);
    }
    
    public void itemTerpilihNama(){
        view_LapAnggotaNama LP = new view_LapAnggotaNama(null, rootPaneCheckingEnabled);
        LP.LAN=this;
//        txCari.setText(Nama);
    }
}
