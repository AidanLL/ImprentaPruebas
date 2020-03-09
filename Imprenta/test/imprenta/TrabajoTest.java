/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW110
 */
public class TrabajoTest {
    
    public TrabajoTest() {
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
     * Test of getRelieve method, of class Trabajo.
     */
    @Test
    public void testGetRelieve() {
        try {
            System.out.println("getRelieve");
            Trabajo instance = new Trabajo();
            instance.setRelieve("");
            String expResult = "";
            String result = instance.getRelieve();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("Esta vacío.No vale");
        } catch (TrabajoException ex) {
           System.out.println("Paso por aquí");
        }
    }
    @Test
    public void testGetRelieve1() {
        try {
            System.out.println("getRelieve");
            Trabajo instance = new Trabajo();
            instance.setRelieve("#");
            String expResult = "#";
            String result = instance.getRelieve();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("El relieve no puede tener caracteres especiales(#).");
        } catch (TrabajoException ex) {
           System.out.println("Paso por aquí");
        }
    }
    public void testGetRelieve2() {
        try {
            System.out.println("getRelieve");
            Trabajo instance = new Trabajo();
            instance.setRelieve("$");
            String expResult = "$";
            String result = instance.getRelieve();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("El relieve no puede tener caracteres especiales($).");
        } catch (TrabajoException ex) {
           System.out.println("Paso por aquí");
        }
    }
        public void testGetRelieve3() {
        try {
            System.out.println("getRelieve");
            Trabajo instance = new Trabajo();
            instance.setRelieve("@");
            String expResult = "@";
            String result = instance.getRelieve();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("El relieve no puede tener caracteres especiales(@).");
        } catch (TrabajoException ex) {
           System.out.println("Paso por aquí");
        }
    }
    
    
    /**
     * Test of setRelieve method, of class Trabajo.
     */
    @Test
    public void testSetRelieve() throws Exception {
        System.out.println("setRelieve");
        String relieve = "";
        Trabajo instance = new Trabajo();
        instance.setRelieve(relieve);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaSolicitud method, of class Trabajo.
     */
    @Test
    public void testGetFechaSolicitud() {
        System.out.println("getFechaSolicitud");
        Trabajo instance = new Trabajo();
        Date.from(null);
        Date expResult = null;
        Date result = instance.getFechaSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No hay fecha");
    }

    /**
     * Test of setFechaSolicitud method, of class Trabajo.
     */
    @Test
    public void testSetFechaSolicitud() {
        System.out.println("setFechaSolicitud");
        Date fechaSolicitud = null;
        Trabajo instance = new Trabajo();
        instance.setFechaSolicitud(fechaSolicitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRecogida method, of class Trabajo.
     */
    @Test
    public void testGetFechaRecogida() {
        System.out.println("getFechaRecogida");
        Trabajo instance = new Trabajo();
        Date.from(null);
        Date expResult = null;
        Date result = instance.getFechaRecogida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No hay fecha.");
    }

    /**
     * Test of setFechaRecogida method, of class Trabajo.
     */
    @Test
    public void testSetFechaRecogida() {
        System.out.println("setFechaRecogida");
        Date fechaRecogida = null;
        Trabajo instance = new Trabajo();
        instance.setFechaRecogida(fechaRecogida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Trabajo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Trabajo instance = new Trabajo();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Trabajo.
     */
    @Test
    public void testSetId() throws Exception {
        System.out.println("setId");
        long id = 0L;
        Trabajo instance = new Trabajo();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdOperario method, of class Trabajo.
     */
    @Test
    public void testGetIdOperario() {
        System.out.println("getIdOperario");
        Trabajo instance = new Trabajo();
        long expResult = 0L;
        long result = instance.getIdOperario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdOperario method, of class Trabajo.
     */
    @Test
    public void testSetIdOperario() throws Exception {
        System.out.println("setIdOperario");
        long idOperario = 0L;
        Trabajo instance = new Trabajo();
        instance.setIdOperario(idOperario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCliente method, of class Trabajo.
     */
    @Test
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        Trabajo instance = new Trabajo();
        long expResult = 0L;
        long result = instance.getIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCliente method, of class Trabajo.
     */
    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        long idCliente = 0L;
        Trabajo instance = new Trabajo();
        instance.setIdCliente(idCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdMaquina method, of class Trabajo.
     */
    @Test
    public void testGetIdMaquina() {
        System.out.println("getIdMaquina");
        Trabajo instance = new Trabajo();
        long expResult = 0L;
        long result = instance.getIdMaquina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMaquina method, of class Trabajo.
     */
    @Test
    public void testSetIdMaquina() throws Exception {
        System.out.println("setIdMaquina");
        long idMaquina = 0L;
        Trabajo instance = new Trabajo();
        instance.setIdMaquina(idMaquina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Trabajo.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Trabajo instance = new Trabajo();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Trabajo.
     */
    @Test
    public void testSetCliente() throws Exception {
        System.out.println("setCliente");
        Cliente cliente = null;
        Trabajo instance = new Trabajo();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Trabajo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trabajo instance = new Trabajo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of data method, of class Trabajo.
     */
    @Test
    public void testData() {
        System.out.println("data");
        Trabajo instance = new Trabajo();
        String expResult = "";
        String result = instance.data();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrabajoById method, of class Trabajo.
     */
    @Test
    public void testGetTrabajoById() {
        System.out.println("getTrabajoById");
        long idTrabajo = 0L;
        Trabajo expResult = null;
        Trabajo result = Trabajo.getTrabajoById(idTrabajo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTrabajo method, of class Trabajo.
     */
    @Test
    public void testGetAllTrabajo() {
        System.out.println("getAllTrabajo");
        Trabajo instance = new Trabajo();
        ArrayList<Trabajo> expResult = null;
        ArrayList<Trabajo> result = instance.getAllTrabajo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readTrabajoFromTextFile method, of class Trabajo.
     */
    @Test
    public void testReadTrabajoFromTextFile() {
        System.out.println("readTrabajoFromTextFile");
        String path = "";
        ArrayList<Trabajo> expResult = null;
        ArrayList<Trabajo> result = Trabajo.readTrabajoFromTextFile(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readTrabajoFromBinaryFile method, of class Trabajo.
     */
    @Test
    public void testReadTrabajoFromBinaryFile() {
        System.out.println("readTrabajoFromBinaryFile");
        String path = "";
        ArrayList<Trabajo> expResult = null;
        ArrayList<Trabajo> result = Trabajo.readTrabajoFromBinaryFile(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeTrabajoToTextFile method, of class Trabajo.
     */
    @Test
    public void testWriteTrabajoToTextFile() {
        System.out.println("writeTrabajoToTextFile");
        String path = "";
        Trabajo instance = new Trabajo();
        instance.writeTrabajoToTextFile(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeTrabajoToBinaryFile method, of class Trabajo.
     */
    @Test
    public void testWriteTrabajoToBinaryFile() {
        System.out.println("writeTrabajoToBinaryFile");
        String path = "";
        Trabajo instance = new Trabajo();
        instance.writeTrabajoToBinaryFile(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoTrabajo method, of class Trabajo.
     */
    @Test
    public void testNuevoTrabajo() throws Exception {
        System.out.println("nuevoTrabajo");
        Trabajo expResult = null;
        Trabajo result = Trabajo.nuevoTrabajo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encargo method, of class Trabajo.
     */
    @Test
    public void testEncargo() throws Exception {
        System.out.println("encargo");
        Cliente c = null;
        Trabajo expResult = null;
        Trabajo result = Trabajo.encargo(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solicitarTrabajo method, of class Trabajo.
     */
    @Test
    public void testSolicitarTrabajo() throws Exception {
        System.out.println("solicitarTrabajo");
        Cliente c = null;
        Operario o = null;
        Trabajo expResult = null;
        Trabajo result = Trabajo.solicitarTrabajo(c, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarTrabajo method, of class Trabajo.
     */
    @Test
    public void testModificarTrabajo() throws Exception {
        System.out.println("modificarTrabajo");
        Modificacion m = null;
        Trabajo.modificarTrabajo(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
