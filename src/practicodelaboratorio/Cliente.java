package practicodelaboratorio;

import Persistencia.BDClientes;
import Persistencia.DataAccessException;
import Persistencia.NotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    private Integer id;
    private Long dni;
    private String nombre;
    private Long telefono;
    private String direccion;
    private Float multaPendiete;

    public Cliente(Integer id, Long dni, String nombre,
            Long telefono, String direccion,Float multaPendiente) {
        this.direccion = direccion;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
        this.multaPendiete=multaPendiente;
    }

    public Cliente(Long dni, String nombre,
            Long telefono, String direccion) {
        this.direccion = direccion;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.multaPendiete=0f;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Object[] toArray() {
        Object[] cliente = new Object[5];
        cliente[0] = id;
        cliente[1] = dni;
        cliente[2] = nombre;
        cliente[3] = direccion;
        cliente[4] = telefono;
        return cliente;
    }

    public Boolean existe() throws DataAccessException {
        try {
            Cliente aux = BDClientes.buscarPorDni(dni);
            return true;
        } catch (NotFoundException ex) {
            return false;
        }
    }

    @Override
    public String toString() {
        return id.toString() + "  " + nombre + "  " + dni.toString();
    }

    public Float getMultaPendiente() {
        return multaPendiete;
    }
}
