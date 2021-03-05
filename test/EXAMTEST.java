
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import static junit.framework.Assert.assertEquals;
import junit.framework.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prias
 */
public class EXAMTEST {

    /**
     *
     * @param args
     * @throws IOException
     */
    //@Test  
    public static void main(String args[]) throws IOException
    {
        Exammgr x=new Exammgr();
        ArrayList<String>i=new ArrayList<String>();
        i=x.id();
        String a=i.get(0);
        //System.out.println(a);
        assert a.equalsIgnoreCase("1"):"wrong id";
        ArrayList<String>q=x.ques();
        String b=q.get(0);
        //System.out.println(a);
        assert b.equalsIgnoreCase("How many consonants are there in the English alphabet?"):"wrong question";
        
        ArrayList<String>o1=x.op1();
        String c=o1.get(0);
        //System.out.println(a);
        assert c.equalsIgnoreCase("20"):"wrong option";
        
        ArrayList<String>o2=x.op2();
        String d=o2.get(0);
        //System.out.println(a);
        assert d.equalsIgnoreCase("21"):"wrong option";
        
        ArrayList<String>o3=x.op3();
        String e=o3.get(0);
        //System.out.println(a);
        assert e.equalsIgnoreCase("40"):"wrong option";
        
        ArrayList<String>o4=x.op4();
        String f=o4.get(0);
        //System.out.println(a);
        assert b.equalsIgnoreCase("19"):"wrong option";
        
        
    }
    
}
