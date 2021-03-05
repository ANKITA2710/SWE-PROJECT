
import java.io.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prias
 */
public class Uploadmgr {
    //Questionentity q=new Questionentity();
    
        
    public void up(String id, 
        String question1,
        String op1,
        String op2,
        String op3,
        String op4,
        String ans)
    {
        try{
			FileWriter Writer=new FileWriter("Question.txt",true);//Filename=UploadQuestion.txt
                        PrintWriter p=new PrintWriter(Writer);
//Writer.write("id,question,op1,op2,op3,op4,ans");
                        //Writer.write("\n");
                        //p.print();
			p.println(id+ ","+question1+ ","+op1+ ","+op2+ "," +op3+ ","+op4+ ","+ans);
                        //p.write(System.getProperty("line.separator"));
			p.close();
                        //setVisible(false);
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
    
     

}