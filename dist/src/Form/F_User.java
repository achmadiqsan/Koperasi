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
public class F_User extends javax.swing.JDialog {

    /**
     * Creates new form F_User
     */
    public F_User(java.awt.Frame parent, boolean modal) {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_user = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtUser1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manajemen User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Emoji", 0, 14))); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_user.setModel(new javax.swing.table.DefaultTableModel(
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
        t_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_user);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        jTabbedPane1.addTab("Data User", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 200, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("User");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton1.setText("HAPUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jButton2.setText("TAMBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jTabbedPane1.addTab("Tambah User", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel3.add(txtUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("User");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtPassword1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel3.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 190, -1));

        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jTabbedPane1.addTab("Reset Password", jPanel3);

        jButton4.setText("KELUAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(366, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_userMouseClicked
        try {
            int row = t_user.rowAtPoint(evt.getPoint());

            String user = t_user.getValueAt(row, 0).toString();
            String pass = t_user.getValueAt(row, 1).toString();

            txtUser1.setText(String.valueOf(user));
            txtPassword1.setText(String.valueOf(pass));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_t_userMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hapus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        insert();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(F_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                F_User dialog = new F_User(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable t_user;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUser1;
    // End of variables declaration//GEN-END:variables

    void insert(){
        try {
                Statement statement=(Statement)Koneksi.GetConnection().createStatement();
                String sql = "INSERT INTO t_user VALUES ('"+txtUser.getText()+"','"+txtPassword.getText()+"')";
                statement.executeUpdate(sql);
                statement.close();
                bersih();
                tampil();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
            }
        
    }
    void tampil(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("User");
        tbl.addColumn("Password");
        t_user.setModel(tbl);
        try {
            Statement statement=(Statement)Koneksi.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("Select * from t_user");
            while (res.next()) 
            {
                tbl.addRow(new Object[]{
                    res.getString("user"),
                    res.getString("pass"),
                });
                t_user.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah" +e);
        }
            t_user.getColumnModel().getColumn(0).setPreferredWidth(100);
            t_user.getColumnModel().getColumn(1).setPreferredWidth(100);
    }
    
    void hapus(){
        if(txtUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih data yang akan di Hapus");
        }
        else{
            int selectedOption = JOptionPane.showConfirmDialog(null, "Yakin anda akan menghapus ?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                try {
                    Statement statement=(Statement)Koneksi.GetConnection().createStatement();

                    String sql = "DELETE FROM t_user WHERE user = '"+txtUser.getText()+"';";                    
                    statement.executeUpdate(sql);
                    statement.close();

                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
                    bersih();
                } catch (Exception DBException) {
                    JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus " + DBException);
                    }
            }            
            tampil();
        }
    }
    
    void reset(){
        try {
                Statement statement=(Statement)Koneksi.GetConnection().createStatement();
                String sql = "UPDATE t_user SET pass = '" +txtPassword1.getText()+"'"
                        + "WHERE user = '"+txtUser1.getText()+"'";                    
                statement.executeUpdate(sql);
                statement.close();
                tampil();
                JOptionPane.showMessageDialog(null, "Password Berhasil Di Reset");
                bersih();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Password Gagal Di Reset" + e);
            }
    }
    
    void bersih(){
        txtUser.setText("");
        txtPassword.setText("");
    }
}
