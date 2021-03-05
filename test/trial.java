
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prias
 */
public class trial {
    public static void main(String args[]) throws IOException
    {
    Exammgr x=new Exammgr();
    HashMap<Integer,String>a=x.ans();
    String s=a.get(1);
    System.out.println(s);
    if(s.equals("21"))
    {
        System.out.println("yes");
          
    }
   
    }
}
