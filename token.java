import java.io.*;
import java.util.*;

class token
{
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String file;
int sum=0;
String str=null;
System.out.println("Enter the file to be read");
file=sc.nextLine();
try
{
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	System.out.println("The file contents are");
while((str=br.readLine())!=null)
{

	System.out.println(str);
	StringTokenizer st=new StringTokenizer(str);
	while(st.hasMoreTokens())
	{
		String s=st.nextToken();
		System.out.println(s);
		sum= sum + Integer.parseInt(s);
	}
}
System.out.println("The sum is "+ sum);
br.close();
}
catch(IOException e)
{
	System.out.println("EXCEPTION CAUGHT"+e);
}
}
}
