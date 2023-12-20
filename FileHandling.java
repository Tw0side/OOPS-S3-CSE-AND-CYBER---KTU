import java.io.*;
import java.util.*;

class FileHandling
{
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String file;
String str=null;
System.out.println("Enter the file to be read");
file=sc.nextLine();
try
{
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	System.out.println("The file contents are :");
while((str=br.readLine())!=null)
{
	System.out.println(str);
}
br.close();
}
catch(IOException e)
{
	System.out.println("EXCEPTION CAUGHT"+e);
}
}
}
