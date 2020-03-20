/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW105
 */
public class ClienteTest {

    public ClienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        try {
            System.out.println("getNombre");
            Cliente instance = new Cliente();
            instance.setNombre("");
            String expResult = "";
            String result = instance.getNombre();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("cadena vacia");
        } catch (ClienteException ex) {
            System.out.println("Paso por aquí");

        }
    }

    public void testGetNombre1() {
        try {
            System.out.println("getNombre");
            Cliente instance = new Cliente();
            instance.setNombre("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            String expResult = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            String result = instance.getNombre();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("Cadena demasiado larga");
        } catch (ClienteException ex) {
            System.out.println("Paso por aquí");

        }
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre2() {
        try {
            System.out.println("getNombre");
            Cliente instance = new Cliente();
            instance.setNombre(null);
            String expResult = null;
            String result = instance.getNombre();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("El nombre no puede ser nulo");
        } catch (ClienteException ex) {
            System.out.println("Paso por aquí");

        }
    }
  /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre3() {
        try {
            System.out.println("getNombre");
            Cliente instance = new Cliente();
            instance.setNombre("Aidan");
            String expResult = "Aidan";
            String result = instance.getNombre();
            assertNotEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("El nombre deberia valer");
        } catch (ClienteException ex) {
            System.out.println("Paso por aquí");

        }
    }
    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        try {
            System.out.println("setNombre");
            String nombre = "*";
            Cliente instance = new Cliente();
            instance.setNombre("*");

            assertEquals(nombre, instance.getNombre());
            fail("EL nombre no puede tener un caracter especial");
        } // TODO review the generated test code and remove the default call to fail.
        catch (ClienteException ex) {
            System.out.println("Paso por aquí");

        }
    }

    @Test
    public void testSetNombre1() {
        try {
            System.out.println("setNombre");
            String nombre = "1";
            Cliente instance = new Cliente();
            instance.setNombre("1");

            assertEquals(nombre, instance.getNombre());
            fail("EL nombre no puede tener un numero");
        } // TODO review the generated test code and remove the default call to fail.
        catch (ClienteException ex) {
            System.out.println("Paso por aquí");

        }
    }

    @Test
    public void testSetNombre2() {
        try {
            System.out.println("setNombre");
            String nombre = "?";
            Cliente instance = new Cliente();
            instance.setNombre("?");

            assertEquals(nombre, instance.getNombre());
            fail("EL nombre no puede tener un signo de interrogacion");
        } // TODO review the generated test code and remove the default call to fail.
        catch (ClienteException ex) {
            System.out.println("Paso por aquí");

        }
    }

    @Test
    public void testSetNombre3() {
        try {
            System.out.println("setNombre");
            String nombre = "Aidan";
            Cliente instance = new Cliente();
            instance.setNombre("Aidan");

            assertNotEquals(nombre, instance.getNombre());
            fail("EL nombre deberia valer");
        } // TODO review the generated test code and remove the default call to fail.
        catch (ClienteException ex) {
            System.out.println("Paso por aquí");

        }
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        instance.setTelefono(null);
        String expResult = null;
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("null");
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono1() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        instance.setTelefono("");
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("cadena vacia");
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono2() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        instance.setTelefono("9999999999");
        String expResult = "9999999999";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("demasiado largo");
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono3() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        instance.setTelefono("99999999");
        String expResult = "99999999";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("demasiado corto");
    }
    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono4() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        instance.setTelefono("999999999");
        String expResult = "999999999";
        String result = instance.getTelefono();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Deberia valer");
    }

    /**
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String nombre = "*";
        Cliente instance = new Cliente();
        instance.setTelefono("*");

        assertEquals(nombre, instance.getTelefono());
        fail("EL Telefono no puede tener un caracter especial");
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono1() {
        System.out.println("setTelefono");
        String nombre = "a";
        Cliente instance = new Cliente();
        instance.setTelefono("a");

        assertEquals(nombre, instance.getTelefono());
        fail("EL Telefono no puede tener un letras");
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono2() {
        System.out.println("setTelefono");
        String nombre = "?";
        Cliente instance = new Cliente();
        instance.setTelefono("?");

        assertEquals(nombre, instance.getTelefono());
        fail("EL Telefono no puede signos de exclamcion");
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono3() {
        System.out.println("setTelefono");
        String nombre = "999999999";
        Cliente instance = new Cliente();
        instance.setTelefono("999999999");

        assertNotEquals(nombre, instance.getTelefono());
        fail("EL Telefono deberia valer");
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getId method, of class Cliente.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Cliente instance = new Cliente();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Cliente.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Cliente instance = new Cliente();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of data method, of class Cliente.
     */
    @Test
    public void testData() {
        System.out.println("data");
        Cliente instance = new Cliente(null, "999999999", 0L);

        String expResult = "0L  |  null  |  999999999";
        String result = instance.data();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("El nombre no puede ser nulo");
    }

    @Test
    public void testData1() {
        System.out.println("data");
        Cliente instance = new Cliente("Aidan", "9999999999", 0L);

        String expResult = "0L  |  Aidan  |  9999999999";
        String result = instance.data();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("El numero es muy largo");
    }

    @Test
    public void testData2() {
        System.out.println("data");
        Cliente instance = new Cliente("Aidan", "999999999", 0L);

        String expResult = "0L  |  Aidan  |  999999999";
        String result = instance.data();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Los datos deberian valer");
    }

    /**
     * Test of getClienteById method, of class Cliente.
     */
    @Test
    public void testGetClienteById() {
        System.out.println("getClienteById");
        long idCliente = 0L;
        Cliente expResult = null;
        Cliente result = Cliente.getClienteById(idCliente);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("El cliente no deberia existir");
    }

    /**
     * Test of getAllCliente method, of class Cliente.
     */
    @Test
    public void testGetAllCliente() {
        System.out.println("getAllCliente");
        Cliente instance = new Cliente();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getAllCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readClientefromTextFile method, of class Cliente.
     */
    @Test
    public void testReadClientefromTextFile() {
        System.out.println("readClientefromTextFile");
        String path = "";
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = Cliente.readClientefromTextFile(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("La ruta no puede estar vacia");
    }

    /**
     * Test of readClientefromTextFile method, of class Cliente.
     */
    @Test
    public void testReadClientefromTextFile1() {
        System.out.println("readClientefromTextFile");
        String path = null;
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = Cliente.readClientefromTextFile(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("La ruta no puede ser nulo");
    }

    /**
     * Test of readClientefromBinaryFile method, of class Cliente.
     */
    @Test
    public void testReadClientefromBinaryFile() {
        System.out.println("readClientefromBinaryFile");
        String path = "";
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = Cliente.readClientefromBinaryFile(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("La ruta no puede ser vacia");
    }

    /**
     * Test of readClientefromBinaryFile method, of class Cliente.
     */
    @Test
    public void testReadClientefromBinaryFile1() {
        System.out.println("readClientefromBinaryFile");
        String path = null;
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = Cliente.readClientefromBinaryFile(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("La ruta no puede ser null");
    }

    /**
     * Test of writeClienteToTextFile method, of class Cliente.
     */
    @Test
    public void testWriteClienteToTextFile() {
        System.out.println("writeClienteToTextFile");
        String path = "";
        Cliente instance = new Cliente();
        instance.writeClienteToTextFile(path);
        String expResult = "";
        assertEquals(expResult, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("La ruta no puede ser vacio");
    }

    /**
     * Test of writeClienteToTextFile method, of class Cliente.
     */
    @Test
    public void testWriteClienteToTextFile1() {
        System.out.println("writeClienteToTextFile");
        String path = null;
        Cliente instance = new Cliente();
        instance.writeClienteToTextFile(path);
        String expResult = null;
        assertEquals(expResult, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("La ruta no puede ser null");
    }

    /**
     * Test of writeClienteToBinaryFile method, of class Cliente.
     */
    @Test
    public void testWriteClienteToBinaryFile() {
        System.out.println("writeClienteToBinaryFile");
        String path = "";
        Cliente instance = new Cliente();
        instance.writeClienteToBinaryFile(path);
        String expResult = "";
        assertEquals(expResult, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("La ruta no puede ser vacio");
    }

    /**
     * Test of writeClienteToBinaryFile method, of class Cliente.
     */
    @Test
    public void testWriteClienteToBinaryFile1() {
        System.out.println("writeClienteToBinaryFile");
        String path = null;
        Cliente instance = new Cliente();
        instance.writeClienteToBinaryFile(path);
        String expResult = null;
        assertEquals(expResult, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("La ruta no puede ser null");
    }

    /**
     * Test of nuevoCliente method, of class Cliente.
     */
    @Test
    public void testNuevoCliente() {
        System.out.println("nuevoCliente");
        Cliente expResult = null;
        Cliente result = Cliente.nuevoCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("no puede ser null");
    }

    /**
     * Test of crearTrabajo method, of class Cliente.
     */
    @Test
    public void testCrearTrabajo() {
        System.out.println("crearTrabajo");
        try {
            Cliente instance = new Cliente();
            Trabajo expResult = null;
            Trabajo result = instance.crearTrabajo();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("No puede ser null");
        } catch (TrabajoException ex) {
            System.out.println("paso por aqui");
        }
    }

    /**
     * Test of crearTrabajo method, of class Cliente.
     */
    @Test
    public void testCrearTrabajo1() {
        try {
            System.out.println("crearTrabajo");

            Cliente instance = new Cliente();
            Trabajo expResult = new Trabajo(null, null, "");//no se el formato del date por defecto
            Trabajo result = instance.crearTrabajo();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("No puede ser vacio");
        } catch (TrabajoException ex) {
            System.out.println("paso por aqui");
        }
    }

    /**
     * Test of registrarCliente method, of class Cliente.
     */
    @Test
    public void testRegistrarCliente() {
        System.out.println("registrarCliente");
        Cliente expResult = null;
        Cliente result = Cliente.registrarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No puede ser null");
    }

    /**
     * Test of aceptarModificacion method, of class Cliente.
     */
    @Test
    public void testAceptarModificacion() {
        System.out.println("aceptarModificacion");
        Modificacion m = null;
        Cliente instance = new Cliente();
        boolean expResult = false;
        boolean result = instance.aceptarModificacion(m);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Deberia ser falso");
    }
   /**
     * Test of aceptarModificacion method, of class Cliente.
     */
    @Test
    public void testAceptarModificacion1() {
        System.out.println("aceptarModificacion");
        Modificacion m = null;
        Cliente instance = new Cliente();
        boolean expResult = true;
        boolean result = instance.aceptarModificacion(m);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Deberia ser verdadero");
    }

}
