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
    public static Date date;
    public void getFecha() {
        Date date = new Date();
//Caso 1: obtener la hora y salida por pantalla con formato:
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora: " + hourFormat.format(date));
//Caso 2: obtener la fecha y salida por pantalla con formato:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Fecha: " + dateFormat.format(date));
    }
}
