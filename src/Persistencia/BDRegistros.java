package Persistencia;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import practicodelaboratorio.Cliente;
import practicodelaboratorio.Pelicula;
import practicodelaboratorio.Registro;

public class BDRegistros {

    public static ArrayList<Registro> PendienteDevolucion() throws DataAccessException, NotFoundException {
        {
            try {
                Connection con = BaseDeDatos.getInstance();
                Statement smt = con.createStatement();
                ResultSet res = smt.executeQuery("SELECT * FROM registro WHERE"
                        + " pendiente = true");
                ArrayList<Registro> registros = new ArrayList();
                while (res.next()) {
                    registros.add(new Registro(res.getInt("id"), res.getInt("cliente"),
                            res.getDate("fecha"), res.getFloat("alquiler"),
                            res.getFloat("multa"), res.getDate("fechadevolucion"),
                            res.getString("peliculas")));
                }
                res.close();
                smt.close();
                if (registros.isEmpty()) {
                    throw new NotFoundException("no se han encontrado registros pendientes de devolucion");
                }

                return registros;
            } catch (SQLException e) {
                throw new DataAccessException("Error buscando registros pendientes " + e.getMessage());
            } catch (ClassNotFoundException e) {
                throw new DataAccessException("Error buscando registros pendientes " + e.getMessage());
            }
        }
    }

    public static ArrayList<Registro> buscarCliente(Cliente cliente) throws DataAccessException, NotFoundException, SQLException, ClassNotFoundException {
        {
            try {
                Connection con = BaseDeDatos.getInstance();
                Statement smt = con.createStatement();
                ResultSet res = smt.executeQuery("SELECT * FROM registro WHERE"
                        + " cliente = " + cliente.getId());
                ArrayList<Registro> registros = new ArrayList();
                while (res.next()) {
                    registros.add(new Registro(res.getInt("id"), res.getInt("cliente"),
                            res.getDate("fecha"), res.getFloat("alquiler"),
                            res.getFloat("multa"), res.getDate("fechadevolucion"),
                            res.getString("peliculas")));
                }
                res.close();
                smt.close();
                if (registros.isEmpty()) {
                    throw new NotFoundException("no se han encontrado registros del cliente");
                }

                return registros;
            } catch (Exception e) {
                throw new DataAccessException("Error buscando registros del cliente " + e);
            }
        }
    }

    public static ArrayList<Registro> buscarPendientesDe(Cliente cliente) throws DataAccessException, NotFoundException, SQLException, ClassNotFoundException {
        {
            try {
                Connection con = BaseDeDatos.getInstance();
                Statement smt = con.createStatement();
                ResultSet res = smt.executeQuery("SELECT * FROM registro WHERE"
                        + " cliente = " + cliente.getId() + "AND pendiente=true");
                ArrayList<Registro> registros = new ArrayList();
                while (res.next()) {
                    registros.add(new Registro(res.getInt("id"), res.getInt("cliente"),
                            res.getDate("fecha"), res.getFloat("alquiler"),
                            res.getFloat("multa"), res.getDate("fechadevolucion"),
                            res.getString("peliculas")));
                }
                res.close();
                smt.close();
                if (registros.isEmpty()) {
                    throw new NotFoundException("no se han encontrado registros del cliente");
                }

                return registros;
            } catch (Exception e) {
                throw new DataAccessException("Error buscando registros pendientes del cliente " + e);
            }
        }
    }

    public static void insertar(Registro registro) throws DataAccessException {
        try {

            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Insert into registro (cliente,"
                    + "peliculas,alquiler,fecha,fechadevolucion,multa,pendiente) values (?,?,?,?,?,?,?)");
            smt.setInt(1, registro.getCliente());
            smt.setString(2, registro.PeliculasString());
            smt.setFloat(3, registro.getMonto());
            smt.setDate(4, registro.getFecha());
            smt.setDate(5, registro.getFechaDeEntrega());
            smt.setFloat(6, 0f);
            smt.setBoolean(7, true);
            smt.execute();
        } catch (Exception e) {
            throw new DataAccessException("Error en Insertando Registro " + e);
        }
    }

    public static void actualizar(Registro registro) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Update registro set cliente=?,peliculas=?,alquiler=?,fecha=?,"
                    + "fechadevolucion=?,multa=? where id=?");
            smt.setInt(1, registro.getCliente());
            smt.setString(2, registro.PeliculasString());
            smt.setFloat(3, registro.getMonto());
            smt.setDate(4, registro.getFecha());
            smt.setDate(5, registro.getFechaDeEntrega());
            smt.setFloat(6, registro.getMontoMulta());
            smt.setInt(7, registro.getId());
            smt.execute();
        } catch (Exception e) {
            throw new DataAccessException("Error en Actualizando Pelicula" + e);
        }
    }

    public static void devuelto(Registro registro) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Update registro set pendiente=?"
                    + " where id=?");
            smt.setBoolean(1, false);
            smt.setInt(2, registro.getId());
            smt.execute();
        } catch (Exception e) {
            throw new DataAccessException("Error en Actualizando Pelicula" + e);
        }
    }

    public static Registro buscarPorId(Integer id) throws DataAccessException {

        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("SELECT * FROM registro WHERE"
                    + " id = " + id);
            Registro reg = null;
            while (res.next()) {
                reg = new Registro(res.getInt("id"), res.getInt("cliente"),
                        res.getDate("fecha"), res.getFloat("alquiler"),
                        res.getFloat("multa"), res.getDate("fechadevolucion"),
                        res.getString("peliculas"));
            }
            res.close();
            smt.close();
            if (reg == null) {
                throw new NotFoundException("no se han encontrado registros del cliente");
            }

            return reg;
        } catch (Exception e) {
            throw new DataAccessException("Error buscando registros por id " + e);
        }
    }
}
