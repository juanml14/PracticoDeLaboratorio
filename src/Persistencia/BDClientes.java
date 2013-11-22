package Persistencia;

import java.sql.*;
import java.util.ArrayList;
import practicodelaboratorio.Cliente;

public class BDClientes {

    public static void delete(Integer id) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            smt.executeUpdate("Delete from cliente where id='" + id + "'");
            smt.close();
        } catch (Exception e) {
            throw new DataAccessException("Error al borrar Cliente " + e);
        }
    }

    public static Cliente buscarPorId(Integer idCliente) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("Select * from cliente where id='" + idCliente + "'");
            Cliente cliente = null;
            while (res.next()) {
                cliente = new Cliente(res.getInt("id"), res.getLong("dni"),
                        res.getString("nombre"), res.getLong("telefono"),
                        res.getString("direccion"),res.getFloat("multapendiente"));
            }
            res.close();
            smt.close();
            if (cliente == null) {
                throw new NotFoundException("no se ha encontrado el cliente"
                        + "con el id " + idCliente);
            }
            return cliente;
        } catch (Exception e) {
            throw new DataAccessException("Error buscando cliente por id" + e);
        }
    }

    public static Cliente buscarPorDni(Long dniCliente) throws DataAccessException, NotFoundException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("Select * from cliente where dni='"
                    + dniCliente + "'");
            Cliente cliente = null;
            while (res.next()) {
                cliente = new Cliente(res.getInt("id"), res.getLong("dni"),
                        res.getString("nombre"), res.getLong("telefono"),
                        res.getString("direccion"),res.getFloat("multapendiente"));
            }
            res.close();
            smt.close();
            if (cliente == null) {
                throw new NotFoundException("no se ha encontrado el cliente"
                        + "con el DNI " + dniCliente);
            }
            return cliente;
        } catch (SQLException e) {
            throw new DataAccessException("Error buscando cliente por dni) " + e);
        } catch (ClassNotFoundException e) {
            throw new DataAccessException("Error buscando cliente por dni) " + e);
        }
    }

    public static ArrayList<Cliente> buscarNombre(String nombre)
            throws DataAccessException, NotFoundException, SQLException, ClassNotFoundException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("SELECT * FROM cliente WHERE"
                    + " sp_ascii(nombre) ILIKE sp_ascii('%" + nombre + "%')");

            ArrayList<Cliente> clientes = new ArrayList();


            while (res.next()) {

                clientes.add(new Cliente(res.getInt("id"), res.getLong("dni"),
                        res.getString("nombre"), res.getLong("telefono"),
                        res.getString("direccion"),res.getFloat("multapendiente")));
            }
            res.close();
            smt.close();

            return clientes;
        } catch (Exception e) {
            throw new DataAccessException("Error buscando cliente por nombre " + e);
        }
    }

    public static ArrayList<Cliente> buscarDni(Long dni)
            throws DataAccessException, NotFoundException, SQLException, ClassNotFoundException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("Select * from cliente WHERE TO_CHAR(dni, '99999999')"
                    + " LIKE '%" + dni + "%'");
            ArrayList<Cliente> clientes = new ArrayList();
            while (res.next()) {
                clientes.add(new Cliente(res.getInt("id"), res.getLong("dni"),
                        res.getString("nombre"), res.getLong("telefono"),
                        res.getString("direccion"),res.getFloat("multapendiente")));
            }
            res.close();
            smt.close();
            return clientes;
        } catch (Exception e) {
            throw new DataAccessException("Error buscando cliente por dni " + e);
        }
    }

    public static ArrayList<Cliente> buscarId(Integer id)
            throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery("Select * from cliente WHERE TO_CHAR(id, '99999999')"
                    + " LIKE '%" + id + "%'");
            ArrayList<Cliente> clientes = new ArrayList();
            while (res.next()) {
                clientes.add(new Cliente(res.getInt("id"), res.getLong("dni"),
                        res.getString("nombre"), res.getLong("telefono"),
                        res.getString("direccion"),res.getFloat("multapendiente")));
            
            }
            res.close();
            smt.close();
            return clientes;
        } catch (Exception e) {
            throw new DataAccessException("Error buscando cliente por dni " + e);
        }
    }

    public static void insertar(Cliente cliente) throws DataAccessException {
        try {
            if (cliente.existe()) {
                throw new DataAccessException("Cliente existente)");
            }
            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Insert into cliente (nombre,dni,telefono,direccion) values (?,?,?,?)");
            smt.setString(1, cliente.getNombre());
            smt.setLong(2, cliente.getDni());
            smt.setLong(3, cliente.getTelefono());
            smt.setString(4, cliente.getDireccion());
            smt.execute();
        }  catch (SQLException e) {
            throw new DataAccessException("Error Insertando cliente  ) " + e);
        } catch (ClassNotFoundException e) {
            throw new DataAccessException("Error Insertando cliente  ) " + e);
        }
    }

    public static void actualizar(Cliente cliente) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Update cliente set nombre=?,dni=?,telefono=?,direccion=? where id=?");
            smt.setString(1, cliente.getNombre());
            smt.setLong(2, cliente.getDni());
            smt.setLong(3, cliente.getTelefono());
            smt.setString(4, cliente.getDireccion());
            smt.setInt(5, cliente.getId());
            smt.execute();
        } catch (Exception e) {
            throw new DataAccessException("Error en Actualizando Cliente " + e);
        }


    }

    public static void multaPendiente(Integer cliente, Float montoMulta) throws DataAccessException {
        try {
            Connection con = BaseDeDatos.getInstance();
            PreparedStatement smt = con.prepareStatement("Update cliente set multapendiente=? where id=?");
            smt.setInt(1, cliente);
            smt.setFloat(2, montoMulta);
            smt.execute();
        } catch (Exception e) {
            throw new DataAccessException("Error en Actualizando Cliente " + e);
        }
    }
}