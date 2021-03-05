
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class Exammgr {
    private static Scanner x;
    ArrayList<String>id=new ArrayList<String>();
    ArrayList<String>quest=new ArrayList<String>();
    ArrayList<String>op1=new ArrayList<String>();
    ArrayList<String>op2=new ArrayList<String>();
    ArrayList<String>op3=new ArrayList<String>();
    ArrayList<String>op4=new ArrayList<String>();
    HashMap<Integer,String>ans=new HashMap<>();
       
        
    public ArrayList<String>id() throws IOException
    {
        String line="";
        try
        {
          BufferedReader buff=new BufferedReader(new FileReader("Question.txt"));
            buff.readLine();
            while((line=buff.readLine())!=null)
            {
                String []file=line.split(",");
                id.add(file[0]);
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
        //System.out.println(question);
        //System.out.println(pass);
        return id;
     }     
    
    public ArrayList<String>ques() throws IOException
    {
        String line="";
        try
        {
          BufferedReader buff=new BufferedReader(new FileReader("Question.txt"));
            buff.readLine();
            while((line=buff.readLine())!=null)
            {
                String []file=line.split(",");
                quest.add(file[1]);
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
        //System.out.println(quest);
        //System.out.println(pass);
        return quest;
     }
    
    public ArrayList<String>op1() throws IOException
    {
        String line="";
        try
        {
          BufferedReader buff=new BufferedReader(new FileReader("Question.txt"));
            buff.readLine();
            while((line=buff.readLine())!=null)
            {
                String []file=line.split(",");
                op1.add(file[2]);
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
        //System.out.println(question);
        //System.out.println(pass);
        return op1;
     }
    
    public ArrayList<String>op2() throws IOException
    {
        String line="";
        try
        {
          BufferedReader buff=new BufferedReader(new FileReader("Question.txt"));
            buff.readLine();
            while((line=buff.readLine())!=null)
            {
                String []file=line.split(",");
                op2.add(file[3]);
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
        //System.out.println(question);
        //System.out.println(pass);
        return op2;
     }
    
    public ArrayList<String>op3() throws IOException
    {
        String line="";
        try
        {
          BufferedReader buff=new BufferedReader(new FileReader("Question.txt"));
            buff.readLine();
            while((line=buff.readLine())!=null)
            {
                String []file=line.split(",");
                op3.add(file[4]);
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
        //System.out.println(question);
        //System.out.println(pass);
        return op3;
     }
    
    public ArrayList<String>op4() throws IOException
    {
        String line="";
        try
        {
          BufferedReader buff=new BufferedReader(new FileReader("Question.txt"));
            buff.readLine();
            while((line=buff.readLine())!=null)
            {
                String []file=line.split(",");
                op4.add(file[5]);
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
        //System.out.println(question);
        //System.out.println(pass);
        return op4;
     }
    
    public HashMap<Integer,String>ans() throws IOException
    {
        String line="";
        try
        {
          BufferedReader buff=new BufferedReader(new FileReader("Question.txt"));
            buff.readLine();
            while((line=buff.readLine())!=null)
            {
                String []file=line.split(",");
                ans.put(Integer.valueOf(file[0]),file[6]);
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
        //System.out.println(question);
        //System.out.println(pass);
        return ans;
     }
    
    
   
}
    