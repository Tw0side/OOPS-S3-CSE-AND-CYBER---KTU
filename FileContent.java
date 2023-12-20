import java.io.*;
import java.util.*;

class FileContent
{
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String file;
int lcount=0,ccount=0,wcount=0;
String str=null;
System.out.println("Enter the file to be read");
file=sc.nextLine();
try
{
	FileInputStream fin=new FileInputStream(file);
	BufferedReader br=new BufferedReader(new InputStreamReader(fin));
	System.out.println("The file contents are");
	do
{
	str=br.readLine();
if(str!=null)
{
	lcount++;
	int l=str.length();
	for(int i=0;i<l;i++)
	{
		if(str.charAt(i)==' ')
		{
			wcount++;
		}
		else 
		{
			ccount++;
		}
		
	}
	wcount++;
}}while(str!=null);
br.close();
System.out.println("The number of lines is "+lcount);
System.out.println("The number of words is "+wcount);
System.out.println("The number of Characters is "+ccount);

}
catch(IOException e)
{
	System.out.println("EXCEPTION CAUGHT"+e);
}
}
}
