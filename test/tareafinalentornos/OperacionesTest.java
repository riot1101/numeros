/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafinalentornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.IllegalArgumentException;

/**
 *
 * @author CES
 */
public class OperacionesTest {

    public OperacionesTest() {
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
     * Test of rango method, of class Operaciones.
     * no pasa test java.lang.ArrayIndexOutOfBoundsException
     */
    @Test
    public void testRango() {
      Operaciones instance = new Operaciones();
        int a = 5;
        int b = 9;

        int[] result = instance.rango(a, b);
        int[] expResult = {5, 6, 7, 8, 9};
        assertArrayEquals(expResult, result);

    }
/**
 * da una matriz de arrays negativa, no pasa test
 * 
 */
    @Test
    public void testRango2() {
        Operaciones instance = new Operaciones();
        int a = 9;
        int b = 5;

        int[] result = instance.rango(a, b);
        int[] expResult = {5, 6, 7, 8, 9};
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of sumRango method, of class Operaciones.
     */
    @Test
    public void testSumRango() {

        int a = 1;
        int b = 2;
        Operaciones instance = new Operaciones();
        int expResult = 3;
        int result = instance.sumRango(a, b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isPar method, of class Operaciones.
     *Pasa test, es correcto
     */
    @Test
    public void testIsPar() {
        Operaciones instance = new Operaciones();

        int a = 2;
        boolean result = instance.isPar(a);
        boolean expResult = true;
        
        assertEquals(expResult, result);

    }

    /**
     * Test of extraerPositivos method, of class Operaciones.
     * debe ser NullPointerException
     * 
     */
    @Test(expected = NullPointerException.class)
    public void testExtraerPositivos(){
       Operaciones instance = new Operaciones();

        int[] nums =null;
 
         instance.extraerPositivos(nums);
        
    }
    /**
 *
 * Pasa Test
 */
   @Test 
   public void testExtraerPositivos2(){
       Operaciones instance = new Operaciones();

        int[] nums ={-1,2,3};
        int [] expResult = {2,3};
        int [] result = instance.extraerPositivos(nums);
        assertArrayEquals(expResult,result);
 
        
        
    }
   
   

}
