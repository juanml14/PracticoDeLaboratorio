/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicodelaboratorio;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Juan
 */
public class Calendario {

    static Calendar cal = Calendar.getInstance();

    ;

    public static Date getFecha() {
        cal = Calendar.getInstance();
        java.sql.Date fecha = new java.sql.Date(cal.getTime().getTime());
        return fecha;
    }

    public static Date getFechaDevolucion(Date fechaAlquiler) {

        cal.setTime(fechaAlquiler);
        Integer dia = cal.get(Calendar.DAY_OF_WEEK);
        if (dia == 6) {
            cal.add(Calendar.DAY_OF_MONTH, 2);
            Date fecha = new java.sql.Date(cal.getTime().getTime());
            return fecha;

        } else {
            cal.add(Calendar.DAY_OF_MONTH, 1);
            Date fecha = new java.sql.Date(cal.getTime().getTime());
            return fecha;

        }
    }

    public static Boolean comprobarMulta(Date fechaDevolucion) {
        if (fechaDevolucion.before(Calendario.getFecha())) {
            return true;
        } else {
            return false;
        }
    }

    static Long diasDeRetraso(Date fechaDeEntrega) {
        Calendar aux = Calendar.getInstance();
        aux.setTime(fechaDeEntrega);
        Long lFechaEntrega = aux.getTimeInMillis();
        Long lFecha = cal.getTimeInMillis();
        Long lDias = (lFecha - lFechaEntrega) / (24 * 60 * 60 * 1000);
        return lDias;
    }

    public static void getFecha(Date fecha) {
    }

    public static Date getFechaSpinner(String fecha) {
        String stringMes = fecha.substring(4, 7);
        Integer dia = Integer.parseInt(fecha.substring(8, 10));
        Integer año = Integer.parseInt(fecha.substring(24, 28));
        Integer mes=0;
        if (stringMes.equals("Jan")) {
            mes = 0;
        }
        if (stringMes.equals("Feb")) {
            mes = 1;
        }
        if (stringMes.equals("Mar")) {
            mes = 2;
        }
        if (stringMes.equals("Apr")) {
            mes = 3;
        }
        if (stringMes.equals("May")) {
            mes = 4;
        }
        if (stringMes.equals("Jun")) {
            mes = 5;
        }
        if (stringMes.equals("Jul")) {
            mes = 6;
        }
        if (stringMes.equals("Aug")) {
            mes = 7;
        }
        if (stringMes.equals("Sep")) {
            mes = 8;
        }
        if (stringMes.equals("Oct")) {
            mes = 9;
        }
        if (stringMes.equals("Nov")) {
            mes = 10;
        }
        if (stringMes.equals("Dec")) {
            mes = 11;
        }

        cal.set(año, mes, dia);
        Date fecha1 = new java.sql.Date(cal.getTime().getTime());
        return fecha1;

    }
}
