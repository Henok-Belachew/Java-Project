
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class javaconnect {
    
        Connection conn;
    public static Connection ConnecrDb(){  
        try{  
            
            Class.forName("org.sqlite.JDBC");  
            Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\database fies\\AllTablesDataBase.sqlite");    
            return conn;
        
        }catch(Exception e){   
            JOptionPane.showMessageDialog(null, e);
            return null;
        }  
 
    }
}
