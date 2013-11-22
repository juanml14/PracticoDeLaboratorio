package practicodelaboratorio;

import Persistencia.BaseDeDatos;
import Persistencia.DataAccessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Caja {

    public static void pagarMulta(Registro registro) throws DataAccessException {
        try {

            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Insert into caja "
                    + "(fecha,cliente,concepto,monto) values (?,?,?,?)");
            smt.setDate(1, Calendario.getFecha());
            smt.setInt(2, registro.getCliente());
            smt.setString(3, "multa");
            smt.setFloat(4, registro.getMontoMulta());
            smt.execute();
        } catch (ClassNotFoundException ex) {
            throw new DataAccessException("Error insertando en caja " + ex);
        } catch (SQLException ex) {
            throw new DataAccessException("Error insertando en caja " + ex);
        }
    }

    public static void pagarAlquiler(Registro registro) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Insert into caja "
                    + "(fecha,cliente,concepto,monto) values (?,?,?,?)");
            smt.setDate(1, Calendario.getFecha());
            smt.setInt(2, registro.getCliente());
            smt.setString(3, "alquiler");
            smt.setFloat(4, registro.getMonto());
            smt.execute();
        } catch (ClassNotFoundException ex) {
            throw new DataAccessException("Error insertando en caja " + ex);
        } catch (SQLException ex) {
            throw new DataAccessException("Error insertando en caja " + ex);
        }
        
    }

    public static Float aquiler(Date fecha1, Date fecha2) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("Select * from caja");
            Float monto = 0f;
            while (res.next()) {
                Date fechaReg = res.getDate("fecha");
                if (res.getString("concepto").equals("alquiler")) {
                    if (!fechaReg.after(fecha2)) {
                        if (fechaReg.before(fecha1)) {
                            monto = monto + res.getFloat("monto");
                        }
                    }
                }
            }
            res.close();
            smt.close();
            return monto;
        } catch (Exception e) {
            throw new DataAccessException("Error calculando montos por alquiler " + e);
        }
    }

    public static Float multa(Date fecha1, Date fecha2) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("Select * from caja");
            Float monto = 0f;
            while (res.next()) {
                Date fechaReg = res.getDate("fecha");
                if (res.getString("concepto").equals("multa")) {
                    if (!fechaReg.after(fecha2)) {
                        if (fechaReg.before(fecha1)) {
                            monto = monto + res.getFloat("monto");
                        }
                    }
                }
            }
            res.close();
            smt.close();
            return monto;
        } catch (Exception e) {
            throw new DataAccessException("Error calculando montos por multa " + e);
        }
    }

    public static Float total(Date fecha1, Date fecha2) throws DataAccessException {
        Float monto = 0f;
        monto=aquiler(fecha1, fecha2)+multa(fecha1, fecha2);
        return monto;
    }
}
