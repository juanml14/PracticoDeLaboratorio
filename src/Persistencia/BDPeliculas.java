package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import practicodelaboratorio.Cliente;
import practicodelaboratorio.Pelicula;

public class BDPeliculas {

    public static void delete(Integer codigo) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            smt.executeUpdate("Delete from pelicula where codigo='" + codigo + "'");
            smt.close();
        } catch (Exception e) {
            throw new DataAccessException("Error al borrar Pelicula " + e);
        }
    }

    public static Pelicula buscarPorCodigo(Integer codigo) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("Select * from pelicula where codigo='" + codigo + "'");
            Pelicula pelicula = null;
            while (res.next()) {
                pelicula = new Pelicula(res.getInt("codigo"), res.getString("genero"),
                        res.getString("titulo"), res.getString("formato"), res.getString("autor"), res.getInt("ejemplares"), res.getInt("alquilados"), res.getFloat("precio"));
            }
            res.close();
            smt.close();
            if (pelicula == null) {
                throw new NotFoundException("no se ha encontrado la Pelicula"
                        + "con el codigo " + codigo);
            }
            return pelicula;
        } catch (Exception e) {
            throw new DataAccessException("Error buscando Pelicula por Codigo" + e);
        }
    }

    public static ArrayList<Pelicula> buscarPorAutor(String autor) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("SELECT * FROM pelicula WHERE"
                    + " sp_ascii(autor) ILIKE sp_ascii('%" + autor + "%')");
            ArrayList<Pelicula> peliculas = new ArrayList();
            while (res.next()) {
                peliculas.add(new Pelicula(res.getInt("codigo"), res.getString("genero"),
                        res.getString("titulo"), res.getString("formato"),
                        res.getString("autor"), res.getInt("ejemplares"),
                        res.getInt("alquilados"), res.getFloat("precio")));
            }
            res.close();
            smt.close();
            return peliculas;
        } catch (Exception e) {
            throw new DataAccessException("Error buscando Pelicula por Autor " + e);
        }
    }

    public static ArrayList<Pelicula> buscarTitulo(String titulo)
            throws DataAccessException, NotFoundException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("SELECT * FROM pelicula WHERE"
                    + " sp_ascii(titulo) ILIKE sp_ascii('%" + titulo + "%')");
            ArrayList<Pelicula> peliculas = new ArrayList();
            while (res.next()) {
                peliculas.add(new Pelicula(res.getInt("codigo"), res.getString("genero"),
                        res.getString("titulo"), res.getString("formato"),
                        res.getString("autor"), res.getInt("ejemplares"),
                        res.getInt("alquilados"), res.getFloat("precio")));
            }
            res.close();
            smt.close();
            return peliculas;
        } catch (Exception e) {
            throw new DataAccessException("Error Buscando Peliculas por titulo " + e);
        }
    }

    public static ArrayList<Pelicula> buscarGenero(String genero)
            throws DataAccessException, NotFoundException, SQLException, ClassNotFoundException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("SELECT * FROM pelicula WHERE"
                    + " sp_ascii(genero) ILIKE sp_ascii('%" + genero + "%')");
            ArrayList<Pelicula> peliculas = new ArrayList();
            while (res.next()) {
                peliculas.add(new Pelicula(res.getInt("codigo"), res.getString("genero"),
                        res.getString("titulo"), res.getString("formato"),
                        res.getString("autor"), res.getInt("ejemplares"),
                        res.getInt("alquilados"), res.getFloat("precio")));
            }
            res.close();
            smt.close();
            return peliculas;
        } catch (Exception e) {
            throw new DataAccessException("Error Buscando peliculas por genero " + e);
        }
    }

    public static void insertar(Pelicula pelicula) throws DataAccessException {
        try {
            if (pelicula.existe()) {
                throw new DataAccessException("Pelicula existente)");
            }
            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Insert into pelicula (titulo,autor,"
                    + "genero,ejemplares,formato,precio) values (?,?,?,?,?,?)");
            smt.setString(1, pelicula.getTitulo());
            smt.setString(2, pelicula.getAutor());
            smt.setString(3, pelicula.getGenero());
            smt.setInt(4, pelicula.getEjemplares());
            smt.setString(5, pelicula.getFormato());
            smt.setFloat(6, pelicula.getPrecio());
            smt.execute();
        } catch (Exception e) {
            throw new DataAccessException("Error en Insertando Pelicula " + e);
        }
    }

    public static void actualizar(Pelicula pelicula) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Update pelicula set titulo=?,autor=?,genero=?,ejemplares=?,"
                    + "formato=?,precio=?,alquilados=? where codigo=?");
            smt.setString(1, pelicula.getTitulo());
            smt.setString(2, pelicula.getAutor());
            smt.setString(3, pelicula.getGenero());
            smt.setInt(4, pelicula.getEjemplares());
            smt.setString(5, pelicula.getFormato());
            smt.setFloat(6, pelicula.getPrecio());
            smt.setInt(7, pelicula.getAlquilados());
            smt.setInt(8, pelicula.getCodigo());
            smt.execute();
        } catch (Exception e) {
            throw new DataAccessException("Error en Actualizando Pelicula" + e);
        }
    }

    public static ArrayList<Pelicula> buscarCodigo(int cod) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("Select * from pelicula WHERE TO_CHAR(codigo, '99999999')"
                    + " LIKE '%" + cod + "%'");
            ArrayList<Pelicula> peliculas = new ArrayList();
            while (res.next()) {
                peliculas.add(new Pelicula(res.getInt("codigo"), res.getString("genero"),
                        res.getString("titulo"), res.getString("formato"),
                        res.getString("autor"), res.getInt("ejemplares"),
                        res.getInt("alquilados"), res.getFloat("precio")));
            }
            res.close();
            smt.close();
            return peliculas;
        } catch (Exception e) {
            throw new DataAccessException("Error buscando Pelicula por Codigo" + e);
        }
    }

 
}
