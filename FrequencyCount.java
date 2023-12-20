import java.io.*;
import java.util.*;
public class FrequencyCount
{
public static void main(String args[])
{
int i,freq=0,l;
String s;
String ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
s=sc.nextLine();
System.out.println("Enter the character");
ch=sc.nextLine();
l=s.length();
s=s.toLowerCase();
ch=ch.toLowerCase();
for(i=0;i<l;i++)
{
if(s.charAt(i)==ch.charAt(0))
{
freq++;
}
}
if(freq==0)
{
System.out.println("The character is not present in string");
}
else
{
System.out.println("The count of the character "+ ch +" is "+freq);
}
}
}
