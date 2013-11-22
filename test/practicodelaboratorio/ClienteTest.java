/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicodelaboratorio;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClienteTest {

    private static Integer id = 1;
    private static Long dni = 31336824l;
    private static String nombre = "Juan Lorenzo";
    private static Long telefono = 154312804l;
    private static String direccion = "nueva escocia 723";
    private static Float multaPendiete = 0f;
    private static Cliente instance = new Cliente(id, dni, nombre, telefono, direccion, multaPendiete);

    public ClienteTest() {
    }

    @Test
    public void testToArray() {
        System.out.println("toArray");
        Object[] expResult = {id, dni, nombre, direccion, telefono};
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);

    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = id.toString() + "  " + nombre + "  " + dni.toString();;
        String result = instance.toString();
        assertEquals(expResult, result);

    }
}
