/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.mhs;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kanjeng Ndoro
 */
public class mhsserviceTest {
    
    public mhsserviceTest() {
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
     * Test of Save method, of class mhsservice.
     */
//    @Test
    public void testSave() {
        System.out.println("Save");
        mhs entity = null;
        mhsservice instance = new mhsservice();
        mhs expResult = null;
        mhs result = instance.Save(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class mhsservice.
     */
//    @Test
    public void testFind() {
        System.out.println("find");
        int offset = 0;
        int limit = 0;
        mhsservice instance = new mhsservice();
        List<mhs> expResult = null;
        List<mhs> result = instance.find(offset, limit);
        System.out.println(result.toString());
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class mhsservice.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 45;
        mhsservice instance = new mhsservice();
        mhs expResult = null;
        mhs result = instance.findById(id);
        System.out.println(result.toString());
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class mhsservice.
     */
//    @Test
    public void testDelete() {
        System.out.println("delete");
        long id = 0L;
        mhsservice instance = new mhsservice();
        String expResult = "";
        String result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
