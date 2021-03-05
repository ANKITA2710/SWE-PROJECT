
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prias
 */
public class Detailsmgr {
    public void detail(String name,String div,String sec,String roll)
    {
        try{
			FileWriter Writer=new FileWriter("Details.txt",true);//Filename=UploadQuestion.txt
                        PrintWriter p=new PrintWriter(Writer);
                       p.write(name+","+div+","+sec+","+roll+"\n");
			
			p.close();
                        
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
}
