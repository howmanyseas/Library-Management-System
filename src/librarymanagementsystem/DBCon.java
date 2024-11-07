/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author howmanyseas
 */
public class DBCon {
    
    
     public static Connection getConnection(){

      
        Connection con = null;
        String username = "root";
        String password = "Whatam1doing?";
        String dataCon = "jdbc:mysql://localhost:3306/library?";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dataCon,username,password);
            //JOptionPane.showMessageDialog(null, "Connected with DB");
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("The problem is "+e);
        }
        return con;
    }
    
}
    

