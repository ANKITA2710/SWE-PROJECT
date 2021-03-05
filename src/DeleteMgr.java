
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prias
 */
public class DeleteMgr {
    public static Scanner x;
    
    public  void removeRecord(String filepath, String removeid)
	{
            
            String tempFile="temp.txt";
		File oldFile=new File(filepath);
		File newFile=new File(tempFile);
		String id= ""; String Question= "";String op1= "";String op2= "";String op3= "";String op4= ""; String ans= "";
		try
		{
			FileWriter fw=new FileWriter(tempFile,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			x=new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");//ektu video dekhe nish aye point e
			int i=0;
                        while(x.hasNext())
			{
				id=x.next();
				Question=x.next();
				op1=x.next();
				op2=x.next();
				op3=x.next();
				op4=x.next();
				ans=x.next();
				if(id!=removeid)
				{
					pw.println(id+","+Question+ ","+op1+ ","+op2+ ","+op3+ ","+op4+ ","+ans);
				}
                                
			}
                        
			x.close();
			pw.flush();
			pw.close();
                        
			oldFile.delete();
			File dump=new File(filepath);
			newFile.renameTo(dump);
		}
		catch(Exception e){
			//JOptionPane.showMessageDialog(null,"Question ID not present");
		}
	}
    
}
