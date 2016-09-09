package com.corejava;

import java.util.HashMap;
import java.util.Scanner;

public class StringtoMap
{
	public static void main(String args[])
	{
		//String str="abc=abc~*value=10~*Test=10~*";
		String str="hdr_Tran_Id=MULTIACQRY~*hdr_Status=NULL~*req_User_Id=201606001460~*req_Cbx_Reference_No=C716060516193043~*req_Date_Time=20160506194627~*req_Trans_Id=MULTIACQRY~*req_Branch_Id=2~*req_Mesage_Indicator=0~*req_Chanel_Id=CBX~*TOT_SEGMENTS=9~*req_Seg_No=1~*req_Acc_No=10000000063~*CIF_NO=1234~*UNIT_ID=IGTBGB~*REQ_COUNTRY_CODE=GB~*req_Seg_No=1~*req_Acc_No=10000000060~*CIF_NO=1234~*UNIT_ID=IGTBGB~*REQ_COUNTRY_CODE=GB~*";
		//Map<String,String> hm = new HashMap<String,String>();
		HashMap newmap = new HashMap();
		String key=null,value=null,ret=null;
		//System.out.println(str);
		String s[]=str.split("~\\*");
		for(int i=0;i<s.length;i++)
		{
			//System.out.println(s[i]);
			if(s[i].contains("="))
			{
				String val[]=s[i].split("=");
				 key=val[0];
				 value=val[1];
		
			}
			if(key!=null && value!=null)
			{
				if(newmap.containsKey(key))
				{
					ret=(String)newmap.get(key);
					value=value+","+ret;
				}
				
				newmap.put(key, value);
			}
		}
		System.out.println("Map Value are:"+newmap);
		System.out.println("Enter the key to get the respective value: ");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		if(newmap.containsKey(input))
			System.out.println(newmap.get(input));	
		
	}
}
