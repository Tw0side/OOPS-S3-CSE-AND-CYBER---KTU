import java.io.*;
import java.util.*;

class FileException
{
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String file,output;
String str=null;
System.out.println("Enter the file to be read");
file=sc.nextLine();
System.out.println("Enter the file to store output");
output=sc.nextLine();
try
{
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	FileWriter fw =new FileWriter(output);
	BufferedWriter bw=new BufferedWriter(fw); 
	System.out.println("The file contents are");
while((str=br.readLine())!=null)
{
	System.out.println(str);
	bw.write(str);
}
br.close();
bw.close();
}
catch(FileNotFoundException e1)
{
	System.out.println("FileNotFoundException CAUGHT"+e1);
}
catch(IOException e2)
{
	System.out.println("IOException CAUGHT"+e2);
}
catch(Exception e3)
{
	System.out.println("Exception CAUGHT"+e3);
}
}
}
