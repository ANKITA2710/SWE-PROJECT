
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
public class UploadTest {
    public static void main(String args[]) throws IOException
    {
        Uploadmgr u=new Uploadmgr();
        ViewAllmgr v=new ViewAllmgr();
        String path="Question.txt";
       Object[]total=v.Display(path);
        int x=total.length;
        u.up("13","Which is the hottest season of the year?","May", "December", "July", "October", "May");
        Object[]total1=v.Display(path);
        int y=total1.length;
        assert y==x+1:"Question not added";
        
    }
        
    
}
