/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;
import java.sql.*;

public class conexion {
    private Connection con = null;
    
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cecytem","root","root");       
            }
        catch (ClassNotFoundException |SQLException e){
            System.out.println("Error");
            }  
        return con;
    }
    
    public void cerrarConexion (Connection con) {
        try {
            con.close();
        }catch (SQLException e){
            System.out.println("error");
}
    }
}
