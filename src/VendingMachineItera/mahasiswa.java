package VendingMachineItera;

import java.awt.Dimension;
import java.awt.Toolkit;
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

public class mahasiswa extends javax.swing.JFrame {
    DefaultTableModel model;
    String user;
    int jum;
    
    public mahasiswa(String user) {
        this.user=user;
        initComponents();
        setSize(963,763);
        jTable2.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 18));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setBackground(new Color(32,126,203));
        jTable2.getTableHeader().setForeground(new Color(255,255,255));
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        String []judul={"ID","Username","Nama","Password","Saldo","admin"};
        model = new DefaultTableModel(judul,0);
        jTable2.setModel(model);
        tampilkan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        saldo = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 280, 40));

        password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 280, 40));

        nama.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 280, 40));

        username.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 280, 40));

        id.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 280, 39));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 53, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 75, 28));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Saldo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, -1));

        insert.setBackground(new java.awt.Color(255, 255, 255));
        insert.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 80, 34));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, 34));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 380, 80, 34));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 668, 90, 30));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 465, 430));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setText("INSTITUT TEKNOLOGI SUMATERA");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 500, 710));

        pack();
    }// </editor-fold>                        

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(nama.getText().equals("")|| 
           username.getText().equals("")||
           password.getText().equals("")||
           saldo.getText().equals("") ||
           id.getText().equals("")){
           JOptionPane.showMessageDialog(null,"kolom tidak boleh kosong");
            id.setText("");
            username.setText("");
            nama.setText("");
            password.setText("");
            saldo.setText("");
            
        }else{
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
            cn.createStatement().executeUpdate("insert into mahasiswa values"+"('"+id.getText()+"','"+username.getText()+"','"
            +nama.getText()+"','"+password.getText()+"','"+saldo.getText()+"','"+user+"')");
           id.setText("");
           username.setText("");
           nama.setText("");
           password.setText("");
           saldo.setText("");
           tampilkan();
           JOptionPane.showMessageDialog(null,"input succes");
        } catch (SQLException ex) {
            //Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"maaf,anda salah tekan tombol atau salah input");
           id.setText("");
           username.setText("");
           nama.setText("");
           password.setText("");
           saldo.setText("");
        
        }
        }
      
    }                                      

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
       if(nama.getText().equals("")|| 
           username.getText().equals("")||
           password.getText().equals("")||
           saldo.getText().equals("") ||
           id.getText().equals("")){
           JOptionPane.showMessageDialog(null,"kolom tidak boleh kosong");
            id.setText("");
            username.setText("");
            nama.setText("");
            password.setText("");
            saldo.setText("");
            
        }
        else{
        try {
            // TODO add your handling code here:
            if(saldo.getText().equals("")){
                
            }else{
                
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
            cn.createStatement().executeUpdate("update mahasiswa set "
            + "username='"+username.getText()+"' ,nama='"+nama.getText()+"',"
            + ""+ "password='"+password.getText()+"',"
            + ""+ "saldo='"+(Integer.parseInt(saldo.getText())+jum)+"'"
            + ""+ "where "+"User_ID='"+id.getText()+"'");
             
            }
            
            id.setText("");
            username.setText("");
            nama.setText("");
            password.setText("");
            saldo.setText("");
            tampilkan(); 
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"input data tidak valid");
             id.setText("");
            username.setText("");
            nama.setText("");
            password.setText("");
            saldo.setText("");
            //Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }                                      

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
            cn.createStatement().executeUpdate("delete from mahasiswa where username='"+username.getText()+"'");
            id.setText("");
            username.setText("");
            nama.setText("");
            password.setText("");
            saldo.setText("");
            tampilkan();
        } catch (SQLException ex) {
            Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }                                      

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        int i = jTable2.getSelectedRow();
        if(i>-1){
            id.setText(model.getValueAt(i,0).toString());
            username.setText(model.getValueAt(i,1).toString());
            nama.setText(model.getValueAt(i,2).toString());
            password.setText(model.getValueAt(i,3).toString());
            saldo.setText("0");
            jum=Integer.parseInt(model.getValueAt(i,4).toString());
        }
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        EditDatabase p = new EditDatabase(user);
        p.setVisible(true);
        dispose();
    }                                        

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

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
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new mahasiswa().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField password;
    private javax.swing.JTextField saldo;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration                   

    private void tampilkan() {
        int row = jTable2.getRowCount();
        for(int i=0; i<row; i++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
            ResultSet rs = cn.createStatement().executeQuery("select mahasiswa.User_ID,mahasiswa.username,mahasiswa.nama,mahasiswa.password,saldo,admin.nama from admin inner join mahasiswa on mahasiswa.admin = admin.username");
            while(rs.next()){
                String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
