
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
public class ScoreManger {
    public void insert(String name,String newmarks,String roll) 
    {
        try{
			FileWriter Writer=new FileWriter("Marks.txt",true);//Filename=UploadQuestion.txt
                        PrintWriter p=new PrintWriter(Writer);
//Writer.write("id,question,op1,op2,op3,op4,ans");
                        //Writer.write("\n");
                        //p.print();
			p.println(name+ ","+roll+ ","+newmarks);
                        //p.write(System.getProperty("line.separator"));
			p.close();
                        //setVisible(false);
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
    
    }
    
}
