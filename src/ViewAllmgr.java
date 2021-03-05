
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prias
 */
public class ViewAllmgr {
    
    public String[] View(String path)
    {
        File file=new File(path);
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String firstLine = br.readLine().trim();
			String[] columnsName = firstLine.split(",");
                        return columnsName;
                        
		}
		catch(Exception e){
			e.printStackTrace();
		}
        return null;
    }
    
    public Object[] Display(String path) throws IOException
    {
        
        File file=new File(path);
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String firstLine = br.readLine().trim();
                       String[] columnsName = firstLine.split(",");
                        Object[] tableLines = br.lines().toArray();
                        return tableLines;
                        //System.out.println(tableLines.length);
			/*for(int i=0;i<tableLines.length;i++)
			{
				String line=tableLines[i].toString().trim();
				String[] dataRow=line.split(",");
				return dataRow;
			}*/
                        
                }
                catch(FileNotFoundException e)
                {
                    e.printStackTrace();
                }
        return null;
    }
}
