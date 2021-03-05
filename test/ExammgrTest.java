/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prias
 */
public class ExammgrTest {
    Exammgr x=new Exammgr();
    public ExammgrTest() {
    }

    /**
     * Test of id method, of class Exammgr.
     */
    @Test
    public void testId() throws Exception {
        ArrayList<String>i=new ArrayList<String>();
        i=x.id();
        String a=i.get(0);
        assert a=="1":"false";
    }

    /**
     * Test of ques method, of class Exammgr.
     */
    @Test
    public void testQues() throws Exception {
    }

    /**
     * Test of op1 method, of class Exammgr.
     */
    @Test
    public void testOp1() throws Exception {
    }

    /**
     * Test of op2 method, of class Exammgr.
     */
    @Test
    public void testOp2() throws Exception {
    }

    /**
     * Test of op3 method, of class Exammgr.
     */
    @Test
    public void testOp3() throws Exception {
    }

    /**
     * Test of op4 method, of class Exammgr.
     */
    @Test
    public void testOp4() throws Exception {
    }

    /**
     * Test of ans method, of class Exammgr.
     */
    @Test
    public void testAns() throws Exception {
    }
    
}
