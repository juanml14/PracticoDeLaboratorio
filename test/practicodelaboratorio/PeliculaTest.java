
package practicodelaboratorio;

import static org.junit.Assert.*;
import org.junit.Test;

public class PeliculaTest {
    
    public PeliculaTest() {
    }
 private static Integer codigo=1;
    private static String genero="genero";
    private static String titulo="titulo";
    private static String formato="formato";
    private static String autor="autor";
    private static Integer ejemplares=2;
    private static Integer alquilados=1;
    private static Float precio=5f;
    private Pelicula instance=new Pelicula(codigo, genero, titulo, formato, autor, ejemplares, alquilados, precio);

    @Test
    public void testToArray() {
        System.out.println("toArray");
        Object[] expResult = new Object[7];
        expResult[0] = codigo;
        expResult[1] = titulo;
        expResult[2] = autor;
        expResult[3] = genero;
        expResult[4] = formato;
        expResult[5] = precio;
        expResult[6] = true;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testDisponible() {
        System.out.println("disponible");
        Boolean expResult = true;
        Boolean result = instance.disponible();
        assertEquals(expResult, result);
       
    }
   
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = codigo.toString() + "  " + titulo + "  " + formato;
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
}
