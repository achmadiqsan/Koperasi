/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Database.Koneksi;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KEEN-JAVA
 */
public class view_pinjamBaru extends javax.swing.JDialog {

    private DefaultTableModel model;
    public F_PinjamanBaru fBU = null;
    /**
     * Creates new form view_simBaru
     */
    public view_pinjamBaru(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        tampil();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdID = new javax.swing.JRadioButton();
        rdNama = new javax.swing.JRadioButton();
        txCari = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCari = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Cari");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        buttonGroup1.add(rdID);
        rdID.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        rdID.setText("Kode");
        jPanel1.add(rdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        buttonGroup1.add(rdNama);
        rdNama.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        rdNama.setText("Nama");
        jPanel1.add(rdNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        txCari.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txCariKeyReleased(evt);
            }
        });
        jPanel1.add(txCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 38, 410, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCari.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tblCari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCariMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCari);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(549, 349));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCariMouseClicked
        int tbl = tblCari.getSelectedRow();
        fBU.kd_pinjaman = tblCari.getValueAt(tbl, 0).toString();
        fBU.No_anggota = tblCari.getValueAt(tbl, 1).toString();
        fBU.Nama = tblCari.getValueAt(tbl, 2).toString();
        fBU.Pinjam = tblCari.getValueAt(tbl, 3).toString();
        fBU.itemTerpilih();
        this.dispose();
    }//GEN-LAST:event_tblCariMouseClicked

    private void txCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txCariKeyReleased
    if(rdID.isSelected()){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode");
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        tbl.addColumn("Sisa");
        tblCari.setModel(tbl);
        try {
            Statement statement=(Statement)Koneksi.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("SELECT kd_pinjaman, No_anggota, Nama, Sisa FROM t_angsuran WHERE kd_pinjaman LIKE '"+txCari.getText()+"%'");
            while (res.next()) 
            {
                tbl.addRow(new Object[]{
                    res.getString("kd_pinjaman"),
                    res.getString("No_anggota"),
                    res.getString("Nama"),
                    res.getString("Sisa"),
                });
                tblCari.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah" +e);
        }
            tblCari.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblCari.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblCari.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCari.getColumnModel().getColumn(2).setPreferredWidth(200);
    }    
    else{
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode");
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        tbl.addColumn("Sisa");
        tblCari.setModel(tbl);
        try {
            Statement statement=(Statement)Koneksi.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("SELECT kd_pinjaman, No_anggota, Nama, Sisa FROM t_angsuran WHERE Nama LIKE '"+txCari.getText()+"%'");
            while (res.next()) 
            {
                tbl.addRow(new Object[]{
                    res.getString("kd_pinjaman"),
                    res.getString("No_anggota"),
                    res.getString("Nama"),
                    res.getString("Sisa"),
                });
                tblCari.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah" +e);
        }
            tblCari.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblCari.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblCari.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCari.getColumnModel().getColumn(2).setPreferredWidth(200);
    }    
        
    }//GEN-LAST:event_txCariKeyReleased

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
            java.util.logging.Logger.getLogger(view_pinjamBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_pinjamBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_pinjamBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_pinjamBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view_pinjamBaru dialog = new view_pinjamBaru(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdID;
    private javax.swing.JRadioButton rdNama;
    private javax.swing.JTable tblCari;
    private javax.swing.JTextField txCari;
    // End of variables declaration//GEN-END:variables

    void tampil(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode");
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        tbl.addColumn("Sisa");
        tblCari.setModel(tbl);
        try {
            Statement statement=(Statement)Koneksi.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("SELECT kd_pinjaman, No_anggota, Nama, Sisa FROM t_angsuran");
            while (res.next()) 
            {
                tbl.addRow(new Object[]{
                    res.getString("kd_pinjaman"),
                    res.getString("No_anggota"),
                    res.getString("Nama"),
                    res.getString("Sisa"),
                });
                tblCari.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah" +e);
        }
            tblCari.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblCari.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblCari.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCari.getColumnModel().getColumn(2).setPreferredWidth(200);
    }
}
