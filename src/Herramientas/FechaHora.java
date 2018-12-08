/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author angel
 */
public class FechaHora {
    private String Fecha;
    private String Hora;
    private Date date = new Date();
    
    public String getFecha() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Fecha: " + dateFormat.format(date));
        Fecha = dateFormat.format(date);
        return Fecha;
    }
    public String getHora(){
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora: " + hourFormat.format(date));
        Hora = hourFormat.format(date);
        return Hora;
    }
    public static String obtenerFecha(){
        FechaHora cons = new FechaHora();
        return cons.getFecha();
    }
    public static String obtenerHora(){
        FechaHora cons = new FechaHora();
        return cons.getHora();
    }
}
