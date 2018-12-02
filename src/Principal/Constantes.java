/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author angel
 */
public class Constantes {
    public static String Fecha;
    public static String Hora;
    Date date = new Date();
    
    public Constantes(){
    }
    public void getFecha() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Fecha = dateFormat.format(date);
    }
    void getHora(){
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora: " + hourFormat.format(date));
        Hora = hourFormat.format(date);
    }
    public static String obtenerFecha(){
        
        return Fecha;
    }
    public static String obtenerHora(){
        return Hora;
    }
}
