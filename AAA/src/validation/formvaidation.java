/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

/**
 *
 * @author USER
 */
public class formvaidation 
{
public boolean unamevalidator(String uname)
	{
		if (!(uname.length()>=10 && uname.length()<=15))
		{
			return false;
		}
		int ascii;
		ascii = uname.charAt(0);
		if(!((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)))
		{
			return false;
		}	
		for(int i=1; i<uname.length(); i++)
		{
			ascii = uname.charAt(i);
			if(!((ascii>=48 && ascii<=57) || (ascii==46) || (ascii==95) || (ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)))
			{
				return false;
			}
		}		
		return true;
	}
	
	public boolean datevalid(String date)
	{
		if(date.length() != 10)
		{
			return false;
		}
		if(!(date.charAt(2)==date.charAt(5)))
		{
			return false;
		}
		int ascii;
		ascii = date.charAt(2);
		if(!((ascii==45) || (ascii==46) || (ascii==47) || (ascii==92)))
		{
			return false;
		}
		for(int i=0; i<date.length(); i++)
		{
			if(i==2 || i==5)
			continue;
			ascii = date.charAt(i);
			if(!(ascii>=48 && ascii<=57))
			{
				return false;
			}
		}
		return true;
	}

	public boolean emailvalid(String email)
	{
		if(!(email.endsWith(".com")))
		{
			return false;
		}
		int ind = email.indexOf("@");
		int ind1 = email.indexOf(".");
		
		String domain = email.substring(ind+1,ind1);
		if(!(domain.length()>=5 && domain.length()<=10))
		{
			return false;
		}	
		int ascii;
		ascii = domain.charAt(0); 
		if(!((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)))
		{		
			return false;
		}
		for(int i=1;i<domain.length();i++)
		{
			ascii = domain.charAt(i);
			if(!((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)))
			{		
				return false;
			}	
		}
		
		String uname = email.substring(0,ind);
		if (!(uname.length()>=10 && uname.length()<=15))
		{
			return false;
		}
		ascii = uname.charAt(0);
		if(!((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)))
		{
			return false;
		}	
		for(int i=1; i<uname.length(); i++)
		{
			ascii = uname.charAt(i);
			if(!((ascii>=48 && ascii<=57) || (ascii==46) || (ascii==95) || (ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)))
			{
				return false;
			}
		}		
		return true;
	}

	public boolean contactvalid(String contact)
	{
		if(contact.length() != 13)
		{
			return false;
		}
		int ascii1;
		ascii1 = contact.charAt(0);
		if(ascii1 != 43)
		{
			return false;
		}	
		ascii1 = contact.charAt(1);
		if(ascii1 != 57)
		{
			return false;
		}	
		ascii1 = contact.charAt(2);
		if(ascii1 != 49)
		{
			return false;
		}				
		for(int i=3; i<contact.length(); i++)
		{
			ascii1 = contact.charAt(i);
			if(!(ascii1>=48 && ascii1<=57))
			{
				return false;
			}
		}
		return true;
	}

public boolean passvalid(String pass)
	{
		if(!(pass.length()<=10 && pass.length()>=15))
		{
			return false;
		}
		return true;
	}    
}
