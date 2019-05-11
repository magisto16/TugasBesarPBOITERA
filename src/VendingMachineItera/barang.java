package VendingMachineItera;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class barang extends javax.swing.JFrame {
     DefaultTableModel model;

    public barang() {
        initComponents();
        setSize(963,763);
        jTable1.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 18));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32,126,203));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        
        String []judul={"ID","Nama","Slot","Stok","Harga"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
        tampilkan();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        insert = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        slot = new javax.swing.JTextField();
        stok = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insert.setBackground(new java.awt.Color(255, 255, 255));
        insert.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 92, 33));

        id.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 266, 37));

        nama.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 266, 35));

        slot.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(slot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 266, 35));

        stok.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 266, 30));

        harga.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 266, 33));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 90, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 62, 37));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STOK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 81, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SLOT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 73, 33));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAMA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 89, 33));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HARGA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 92, 33));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 92, 33));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 32, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Vending_Machine\\img\\bg-01.jpg")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 708));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(0);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Vending_Machine\\img\\Untitled-3.png")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 160, 160));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setText("INSTITUT TEKNOLOGI SUMATERA");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 480, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int i = jTable1.getSelectedRow();
        if(i>-1){
            id.setText(model.getValueAt(i,0).toString());
            nama.setText(model.getValueAt(i,1).toString());
            slot.setText(model.getValueAt(i,2).toString());
            stok.setText(model.getValueAt(i,3).toString());
            harga.setText(model.getValueAt(i,4).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
            cn.createStatement().executeUpdate("delete from makanan where id='"+id.getText()+"'");

            id.setText("");
            nama.setText("");
            slot.setText("");
            stok.setText("");
            harga.setText("");
            tampilkan();
        } catch (SQLException ex) {
            Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
       if(nama.getText().equals("")||
           id.getText().equals("")||
           slot.getText().equals("")||
           stok.getText().equals("")||
           harga.getText().equals("")){
             JOptionPane.showMessageDialog(null,"kolom tidak boleh kosong");
            id.setText("");
            nama.setText("");
            slot.setText("");
            stok.setText("");
            harga.setText("");
        }else{
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
            int hasil=Integer.parseInt(slot.getText());	
             if(hasil <= 4 ){
            cn.createStatement().executeUpdate("update makanan set nama='"+nama.getText()+"',"
            + "slot='"+slot.getText()+"',stok='"+stok.getText()+"',harga='"+harga.getText()+"'"+ ""
            + "where id='"+id.getText()+"'");
            
            id.setText("");
            nama.setText("");
            slot.setText("");
            stok.setText("");
            harga.setText("");
            tampilkan(); 
        }else{
            JOptionPane.showMessageDialog(null,"jumlah slot kelebihan,input slot maksimal 4");
            id.setText("");
           nama.setText("");
           slot.setText("");
           stok.setText("");
           harga.setText("");
             }} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"input data tidak valid");
            id.setText("");
            nama.setText("");
            slot.setText("");
            stok.setText("");
            harga.setText("");
            //Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    }//GEN-LAST:event_updateActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        EditDatabase p = new EditDatabase();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
       if(nama.getText().equals("")||
           id.getText().equals("")||
           slot.getText().equals("")||
           stok.getText().equals("")||
           harga.getText().equals("")){
             JOptionPane.showMessageDialog(null,"kolom tidak boleh kosong");
            id.setText("");
            nama.setText("");
            slot.setText("");
            stok.setText("");
            harga.setText("");
        }
        else{
        try {
            // TODO add your handling code here:
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
            int hasil=Integer.parseInt(slot.getText());	
        if(hasil <= 4 ){
            
       
            cn.createStatement().executeUpdate("insert into makanan values"+"('"+id.getText()+"','"
            +nama.getText()+"','"+slot.getText()+"','"+stok.getText()+"','"+harga.getText()+"')");
            
           id.setText("");
           nama.setText("");
           slot.setText("");
           stok.setText("");
           harga.setText("");
           tampilkan();
            JOptionPane.showMessageDialog(null,"input succes");
        }else{
            JOptionPane.showMessageDialog(null,"jumlah slot kelebihan");
            id.setText("");
           nama.setText("");
           slot.setText("");
           stok.setText("");
           harga.setText("");
        }}catch (SQLException ex) {
            //Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"maaf,anda salah tekan tombol atau salah input");
                id.setText("");
               nama.setText("");
               slot.setText("");
               stok.setText("");
               harga.setText("");
        }
        }
    }//GEN-LAST:event_insertActionPerformed

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
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField slot;
    private javax.swing.JTextField stok;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
    int row = jTable1.getRowCount();
        for(int i=0; i<row; i++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
            ResultSet rs = cn.createStatement().executeQuery("select * from makanan");
            while(rs.next()){
                String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

