/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VindioPerez
 * @version 1.1
 */
public class OImpresion extends Operario {

    public OImpresion() {
        super();
    }

    public OImpresion(String nombre, String apellidos, String nif, String telefono, String direccion, boolean senior) {
        super(nombre, apellidos, nif, telefono, direccion, senior);
    }

    public OImpresion(String nombre, String apellidos, String nif, String telefono, String direccion, boolean senior, long id) {
        super(nombre, apellidos, nif, telefono, direccion, senior);
        this.id = id;
    }

    public OImpresion(OImpresion o) {
        super(o);
    }

    public OImpresion(Operario o) {
        super(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String data() {
        return super.data();
    }

    public static OImpresion nuevoOImpresion() {
        OImpresion OI = new OImpresion(Operario.nuevoOperario());

        return OI;
    }

    public static OImpresion getOperarioImpresionById(long id) {
        /*Este método recorrerá un ArrayList con todos los operarios buscando aquel con el id que le introduzcamos, y devolverá ese operario si es que existe o 
        nulo si es que no existe*/
        OImpresion oi = new OImpresion();
        return oi;
    }

    public Modificacion realizarModificacion() throws TrabajoException {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean correcto = false;
        System.out.println("Introduzca el id del trabajo que se va a modificar:");
        do {
            long idTrabajo = sc.nextLong();
            i++;
            if (!TrabajoException.comprobarId(idTrabajo)) {
                throw new TrabajoException("El id introducido no es correcto \n"
                        + "Vuelva a introducir un id:");

            } else {
                System.out.println("El id introducido es correcto:");
                Trabajo t = Trabajo.getTrabajoById(idTrabajo);
                correcto = true;

                if (t instanceof Libro) {
                    System.out.println("La modificación se realizará sobre un libro:");
                }
                if (t instanceof Poster) {
                    System.out.println("La modificación se realizará sobre un poster:");
                }
                if (t instanceof Rotulo) {
                    System.out.println("La modificación se realizará sobre un rótulo:");
                }

            }
        } while (!correcto && i <= 3);

        if(correcto){
        Modificacion m = new Modificacion();
        m.setId(BDatos.modificaciones.size() + 1);
        System.out.println("Introduzca la fecha de realización de la modificación:");
        Date fechaR = ToolBox.introducirFecha();
        m.setFecha(fechaR);
        System.out.println("Introduzca una descripción de la modificación:");
        String descr = sc.nextLine();
        m.setDesc(descr);
        boolean aprobado = false;
        m.setAprob(aprobado);
        m.setOperarioI(this);
        System.out.println("La modificación queda asi:" + m.toString());
        return m;
        }else{
            System.out.println("La modificación no se ha podido crear");
        }
        return null;

    }

    public Modificacion solicitarModificación(Trabajo t) {
        Modificacion m = new Modificacion();
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce los datos a modificar:");
        System.out.println("introduce la fecha de realización");
        Date fechaRea = ToolBox.introducirFecha();
        System.out.println("introduzca una descripción de la modificación");
        String descripcion = sc.nextLine();
        System.out.println("Su modificación es la siguiente" + descripcion);
        System.out.println("Es correcta su modificación?");
        boolean aceptar = ToolBox.leerBoolean();
        if (aceptar) {
            m.setFecha(fechaRea);
            m.setDesc(descripcion);
            m.setAprob(aceptar);
            System.out.println("Introduzca la fecha de hoy para aprobar el trabajo:");
            Date fechaApro = ToolBox.introducirFecha();
            m.setFechaAprob(fechaApro);
            m.setIdTrabajo(t.getId());//id del trabajo
            m.setIdCliente(this.id);//id del cliente
        }

        return m;

    }

}
