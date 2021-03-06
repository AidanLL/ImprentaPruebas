/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DAW107
 */
public class BDatos {
    
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Departamento> departamentos = new ArrayList<>();
    public static ArrayList<Labor> labores = new ArrayList<>();
    public static ArrayList<Libro> libros = new ArrayList<>();
    public static ArrayList<Lote> lotes = new ArrayList<>();
    public static ArrayList<Maquina> maquinas = new ArrayList<>();
    public static ArrayList<Modificacion> modificaciones = new ArrayList<>();
    public static ArrayList<OCalidad> osCalidad = new ArrayList<>();
    public static ArrayList<OImpresion> osImpresion = new ArrayList<>();
    public static ArrayList<OMaquinas> osMaquinas = new ArrayList<>();
    public static ArrayList<Operario> operarios = new ArrayList<>();
    public static ArrayList<Politica> politicas = new ArrayList<>();
    public static ArrayList<Poster> posters = new ArrayList<>();
    public static ArrayList<Prueba> pruebas = new ArrayList<>();
    public static ArrayList<ReglaCalidad> reglas = new ArrayList<>();
    public static ArrayList<Rotulo> rotulos = new ArrayList<>();
    public static ArrayList<Trabajo> trabajos = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void inicializar(){
        Cliente c1 = new Cliente("Pedro Ruiz", "634789231", 1);
        Cliente c2 = new Cliente("Luis Lopez", "632987216", 2);
        Cliente c3 = new Cliente("Rosa Sampedro", "694228234", 3);
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        Departamento d1 = new Departamento('A', 1);
        Departamento d2 = new Departamento('B', 2);
        Departamento d3 = new Departamento('C', 3);
        OCalidad oc1 = new OCalidad(1,"Luisa", "Martinez Perez", "20304050T", "634235904", "aqui", true);
        OCalidad oc2 = new OCalidad(2,"Pedro", "Lopez Aguado", "23223981Q", "654352254", "alli", false);
        OCalidad oc3 = new OCalidad(3,"Javier", "Martinez Perez", "70754635M", "694785124", "aca", false);
        OImpresion oi1 = new OImpresion("Luis", "Garcia Martin", "44378261T", "69853147", "aculla", true, 4);
        OImpresion oi2 = new OImpresion("Ana", "Garcia Mellado", "48976645R", "698778542", "calle melancolia", true, 5);
        OImpresion oi3 = new OImpresion("Maria", "Perez Gonzalez", "41414141Y", "788542316", "io k se xD", true, 6);
        OMaquinas om1 = new OMaquinas("David", "Cavada Bustamante", "12345678A", "666666666", "mi casa", true, 7);
        OMaquinas om2 = new OMaquinas("Myriam", "Lopez Marin", "87654321Z", "600600600", "elm street", true, 8);
        OMaquinas om3 = new OMaquinas("Simon", "Vazquez Herrera", "45776321B", "637785129", "callejon diagon", true, 9);
        osCalidad.add(oc1);
        osCalidad.add(oc2);
        osCalidad.add(oc3);
        osImpresion.add(oi1);
        osImpresion.add(oi2);
        osImpresion.add(oi3);
        osMaquinas.add(om1);
        osMaquinas.add(om2);
        osMaquinas.add(om3);
        operarios.add(oc1);
        operarios.add(oc2);
        operarios.add(oc3);
        operarios.add(oi1);
        operarios.add(oi2);
        operarios.add(oi3);
        operarios.add(om1);
        operarios.add(om2);
        operarios.add(om3);
        ArrayList<Operario> osDepA = new ArrayList<>();
        osDepA.add(oc1);
        osDepA.add(om1);
        osDepA.add(oi1);
        d1.setOperarios(osDepA);
        ArrayList<Operario> osDepB = new ArrayList<>();
        osDepB.add(oc2);
        osDepB.add(om2);
        osDepB.add(oi2);
        d2.setOperarios(osDepB);
        ArrayList<Operario> osDepC = new ArrayList<>();
        osDepC.add(oc3);
        osDepC.add(om3);
        osDepC.add(oi3);
        d3.setOperarios(osDepC);        
        departamentos.add(d1);
        departamentos.add(d2);
        departamentos.add(d3);
       
        Maquina m1 = null;
        Maquina m2 = null;
        Maquina m3 = null;
        Maquina m4 = null;
        Maquina m5 = null;
        Maquina m6 = null;
        try {
            m1 = new Maquina(1, sdf.parse("23/03/2016"), "departamento A", "din A0", "color", 3.0f, 6.0f);
            m2 = new Maquina(2, sdf.parse("20/10/2017"), "departamento B", "din A0", "color", 4.0f, 6.0f);
            m3 = new Maquina(3, sdf.parse("13/08/2018"), "departamento C", "din A1", "laser", 2.0f, 6.0f);
            m4 = new Maquina(4, sdf.parse("23/09/2018"), "departamento A", "din A0", "color", 3.0f, 6.0f);
            m5 = new Maquina(5, sdf.parse("20/08/2019"), "departamento B", "din A0", "color", 4.0f, 6.0f);
            m6 = new Maquina(6, sdf.parse("13/09/2019"), "departamento C", "din A1", "laser", 2.0f, 6.0f);
        } catch (ParseException parseException) {
            System.out.println("La fecha es incorrecta...");
        }
        
        
        ArrayList<Maquina> ms1 = new ArrayList<>();
        ArrayList<Maquina> ms2 = new ArrayList<>();
        ms1.add(m1);
        ms1.add(m2);
        ms1.add(m3);
        ms2.add(m4);
        ms2.add(m5);
        ms2.add(m6);
        Lote l1 = new Lote("1", ms1);
        Lote l2 = new Lote("2", ms2);
        maquinas.add(m1);
        maquinas.add(m2);
        maquinas.add(m3);
        maquinas.add(m4);
        maquinas.add(m5);
        maquinas.add(m6);
        lotes.add(l1);
        lotes.add(l2);        
    }
    
}
