/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prias
 */
public class ExammgrTest {
    Exammgr x;
    public ExammgrTest() {
    }
    
    @BeforeEach
    public void setUp() {
        x=new Exammgr();
    }
    
    @AfterEach
    public void tearDown() {
        x=null;
    }

    /**
     * Test of id method, of class Exammgr.
     */
    @Test
    public void testId() throws Exception {
        ArrayList<String>i=new ArrayList<>();
        i.add("1");
        i.add("2");
        i.add("3");
        i.add("4");
        i.add("5");
        i.add("6");
        String a=i.get(0); //1
        ArrayList<String>b=x.id();
        
        assertEquals(i,b);
        
    }

    /**
     * Test of ques method, of class Exammgr.
     */
    @Test
    public void testQues() throws Exception {
        ArrayList<String>i=new ArrayList<>();
        i.add("How many consonants are there in the English alphabet?");
        i.add("Which is the tallest mountain in the world?");
        i.add("Which famous children s book has two characters named Tweedledum and Tweedledee?");
        i.add("Which planet is known as the Red Planet?");
        i.add("When did India's first virtual toy fair take place");
        i.add("Who is the father of Geometry?");
        //String a=i.get(0); //1
        ArrayList<String>b=x.ques();
        
        assertEquals(i,b);
    }

    /**
     * Test of op1 method, of class Exammgr.
     */
    @Test
    public void testOp1() throws Exception {
        ArrayList<String>i=new ArrayList<>();
        i.add("20");
        i.add("MtFuji");
        i.add("Alice in wonderland");
        i.add("Earth");
        i.add("February 5 2021");
        i.add("Aristotle");
        //String a=i.get(0); //1
        ArrayList<String>b=x.op1();
        
        assertEquals(i,b);
    }

    /**
     * Test of op2 method, of class Exammgr.
     */
    @Test
    public void testOp2() throws Exception {
        ArrayList<String>i=new ArrayList<>();
        i.add("21");
        i.add("MtEverest");
        i.add("oliver twist");
        i.add("Mars");
        i.add("February 27 2021");
        i.add("Euclid");
        //String a=i.get(0); //1
        ArrayList<String>b=x.op2();
        
        assertEquals(i,b);
    }

    /**
     * Test of op3 method, of class Exammgr.
     */
    @Test
    public void testOp3() throws Exception {
        ArrayList<String>i=new ArrayList<>();
        i.add("40");
        i.add("Himalayas");
        i.add("famous five");
        i.add("Jupiter");
        i.add("February 22 2021");
        i.add("Pythagoras");
        //String a=i.get(0); //1
        ArrayList<String>b=x.op3();
        
        assertEquals(i,b);
    }

    /**
     * Test of op4 method, of class Exammgr.
     */
    @Test
    public void testOp4() throws Exception {
        ArrayList<String>i=new ArrayList<>();
        i.add("19");
        i.add("nilgiri");
        i.add("secret seven");
        i.add("Saturn");
        i.add("February 25 2021");
        i.add("Kepler");
        //String a=i.get(0); //1
        ArrayList<String>b=x.op4();
        
        assertEquals(i,b);
    }

    /**
     * Test of ans method, of class Exammgr.
     */
    @Test
    public void testAns() throws Exception {
        HashMap<Integer,String>i=new HashMap<Integer,String>();
        i.put(1,"21");
        i.put(2,"MtEverest");
        i.put(3,"Alice in wonderland");
        i.put(4,"Mars");
        i.put(5,"February 27 2021");
        i.put(6,"Euclid");
        //String a=i.get(0); //1
        HashMap<Integer,String>b=x.ans();
        
        assertEquals(i,b);
    }
    
}
