/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author angel
 */
public class Constantes {
    public static String Usuario;
    public static String Contraseña;
   
    public static void SetUsuario(String User){
        Usuario = User;
    }
    public static void SetContraseña(String Pass){
        Contraseña = Pass;
    }
    public static String GetUsuario(){
        return Usuario;
    }
    public static String GetContraseña(){
        return Contraseña;
    }
}
