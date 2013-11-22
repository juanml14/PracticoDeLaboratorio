package practicodelaboratorio;

import Persistencia.BDPeliculas;
import Persistencia.DataAccessException;
import java.util.ArrayList;

public class Pelicula {

    private Integer codigo;
    private String genero;
    private String titulo;
    private String formato;
    private String autor;
    private Integer ejemplares;
    private Integer alquilados;
    private Float precio;

    Pelicula() {
    }

    public Pelicula(Integer codigo, String genero, String titulo,
            String formato, String autor, Integer ejemplares, Integer alquilados, Float precio) {
        this.autor = autor;
        this.codigo = codigo;
        this.ejemplares = ejemplares;
        this.alquilados = alquilados;
        this.genero = genero;
        this.titulo = titulo;
        this.precio = precio;
        this.formato = formato;
    }

    public Pelicula(String genero, String titulo,
            String formato, String autor, Integer ejemplares, Float precio) {
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.genero = genero;
        this.titulo = titulo;
        this.precio = precio;
        this.formato = formato;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void agrefgarEjemplares(Integer cantidad) {
        ejemplares = ejemplares + cantidad;
    }

    public boolean existe() throws DataAccessException {
        ArrayList peliculasDeAutor = BDPeliculas.buscarPorAutor(autor);
        for (Object obj : peliculasDeAutor) {
            Pelicula p = (Pelicula) obj;
            if (p.getTitulo().equals(titulo) && p.getFormato().equals(formato)) {
                return true;
            }
        }
        return false;
    }

    public int getAlquilados() {
        return alquilados;
    }

    public void alquilada() throws DataAccessException {
        alquilados++;
        BDPeliculas.actualizar(this);
    }

    public void devuelta() throws DataAccessException {
        alquilados--;
        System.out.println(alquilados);
        BDPeliculas.actualizar(this);
    }

    public void añadirEjemplares(int i) throws DataAccessException {
        ejemplares = ejemplares + i;
        BDPeliculas.actualizar(this);
    }

    public void retirarEjemplares(int i) throws DataAccessException {
        ejemplares = ejemplares - i;
        BDPeliculas.actualizar(this);
    }

    public Object[] toArray() {
        Object[] pelicula = new Object[7];
        pelicula[0] = codigo;
        pelicula[1] = titulo;
        pelicula[2] = autor;
        pelicula[3] = genero;
        pelicula[4] = formato;
        pelicula[5] = precio;
        pelicula[6] = disponible();
        return pelicula;
    }

    public Boolean disponible() {
        if (ejemplares > alquilados) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return codigo.toString() + "  " + titulo + "  " + formato;
    }
}
