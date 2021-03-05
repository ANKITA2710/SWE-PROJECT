
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prias
 */
public class CompareTest {
    
    public static void main(String args[]) throws IOException
    {
        ViewAllmgr v=new ViewAllmgr();
        String path="Marks.txt";
        String[]columns=v.View(path);
        assert columns.length==3:"Column count error";
        
        
    }
        
}
