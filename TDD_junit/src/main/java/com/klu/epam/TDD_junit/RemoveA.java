package com.klu.epam.TDD_junit;

public class RemoveA {

	public  String removeAinFirst2(String str)
	{
		String result=str;
		int stringlength=str.length();
		if(stringlength>0)
		{
			if(stringlength==1 && str.charAt(0)=='A')
			{
				result="";
			}
			else if(str.charAt(0)=='A' && str.charAt(1)=='A')
			{
					result=str.substring(2,stringlength);
			}
			else if(str.charAt(1)=='A')
			{
				result=str.charAt(0)+str.substring(2,stringlength);
			
			}
			else if(str.charAt(0)=='A')
			{
				result=str.substring(1,stringlength);
			}
		}
		return result;
	}
}
