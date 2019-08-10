/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;
import Principal.Constantes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BD {
    private Connection conexion;
    
    public String conectarBD(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cecytem?useTimezon=true&serverTimezone=UTC",
                    Constantes.GetUsuario(),Constantes.GetContraseña());
            return "Se ha conectado la base de datos satisfactoriamente";
        }catch (SQLException ex){
            System.out.println("Error en la conexión a la base de datos: "+ex.getMessage());
            return "error:"+ex.getMessage();
        }
         catch (ClassNotFoundException ex) {
             System.out.println("Error en la conexión a la base de datos: " + ex.getMessage());
            conexion = null;
        
        } catch (InstantiationException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
            return "error"+conexion.toString();
        }
        return "";*/
        return null;
        
    }
        
    
    public String cerrarBD(){
        try{
            conexion.close();
            return "Se ha cerrado la base de datos satisfactoriamente";
        }catch (Exception e){
            return e.getMessage();
        }
    }
    
    public ResultSet ejecutarSentenciaSQL(String sentencia){
        try{
            Statement st;
            st = conexion.createStatement();
            System.out.println("Si");
            
            st.execute(sentencia);
            System.out.println(sentencia);
            //st.getResultSet().first();
            return st.getResultSet();
        }catch (Exception e){ 
               System.out.println(e.getMessage());
             return null;
        }
    }
    
    public void finalize(){
        this.cerrarBD();
    }
}
