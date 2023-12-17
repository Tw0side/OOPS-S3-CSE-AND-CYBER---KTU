import java.util.*;
import java.io.*;

class oddeven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String file,str=null;
		System.out.println("Enter the file name");
		file=sc.nextLine();
		
		try
		{
			FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
				StringTokenizer st=new StringTokenizer(str);

				while(st.hasMoreTokens())
				{
					String s=st.nextToken();
					if(Integer.parseInt(s)%2==0)
					{
						System.out.println("The number "+s+" is even");
					}
					else 
					{
						System.out.println("The number "+s+" is odd");
					}
				}
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception caught "+e);
		}
	}
}