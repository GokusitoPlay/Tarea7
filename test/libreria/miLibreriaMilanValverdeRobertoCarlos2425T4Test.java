/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package libreria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RCMV
 */
public class miLibreriaMilanValverdeRobertoCarlos2425T4Test {
    
    public miLibreriaMilanValverdeRobertoCarlos2425T4Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of obtenerNombre method, of class miLibreriaMilanValverdeRobertoCarlos2425T4.
     */
    @Test
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        miLibreriaMilanValverdeRobertoCarlos2425T4 instance = new miLibreriaMilanValverdeRobertoCarlos2425T4();
        String expResult = "";
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPrecio method, of class miLibreriaMilanValverdeRobertoCarlos2425T4.
     */
    @Test
    public void testObtenerPrecio() {
        System.out.println("obtenerPrecio");
        miLibreriaMilanValverdeRobertoCarlos2425T4 instance = new miLibreriaMilanValverdeRobertoCarlos2425T4();
        double expResult = 0.0;
        double result = instance.obtenerPrecio();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerStock method, of class miLibreriaMilanValverdeRobertoCarlos2425T4.
     */
    @Test
    public void testObtenerStock() {
        System.out.println("obtenerStock");
        miLibreriaMilanValverdeRobertoCarlos2425T4 instance = new miLibreriaMilanValverdeRobertoCarlos2425T4();
        int expResult = 0;
        int result = instance.obtenerStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerSaldo method, of class miLibreriaMilanValverdeRobertoCarlos2425T4.
     */
    @Test
    public void testObtenerSaldo() {
        System.out.println("obtenerSaldo");
        miLibreriaMilanValverdeRobertoCarlos2425T4 instance = new miLibreriaMilanValverdeRobertoCarlos2425T4();
        double expResult = 0.0;
        double result = instance.obtenerSaldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aumentarSaldo method, of class miLibreriaMilanValverdeRobertoCarlos2425T4.
     */
    @Test
    public void testAumentarSaldo() throws Exception {
        System.out.println("aumentarSaldo");
        double saldomas = 0.0;
        miLibreriaMilanValverdeRobertoCarlos2425T4 instance = new miLibreriaMilanValverdeRobertoCarlos2425T4();
        instance.aumentarSaldo(saldomas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprarLibro method, of class miLibreriaMilanValverdeRobertoCarlos2425T4.
     */
    @Test
    public void testComprarLibro() throws Exception {
        System.out.println("comprarLibro");
        int canti = 0;
        miLibreriaMilanValverdeRobertoCarlos2425T4 instance = new miLibreriaMilanValverdeRobertoCarlos2425T4();
        instance.comprarLibro(canti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
