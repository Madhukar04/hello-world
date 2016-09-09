package com.corejava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileOperation
{
	public static void main(String args[])
	{
		BufferedReader br=null,br1=null;
		String sCurrentLine,second=null;
		
		try
		{
			
			br = new BufferedReader(new FileReader("C:\\Users\\madhukar.potha\\Downloads\\p2p.txt"));
			br1 = new BufferedReader(new FileReader("C:\\Users\\madhukar.potha\\Downloads\\CoreLogSeperation"));
			while(((sCurrentLine = br.readLine()) != null || (second = br1.readLine() )!= null) )
			{
				
				if(sCurrentLine!=null){
					second = br1.readLine();
					System.out.println(sCurrentLine);
				}
				 if(second!=null )
					System.out.println(second);
			}
		
		//FileReader fr=new FileReader(f);
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			if(br1!=null)
				
				br1=null;
		}
	}

}
