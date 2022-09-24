/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entity.Auto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emidz
 */
public class AutoDAO {

    public static final String SQL_INSERT_ONE = "INSERT INTO auto (patente,marca,modelo,color,tipoMotor) VALUES (?,?,?,?,?)";
    public static final String SQL_SELECT_ALL = "SELECT * FROM auto";
    
    public List <Auto> readAll ()  {
        
            Connection con = null;
            PreparedStatement st = null;
            Auto auto = null;
            ResultSet rs = null;
            List<Auto> lista = new ArrayList<>();
            con = Conn.conectar ();
        try {
            
            st = con.prepareStatement(SQL_SELECT_ALL);
            rs = st.executeQuery();
            while (rs.next()){
                auto = new Auto (rs.getString("patente"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("color"),
                        rs.getString("tipoMotor")
                );
                lista.add(auto);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
                try {
                    Conn.close(rs);
                    Conn.close(st);
                    Conn.close(con);
                } catch (SQLException ex) {
                    Logger.getLogger(AutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
    return lista;
    }
    
    public int insertAuto(Auto auto) {
        int reg = 0;
        Connection conn = null;
        PreparedStatement st = null;

        conn = Conn.conectar();

        try {
            st = conn.prepareStatement(SQL_INSERT_ONE);
            
            st.setString(1, auto.getPatente());
            st.setString(2, auto.getMarca());
            st.setString(3, auto.getModelo());
            st.setString(4, auto.getColor());
            st.setString(5, auto.getTipoMotor());
            
            reg = st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conn.close(st);
                Conn.close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(AutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return reg;
    }
}
