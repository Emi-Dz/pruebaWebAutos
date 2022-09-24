/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emidz
 */
public class Conn {
    private static final String BD_URL = "jdbc:mysql://localhost:3306/autos?&serverTimezone=UTC";
    private static final String BD_USER = "admin";
    private static final String BD_PASS = "admin";
    
    public static Connection conectar(){
        
        
            try { 
                Class.forName("com.mysql.jdbc.Driver");
                return DriverManager.getConnection(BD_URL, BD_USER, BD_PASS);
            } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
        //mas lineas
        return null;
    }
    
    public static void close(Connection c) throws SQLException{
        c.close();
    }
    public static void close (Statement st) throws SQLException{
        st.close();
    }
    
    public static void close (PreparedStatement st) throws SQLException{
        st.close();
    }
    
    public static void close (ResultSet rs) throws SQLException{
        rs.close();
    }
}
