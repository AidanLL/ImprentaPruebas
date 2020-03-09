/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.ArrayList;
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
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

        public void testGetNombre1() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Cadena demasiado larga");

    }
    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Cliente instance = new Cliente();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.data();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearTrabajo method, of class Cliente.
     */
    @Test
    public void testCrearTrabajo() throws Exception {
        System.out.println("crearTrabajo");
        Cliente instance = new Cliente();
        Trabajo expResult = null;
        Trabajo result = instance.crearTrabajo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
