package proyecto01;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Proyecto01Test {
    
    @Test
    public void testOrdenarArreglo_seleccion() {
        System.out.println("ordenarArreglo_seleccion");
        double[] a = new double[3];
        double[] expResult = new double[3];
        double[] result = Proyecto01.ordenarArreglo_seleccion(a);
        Assert.assertArrayEquals(expResult, result,0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testOrdenarArreglo_seleccionNegativo() {
        System.out.println("ordenarArreglo_seleccion");
        double[] a = new double[3];
        double[] expResult = new double[2];
        double[] result = Proyecto01.ordenarArreglo_seleccion(a);
        Assert.assertArrayEquals(expResult, result,0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testOrdenar_seleccion() {
        System.out.println("ordenar_seleccion");
        int[] a =new int[3];
        int[] expResult =new int[3];
        int[] result = Proyecto01.ordenar_seleccion(a);
        Assert.assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testOrdenar_seleccionNegativo() {
        System.out.println("ordenar_seleccion");
        int[] a =new int[3];
        int[] expResult =new int[2];
        int[] result = Proyecto01.ordenar_seleccion(a);
        Assert.assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCreateAcces() {
        System.out.println("createAcces");
        String nombre = "";
        float precio = 0.0F;
        int cantidad = 0;
        String tipo = "";
        String tipoAccesorio = "";
        Object expResult = null;
        Object result = Proyecto01.createAcces(nombre, precio, cantidad, tipo, tipoAccesorio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
    @Test
    public void testreadPerroNegativo(){
        System.out.println("readPerro");
        int id=4;
        Object expResult=1;
        Object result=Proyecto01.readPerro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateVol() {
        System.out.println("updateVol");
        int id = 0;
        String nombres = "";
        String apellidos = "";
        int edad = 0;
        String nTelefono = "";
        Object expResult = null;
        Object result = Proyecto01.updateVol(id, nombres, apellidos, edad, nTelefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
