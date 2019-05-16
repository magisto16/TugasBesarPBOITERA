/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachineItera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Connect {
    Connection koneksi;
    public Connection getConnection() {
        try {
            koneksi= DriverManager.getConnection("jdbc:mysql://localhost/vending_machine","root","");
        } catch(SQLException ex) {
            System.out.println("Tidak dapat menyambungkan database");
        }
        
        return koneksi;
    }
    
    void close(Connection Connect) {
        try {
            Connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
