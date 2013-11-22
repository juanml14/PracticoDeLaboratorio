package practicodelaboratorio;

import Persistencia.BDClientes;
import Persistencia.BDPeliculas;
import Persistencia.BDRegistros;
import Persistencia.DataAccessException;
import Persistencia.NotFoundException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registro {

    Integer id;
    Integer cliente;
    Date fecha;
    ArrayList<Integer> peliculas;
    Float monto;
    Float montoMulta;
    Date fechaDeEntrega;
    Boolean multa;

    public Registro(Integer cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        peliculas = new ArrayList();
        monto = 0f;
    }

    public Registro(Integer cliente) {
        this.cliente = cliente;
        peliculas = new ArrayList();
        monto = 0f;
    }

    public Registro(Integer id,
            Integer cliente,
            Date fecha,
            Float monto,
            Float montoMulta,
            Date fechaDeEntrega,
            String peliculas) throws DataAccessException {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.fechaDeEntrega = fechaDeEntrega;
        this.monto = monto;
        this.montoMulta = montoMulta;
        this.fechaDeEntrega = fechaDeEntrega;
        this.peliculas = new ArrayList();
        this.cargarPeliculas(peliculas);
        this.multa = Calendario.comprobarMulta(fechaDeEntrega);
        if (multa) {
            this.calcularMulta();
        }
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula.getCodigo());
    }

    public void calcularMonto() {
        try {
            monto = 0f;

            for (Object obj : peliculas) {
                int codigo = (Integer) obj;
                Pelicula pelicula;
                pelicula = BDPeliculas.buscarPorCodigo(codigo);
                monto = monto + pelicula.getPrecio();
            }
        } catch (Exception ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);


        }
    }

    public void VerificarMulta() {
    }

    public String[] ArrayPeliculasString() throws DataAccessException {
        Object[] codigos = peliculas.toArray();
        String[] StringPeliculas = new String[codigos.length];
        for (int i = 0; i < codigos.length; i++) {
            Pelicula p = BDPeliculas.buscarPorCodigo((Integer) codigos[i]);
            StringPeliculas[i] = p.toString();
        }
        return StringPeliculas;
    }

    public Integer[] ArrayPeliculas() throws DataAccessException {
        Object[] codigos = peliculas.toArray();
        Integer[] intPeliculas = new Integer[codigos.length];
        for (int i = 0; i < codigos.length; i++) {
            intPeliculas[i] = ((Integer) codigos[i]);
        }
        return intPeliculas;
    }

    public void agregarCliente(Integer id) {
        cliente = id;
    }

    public Integer getCliente() {
        return cliente;
    }

    public Float getMonto() {
        return monto;
    }

    public void calcularFechaDevolucion() {
        this.fechaDeEntrega = Calendario.getFechaDevolucion(fecha);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Integer> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Integer> peliculas) {
        this.peliculas = peliculas;
    }

    public Float getMontoMulta() {
        return montoMulta;
    }

    public void setMontoMulta(Float montoMulta) {
        this.montoMulta = montoMulta;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public Boolean getMulta() {
        return multa;
    }

    public void setMulta(Boolean multa) {
        this.multa = multa;
    }

    public String PeliculasString() throws DataAccessException {

        Integer[] idPeliculas = ArrayPeliculas();
        String stringPeliculas = idPeliculas[0].toString();

        for (int i = 1; i < idPeliculas.length; i++) {
            stringPeliculas = stringPeliculas + "," + idPeliculas[i].toString();
        }
        return stringPeliculas;
    }

    private void cargarPeliculas(String stringPeliculas) {
        String id = "";
        for (int i = 0; i < stringPeliculas.length(); i++) {
            Character c = stringPeliculas.charAt(i);
            if (c == ',') {
                peliculas.add(Integer.parseInt(id));
                id = "";
            } else if (i == stringPeliculas.length() - 1) {
                id = id + c;
                peliculas.add(Integer.parseInt(id));
                id = "";
            } else {
                id = id + c;

            }
        }
    }

    public void guardar() throws DataAccessException {
        Pelicula p = null;
        for (Integer idPelicula : peliculas) {
            p = BDPeliculas.buscarPorCodigo(idPelicula);
            p.alquilada();
        }
        calcularFechaDevolucion();
        BDRegistros.insertar(this);
    }

    public void quitarPelicula(int i) {
        peliculas.remove(i);
    }

    public Object[] toArray() throws DataAccessException, NotFoundException {
        Object[] registro = new Object[4];
        registro[0] = id;
        registro[1] = BDClientes.buscarPorId(cliente).toString();
        registro[2] = fechaDeEntrega;
        registro[3] = PeliculasString();
        return registro;
    }

    private void calcularMulta() throws DataAccessException {
        Long dias = Calendario.diasDeRetraso(this.fechaDeEntrega);
        montoMulta = monto * dias;
        BDRegistros.actualizar(this);
    }

    public void multaPendiente() throws DataAccessException {
        BDClientes.multaPendiente(cliente, montoMulta);
    }

    public void devuelto() throws DataAccessException {
        BDRegistros.devuelto(this);
        for (Object obj : peliculas) {
            int codigo = (Integer) obj;
            Pelicula pelicula;
            pelicula = BDPeliculas.buscarPorCodigo(codigo);
            pelicula.devuelta();


        }

    }

    public void alquilado() throws DataAccessException {
        for (Object obj : peliculas) {
            int codigo = (Integer) obj;
            Pelicula pelicula;
            pelicula = BDPeliculas.buscarPorCodigo(codigo);
            pelicula.alquilada();
        }
    }
}
