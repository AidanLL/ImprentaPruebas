/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.time.Clock;
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
 * @author DAW113
 */
public class LaborTest {
    
    public LaborTest() {
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
     * Test of nuevoLabor method, of class Labor.
     */
    @Test
    public void testNuevoLabor() {
        System.out.println("nuevoLabor");
        Labor expResult = null;
        Labor result = Labor.nuevoLabor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdMaquina method, of class Labor.
     */
    @Test
    public void testGetIdMaquina() {
        System.out.println("getIdMaquina");
        Labor instance = new Labor();
        long expResult = 0L;
        long result = instance.getIdMaquina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMaquina method, of class Labor.
     */
    @Test
    public void testSetIdMaquina() {
        System.out.println("setIdMaquina");
        long idMaquina = 0L;
        Labor instance = new Labor();
        instance.setIdMaquina(idMaquina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Labor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Labor instance = new Labor();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Labor.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Labor instance = new Labor();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaini method, of class Labor.
     */
    @Test
    public void testGetFechaini() {
        try {
        System.out.println("getFechaini");
        Labor instance = new Labor();
        Date expResult = null;
        Date result = instance.getFechaini();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } catch (LaborException e) {
    System.out.println("Paso por aqui");
    }
    }

    /**
     * Test of setFechaini method, of class Labor.
     */
    @Test
    public void testSetFechaini() {
        System.out.println("setFechaini");
        Date fechaini = null;
        Labor instance = new Labor();
        instance.setFechaini(fechaini);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechafin method, of class Labor.
     */
    @Test
    public void testGetFechafin() {
        System.out.println("getFechafin");
        Labor instance = new Labor();
        Date expResult = null;
        Date result = instance.getFechafin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechafin method, of class Labor.
     */
    @Test
    public void testSetFechafin() {
        System.out.println("setFechafin");
        Date fechafin = null;
        Labor instance = new Labor();
        instance.setFechafin(fechafin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Labor.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Labor instance = new Labor();
        char expResult = ' ';
        char result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Labor.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        char estado = ' ';
        Labor instance = new Labor();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarea method, of class Labor.
     */
    @Test
    public void testGetTarea() {
        System.out.println("getTarea");
        Labor instance = new Labor();
        String expResult = "";
        String result = instance.getTarea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarea method, of class Labor.
     */
    @Test
    public void testSetTarea() {
        System.out.println("setTarea");
        String tarea = "";
        Labor instance = new Labor();
        instance.setTarea(tarea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaquina method, of class Labor.
     */
    @Test
    public void testGetMaquina() {
        System.out.println("getMaquina");
        Labor instance = new Labor();
        Maquina expResult = null;
        Maquina result = instance.getMaquina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaquina method, of class Labor.
     */
    @Test
    public void testSetMaquina() {
        System.out.println("setMaquina");
        Maquina maquina = null;
        Labor instance = new Labor();
        instance.setMaquina(maquina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperariosM method, of class Labor.
     */
    @Test
    public void testGetOperariosM() {
        System.out.println("getOperariosM");
        Labor instance = new Labor();
        ArrayList<OMaquinas> expResult = null;
        ArrayList<OMaquinas> result = instance.getOperariosM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperariosM method, of class Labor.
     */
    @Test
    public void testSetOperariosM() {
        System.out.println("setOperariosM");
        ArrayList<OMaquinas> operariosM = null;
        Labor instance = new Labor();
        instance.setOperariosM(operariosM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of data method, of class Labor.
     */
    @Test
    public void testData() {
        System.out.println("data");
        Labor instance = new Labor();
        String expResult = "";
        String result = instance.data();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Labor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Labor instance = new Labor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLaborFromTextFile method, of class Labor.
     */
    @Test
    public void testReadLaborFromTextFile() {
        System.out.println("readLaborFromTextFile");
        String path = "";
        ArrayList<Labor> expResult = null;
        ArrayList<Labor> result = Labor.readLaborFromTextFile(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLaborFromBinaryFile method, of class Labor.
     */
    @Test
    public void testReadLaborFromBinaryFile() {
        System.out.println("readLaborFromBinaryFile");
        String path = "";
        ArrayList<Labor> expResult = null;
        ArrayList<Labor> result = Labor.readLaborFromBinaryFile(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeLaborToTextFile method, of class Labor.
     */
    @Test
    public void testWriteLaborToTextFile() {
        System.out.println("writeLaborToTextFile");
        String path = "";
        Labor instance = new Labor();
        instance.writeLaborToTextFile(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeLaborToBinaryFile method, of class Labor.
     */
    @Test
    public void testWriteLaborToBinaryFile() {
        System.out.println("writeLaborToBinaryFile");
        String path = "";
        Labor instance = new Labor();
        instance.writeLaborToBinaryFile(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLaborById method, of class Labor.
     */
    @Test
    public void testGetLaborById() {
        System.out.println("getLaborById");
        long idLabor = 0L;
        Labor expResult = null;
        Labor result = Labor.getLaborById(idLabor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
