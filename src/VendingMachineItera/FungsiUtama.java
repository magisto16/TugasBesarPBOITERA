/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachineItera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nardiyansah
 */
public class FungsiUtama extends Fungsi {

    @Override
    public boolean isEmpty(int slot[],int x) {
        boolean isi = true;
        for(int i=0;i<x;i++){
            if(slot[i] != 0){
                isi = false;
            }
        }
        return isi;
    }
    
}
