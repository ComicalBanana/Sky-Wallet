/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROL.DaftarCatatankeuangan_Control;
import MODEL.Keuangan_Model;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class DaftarCatatankeuangan extends javax.swing.JFrame {
    public DefaultTableModel ModelTable = new DefaultTableModel();
    public static DaftarCatatankeuangan_Control ListKeuanganData;

    /**
     * Creates new form DaftarCatatankeuangan
     */
    public DaftarCatatankeuangan() {
        initComponents();
        ListKeuanganData = new DaftarCatatankeuangan_Control(this);
        setNameColumnTable();
        ListKeuanganData.getKeuanganData(idUser, this);
        
        
        
    }

    int idUser;
     String username;
     String nama;
     String password;
     int no_telp;
     String jenis_kelamin;
    
    DaftarCatatankeuangan(int idUser, String username, String nama, String password, int no_telp, String jenis_kelamin) {
        initComponents();
        ListKeuanganData = new DaftarCatatankeuangan_Control(this);
        setNameColumnTable();
        ListKeuanganData.getKeuanganData(idUser, this);
        useridLbl.setText(String.valueOf(idUser));
        
        this.idUser = idUser;
        this.username = username;
        this.nama = nama;
        this.password = password;
        this.no_telp = no_telp;
        this.jenis_kelamin = jenis_kelamin;
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
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        TotalJumlahPemasukanLbl = new javax.swing.JButton();
        JumlahPengeluaranTbl = new javax.swing.JButton();
        ValueJumlahPengeluaranLbl = new javax.swing.JLabel();
        ValueTotalJumalahPemasukanLbl = new javax.swing.JLabel();
        TotalUangBtn = new javax.swing.JButton();
        TotalUangLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        KeuanganTbl = new javax.swing.JTable();
        useridLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 208, 213));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 640));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("DAFTAR");

        label1.setText("Pengeluaran");

        jButton1.setBackground(new java.awt.Color(25, 118, 210));
        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("CATATAN KEUANGAN");

        jButton2.setBackground(new java.awt.Color(126, 237, 254));
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        TotalJumlahPemasukanLbl.setText("Total Jumlah Pemasukan");
        TotalJumlahPemasukanLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TotalJumlahPemasukanLblMouseClicked(evt);
            }
        });
        TotalJumlahPemasukanLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalJumlahPemasukanLblActionPerformed(evt);
            }
        });

        JumlahPengeluaranTbl.setText("Total Jumlah Pengeluaran");
        JumlahPengeluaranTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JumlahPengeluaranTblMouseClicked(evt);
            }
        });
        JumlahPengeluaranTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahPengeluaranTblActionPerformed(evt);
            }
        });

        ValueJumlahPengeluaranLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ValueJumlahPengeluaranLbl.setText("0");

        ValueTotalJumalahPemasukanLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ValueTotalJumalahPemasukanLbl.setText("0");

        TotalUangBtn.setText("Total Uang");
        TotalUangBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TotalUangBtnMouseClicked(evt);
            }
        });
        TotalUangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalUangBtnActionPerformed(evt);
            }
        });

        TotalUangLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TotalUangLbl.setText("0");

        KeuanganTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(KeuanganTbl);

        useridLbl.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValueJumlahPengeluaranLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JumlahPengeluaranTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(439, 439, 439))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValueTotalJumalahPemasukanLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TotalUangBtn)
                                .addGap(45, 45, 45)
                                .addComponent(TotalUangLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(useridLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TotalJumlahPemasukanLbl)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(TotalJumlahPemasukanLbl)
                .addGap(45, 45, 45)
                .addComponent(JumlahPengeluaranTbl)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ValueJumlahPengeluaranLbl)
                        .addComponent(useridLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ValueTotalJumalahPemasukanLbl))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalUangBtn)
                    .addComponent(TotalUangLbl))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setNameColumnTable(){
        KeuanganTbl.setModel(ModelTable);
        ModelTable.addColumn("TANGGAL");
        ModelTable.addColumn("PEMASUKAN");
        ModelTable.addColumn("PENGELUARAN");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        catatkeuangan frameText = new catatkeuangan();
        frameText.setVisible(true);
        frameText.pack();
        frameText.setLocationRelativeTo(null);
        frameText.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DefaultTableModel model = (DefaultTableModel)KeuanganTbl.getModel();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void AddRowToJtable(Object[] dataRow){
//        DefaultTableModel model = (DefaultTableModel)KeuanganTbl.getModel();
//        model.addRow(dataRow);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Dashboard().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TotalJumlahPemasukanLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalJumlahPemasukanLblActionPerformed
//        int total = 0;
//        for (int i = 0; i < KeuanganTbl.getRowCount();i++){
//            int amount = Integer.parseInt((String)KeuanganTbl.getValueAt(i,1));
//            total += amount;
//
//        }
//        ValueTotalJumalahPemasukanLbl.setText("" + total);
    }//GEN-LAST:event_TotalJumlahPemasukanLblActionPerformed

    private void JumlahPengeluaranTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahPengeluaranTblActionPerformed
//        int total = 0;
//        for (int i = 0; i < KeuanganTbl.getRowCount();i++){
//            int amount = Integer.parseInt((String)KeuanganTbl.getValueAt(i,2));
//            total += amount;
//        }
//        jLabel5.setText("" + total);
    }//GEN-LAST:event_JumlahPengeluaranTblActionPerformed

    private void TotalUangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalUangBtnActionPerformed
//        int total = 0;
//        int jumlah = 0;
//        int baru = 0;
//        for (int i = 0; i < KeuanganTbl.getRowCount();i++){
//            int amount = Integer.parseInt((String)KeuanganTbl.getValueAt(i,1));
//            total += amount;
//            int baka = Integer.parseInt((String)KeuanganTbl.getValueAt(i,2));
//            jumlah += baka;
//            baru = total - jumlah;
//            
//        }
//        TotalUangLbl.setText("" + baru);
    }//GEN-LAST:event_TotalUangBtnActionPerformed

    private void JumlahPengeluaranTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JumlahPengeluaranTblMouseClicked
        int total = ListKeuanganData.getTotalJumalahPengeluaran(this);
        ValueJumlahPengeluaranLbl.setText(String.valueOf(total));
    }//GEN-LAST:event_JumlahPengeluaranTblMouseClicked

    private void TotalJumlahPemasukanLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalJumlahPemasukanLblMouseClicked
        int total = ListKeuanganData.getTotalJumalahPemasukan(this);
        ValueTotalJumalahPemasukanLbl.setText(String.valueOf(total));
    }//GEN-LAST:event_TotalJumlahPemasukanLblMouseClicked

    private void TotalUangBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalUangBtnMouseClicked
        int TotalUang = 0;
        TotalUang = TotalUang + ListKeuanganData.getTotalJumalahPemasukan(this);
        TotalUang = TotalUang - ListKeuanganData.getTotalJumalahPengeluaran(this);
        TotalUangLbl.setText(String.valueOf(TotalUang));
    }//GEN-LAST:event_TotalUangBtnMouseClicked

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
            java.util.logging.Logger.getLogger(DaftarCatatankeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarCatatankeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarCatatankeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarCatatankeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarCatatankeuangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JumlahPengeluaranTbl;
    private javax.swing.JTable KeuanganTbl;
    private javax.swing.JButton TotalJumlahPemasukanLbl;
    private javax.swing.JButton TotalUangBtn;
    private javax.swing.JLabel TotalUangLbl;
    private javax.swing.JLabel ValueJumlahPengeluaranLbl;
    private javax.swing.JLabel ValueTotalJumalahPemasukanLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JLabel useridLbl;
    // End of variables declaration//GEN-END:variables
}
