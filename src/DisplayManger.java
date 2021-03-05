
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prias
 */
public class DisplayManger {
    public static void main(String args[])
    {
    WELCOME w=new WELCOME();
    screen1();
    }
    public static void screen1()
    {
        new WELCOME().setVisible(true);
        
    }
    
    
}
