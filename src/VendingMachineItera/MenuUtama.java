

package VendingMachineItera;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuUtama extends javax.swing.JFrame {
    DefaultTableModel model;
    FungsiUtama f;
    int slot[] = new int[4];
    int harga[] = new int[4];
    String username;
    int saldo;

    /*untuk koneksi ke database*/
    Connect koneksi = new Connect();
    Connection Koneksi1 = koneksi.getConnection();
    
    public MenuUtama(String username) {        
        initComponents();
        f = new FungsiUtama();
        tblInfo.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 18));
        tblInfo.getTableHeader().setOpaque(false);
        tblInfo.getTableHeader().setBackground(new Color(32,126,203));
        tblInfo.getTableHeader().setForeground(new Color(255,255,255));
        setSize(963,763);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        
       try{
            Statement stmt = Koneksi1.createStatement();
            ResultSet rx = stmt.executeQuery("SELECT saldo FROM mahasiswa WHERE username=" + username);
            rx.next();
            saldo = rx.getInt("saldo");
            ResultSet rs = stmt.executeQuery("SELECT * FROM makanan");
            int i=0;
            while(rs.next()){
                slot[i]=0;
                harga[i] = rs.getInt("harga");
                i++;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "ada kesalahan dalam mengakses ke database");
        }
        
        this.username=username;
        String []judul={"Nama","Slot","Stok","Harga"};
        model = new DefaultTableModel(judul,0);
        tblInfo.setModel(model);
        txtFAmount.setText(String.valueOf(saldo));
        txtFAmount.setEditable(false);
        txtFHarga.setText(String.valueOf(f.hitungHarga(slot, harga, 4)));
        txtFHarga.setEditable(false);
        tblInfo.setEnabled(false);
        tampilInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFSlot1 = new javax.swing.JTextField();
        txtFSlot2 = new javax.swing.JTextField();
        txtFSlot3 = new javax.swing.JTextField();
        txtFSlot4 = new javax.swing.JTextField();
        lblSlot1 = new javax.swing.JLabel();
        lblSlot2 = new javax.swing.JLabel();
        lblSlot3 = new javax.swing.JLabel();
        lblSlot4 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        txtFAmount = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFSlot1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFSlot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFSlot1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFSlot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 30));

        txtFSlot2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFSlot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFSlot2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFSlot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 120, 30));

        txtFSlot3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFSlot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFSlot3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFSlot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 520, 120, 30));

        txtFSlot4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFSlot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFSlot4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFSlot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 520, 130, 30));

        lblSlot1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblSlot1.setText("SLOT 1");
        jPanel1.add(lblSlot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 170, 70, -1));

        lblSlot2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblSlot2.setText("SLOT 2");
        jPanel1.add(lblSlot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        lblSlot3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblSlot3.setText("SLOT 3");
        jPanel1.add(lblSlot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 450, 70, -1));

        lblSlot4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblSlot4.setText("SLOT 4");
        jPanel1.add(lblSlot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        btnHelp.setBackground(new java.awt.Color(255, 255, 255));
        btnHelp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 669, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Vending_Machine\\img\\Base.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Vending_Machine\\img\\Base.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Vending_Machine\\img\\Base.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Vending_Machine\\img\\Base.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setText("log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Vending_Machine\\img\\bg-01.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblInfo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblInfo);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 400, 420));

        txtFAmount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFAmountActionPerformed(evt);
            }
        });
        jPanel2.add(txtFAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 190, -1));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 90, 30));

        btnBuy.setBackground(new java.awt.Color(255, 255, 255));
        btnBuy.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 70, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Saldo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Vending_Machine\\img\\Untitled-3.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 440, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFSlot1ActionPerformed
        // TODO add your handling code here:
        txtFSlot1.setText("0");
    }//GEN-LAST:event_txtFSlot1ActionPerformed

    private void txtFSlot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFSlot2ActionPerformed
        // TODO add your handling code here:
        txtFSlot1.setText("0");
    }//GEN-LAST:event_txtFSlot2ActionPerformed

    private void txtFSlot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFSlot3ActionPerformed
        // TODO add your handling code here:
        txtFSlot1.setText("0");
    }//GEN-LAST:event_txtFSlot3ActionPerformed

    private void txtFSlot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFSlot4ActionPerformed
        // TODO add your handling code here:
        txtFSlot1.setText("0");
    }//GEN-LAST:event_txtFSlot4ActionPerformed

    private void txtFAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFAmountActionPerformed
    
    private void txtFSlot1KeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        int key=evt.getKeyCode();        
        if(txtFSlot1.getText().equals("")){
              slot[0] = 0;
          }else {
            try{
                int i = Integer.parseInt(txtFSlot1.getText());
                slot[0]=i;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Masukkan salah");
                txtFSlot1.selectAll();
            }
        }
        
        if(key==10 || key==39){
            txtFSlot2.requestFocus();
            txtFSlot2.selectAll();
        }else if(key==40){
            btnHelp.requestFocus();
        }
    }                                    

    private void txtFSlot2KeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        int key=evt.getKeyCode();        
        if(txtFSlot2.getText().equals("")){
              slot[1] = 0;
          }else {
            try{
                int i = Integer.parseInt(txtFSlot2.getText());
                slot[1]=i;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Masukkan salah");
                txtFSlot2.selectAll();
            }
        }
        
        if(key==10 || key==39){
            txtFSlot3.requestFocus();
            txtFSlot3.selectAll();
        }else if(key==37){
            txtFSlot1.requestFocus();
            txtFSlot1.selectAll();
        }else if(key==40){
            btnLogout.requestFocus();
        }
    }                                    

    private void txtFSlot3KeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        int key=evt.getKeyCode();        
        if(txtFSlot3.getText().equals("")){
              slot[2] = 0;
          }else {
            try{
                int i = Integer.parseInt(txtFSlot3.getText());
                slot[2]=i;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Masukkan salah");
                txtFSlot3.selectAll();
            }
        }
        
        if(key==10 || key==39){
            txtFSlot4.requestFocus();
            txtFSlot4.selectAll();
        }else if(key==37){
            txtFSlot2.requestFocus();
            txtFSlot2.selectAll();
        }else if(key==40){
            btnCancel.requestFocus();
        }
    }                                    

    private void txtFSlot4KeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        int key=evt.getKeyCode();        
        if(txtFSlot4.getText().equals("")){
              slot[3] = 0;
          }else {
            try{
                int i = Integer.parseInt(txtFSlot4.getText());
                slot[3]=i;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Masukkan salah");
                txtFSlot4.selectAll();
            }
        }
        
        if(key==10 || key==39){
            btnBuy.requestFocus();
        }else if(key==37){
            txtFSlot3.requestFocus();
            txtFSlot3.selectAll();
        }else if(key==40){
            btnBuy.requestFocus();
        }
    }

    private void btnCancelKeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            btnCancel.doClick();
        }else if(key==37){
            btnLogout.requestFocus();
        }else if(key==39){
            btnBuy.requestFocus();
        }else if(key==38){
            txtFSlot3.requestFocus();
        }
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtFSlot1.setText("");
        txtFSlot2.setText("");
        txtFSlot3.setText("");
        txtFSlot4.setText("");
        txtFHarga.setText("0");
            for(int i=0;i<4;i++){
                slot[i]=0;
            }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBuyKeyPressed(java.awt.event.KeyEvent evt) {                                  
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            btnBuy.doClick();
        }else if(key==37){
            btnCancel.requestFocus();
        }else if(key==38){
            txtFSlot4.requestFocus();
        }
        
    }
    
    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed

    try{
          Statement stmt = Koneksi1.createStatement();
          int slot[];
                    
          slot = new int[4];
          //menyimpan inputan di tiap slot
          if(txtFSlot1.getText().equals("")){
              slot[0] = 0;
          }else if(Integer.parseInt(txtFSlot1.getText())<0){
              slot[0] = 0;
              JOptionPane.showMessageDialog(this, "masukkan salah");
          }else{
              slot[0] = Integer.parseInt(txtFSlot1.getText());
          }
          
          if(txtFSlot2.getText().equals("")){
              slot[1] = 0;
          }else if(Integer.parseInt(txtFSlot2.getText())<0){
              slot[1] = 0;
              JOptionPane.showMessageDialog(this, "masukkan salah");
          }else{
              slot[1] = Integer.parseInt(txtFSlot2.getText());
          }
          
          if(txtFSlot3.getText().equals("")){
              slot[2] = 0;
          }else if(Integer.parseInt(txtFSlot3.getText())<0){
              slot[2] = 0;
              JOptionPane.showMessageDialog(this, "masukkan salah");
          }else{
              slot[2] = Integer.parseInt(txtFSlot3.getText());
          }
          
          if(txtFSlot4.getText().equals("")){
              slot[3] = 0;
          }else if(Integer.parseInt(txtFSlot4.getText())<0){
              slot[3] = 0;
              JOptionPane.showMessageDialog(this, "masukkan salah");
          }else{
              slot[3] = Integer.parseInt(txtFSlot4.getText());
          }
          
          if(!f.isEmpty(slot,4)){
            int stok[] = new int[4];
            int harga[] = new int[4];
            int i;
            ResultSet rs = stmt.executeQuery("SELECT * FROM makanan");
            i=0;
            while(rs.next()){
                stok[i] = rs.getInt("stok");
                harga[i] = rs.getInt("harga");
                i++;
            }
            int total = 0;
            for(i=0;i<4;i++){
                total = total + slot[i] * harga[i];
            }
            if(saldo>=total){
              for(i=0;i<4;i++){
                if(slot[i]<=stok[i]){
                  stok[i]=stok[i]-slot[i];
                }else{
                    throw new SQLException();
                }
              }
              for(i=0;i<4;i++){
                String query = "UPDATE makanan SET stok=" + stok[i] + " WHERE slot=" + (i+1);
                PreparedStatement pre = (PreparedStatement) Koneksi1.prepareStatement(query);
                pre.executeUpdate();
              }
              saldo=saldo-total;
              PreparedStatement pre = (PreparedStatement) Koneksi1.prepareStatement("UPDATE mahasiswa SET saldo=" + saldo + " WHERE username=" + username);
              pre.executeUpdate();

              JOptionPane.showMessageDialog(this,"Pembelian \n Lays : " +slot[0] + "\n Chitato : " + slot[1] + "\n Freshtea : " + slot[2] + "\n Aqua : " + slot[3]
              + "\n Dengan harga total " + total + " telah berhasil saldo " + saldo);
              

              //catat transaksi
              //pre = (PreparedStatement) conn.prepareStatement("INSERT into transaksi values ('"+username+"',"+slot[0]+","+slot[1]+","+slot[2]+","+slot[3]+",CURRENT_TIME");
            }else{
                JOptionPane.showMessageDialog(this,"Uang Anda Kurang");
            }
          }
          txtFSlot1.setText("");
          txtFSlot2.setText("");
          txtFSlot3.setText("");
          txtFSlot4.setText("");
          txtFAmount.setText(String.valueOf(saldo));
          txtFHarga.setText("0");
          for(int i=0;i<4;i++){
            slot[i]=0;
          }
          tampilInfo();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(this, "Ada beberapa kesalahan yang dideteksi : \n"
                   + "1. Tertangkap SQLException \n"
                   + "2. Jumlah stok barang tidak memenuhi permintaan \n"
                   + "3. Anda belum membaca bismillah \n");
       }
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnHelpKeyPressed(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if(key==10){
            btnHelp.doClick();
        }else if(key==39){
            btnLogout.requestFocus();
        }else if(key==38){
            txtFSlot1.requestFocus();
        }
    }
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"silahkan hubungi 082177550962");
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnLogoutKeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            btnLogout.doClick();
        }else if(key==37){
            btnHelp.requestFocus();
        }else if(key==39){
            btnCancel.requestFocus();
        }else if(key==38){
            txtFSlot2.requestFocus();
        }
    }
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        txtFHarga.setText(String.valueOf(f.hitungHarga(slot, harga, 4)));
    }                                         

    private void txtFSlot4FocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(txtFSlot4.getText().equals("")){
              slot[3] = 0;
          }else {
            try{
                int i = Integer.parseInt(txtFSlot4.getText());
                slot[3]=i;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Masukkan salah");
                txtFSlot4.requestFocus();
                txtFSlot4.selectAll();
            }
        }
    }                                   

    private void txtFSlot3FocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(txtFSlot3.getText().equals("")){
              slot[2] = 0;
          }else {
            try{
                int i = Integer.parseInt(txtFSlot3.getText());
                slot[2]=i;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Masukkan salah");
                txtFSlot3.requestFocus();
                txtFSlot3.selectAll();
            }
        }
    }                                   

    private void txtFSlot2FocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(txtFSlot2.getText().equals("")){
              slot[1] = 0;
          }else {
            try{
                int i = Integer.parseInt(txtFSlot2.getText());
                slot[1]=i;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Masukkan salah");
                txtFSlot2.requestFocus();
                txtFSlot2.selectAll();
            }
        }
    }                                   

    private void txtFSlot1FocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(txtFSlot1.getText().equals("")){
              slot[0] = 0;
          }else {
            try{
                int i = Integer.parseInt(txtFSlot1.getText());
                slot[0]=i;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Masukkan salah");
                txtFSlot1.requestFocus();
                txtFSlot1.selectAll();
            }
        }
    }   


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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSlot1;
    private javax.swing.JLabel lblSlot2;
    private javax.swing.JLabel lblSlot3;
    private javax.swing.JLabel lblSlot4;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtFAmount;
    private javax.swing.JTextField txtFHarga;
    private javax.swing.JTextField txtFSlot1;
    private javax.swing.JTextField txtFSlot2;
    private javax.swing.JTextField txtFSlot3;
    private javax.swing.JTextField txtFSlot4;
    // End of variables declaration//GEN-END:variables
   
    private void tampilInfo() {
        int row = tblInfo.getRowCount();
        for(int i=0;i<row;i++){
            model.removeRow(0);
        }
        try{
            Connection conn = DriverManager.getConnection(
           "jdbc:mysql://localhost/vending_machine",
            "root",
            "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM makanan");
            while(rs.next()){
                String data[]={rs.getString("nama"),rs.getString("slot"),rs.getString("stok"),rs.getString("harga")};
                model.addRow(data);
            }
        }catch(SQLException ex){
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
