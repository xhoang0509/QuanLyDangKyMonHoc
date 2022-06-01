/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import com.mycompany.quanlydangkymonhoc.connectDB.connectDataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class tesst1 {
    public static void main(String[] args) {
        PreparedStatement st;
        ResultSet rs;
        
        String query = "Select * from users";
        try {
            st = connectDataBase.getConnection().prepareStatement(query);
            rs = st.executeQuery();
            
            if(rs.next()){
                System.out.println("Thanh cong");
            }else{
                System.out.println("fails");
            }
        } catch (SQLException ex) {
            Logger.getLogger(tesst1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
