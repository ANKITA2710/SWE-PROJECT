
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class Loginmgr {
    public boolean abc(String path,String username,String password) throws IOException
    {
        BufferedReader buff=null;
        String line="";
        String delimeter=",";
        try
        {
            buff=new BufferedReader(new FileReader(path));
            while((line=buff.readLine())!=null)
            {
                String []file=line.split(delimeter);
                //System.out.println("user");
                if(file[0].equals(username) && file[1].equals(password))
                {
                    return true;
                    //new samplehomepage_balakabiswas_B126().setVisible(true);
                    
                }
                
            }
            
        }
        catch(FileNotFoundException e)
        {
           e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return false;
        
        
        
        
    }     
    
}
