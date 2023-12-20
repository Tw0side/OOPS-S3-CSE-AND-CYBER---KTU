import java.io.*;
import java.util.*;

public class MatrixMultiplication
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m1,n1,i,j,m2,n2;
int a[][]=new int[20][20];
int b[][]=new int[20][20];
int c[][]=new int[20][20];

System.out.println("Enter the number of rows for first matrix");
m1=sc.nextInt();
System.out.println("Enter the number of coloumns for first matrix");
n1=sc.nextInt();
System.out.println("Enter the elements for first matrix");
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("First matrix is");
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

System.out.println("Enter the number of rows for second matrix");
m2=sc.nextInt();
System.out.println("Enter the number of coloumns for second matrix");
n2=sc.nextInt();
System.out.println("Enter the elements for second matrix");
for(i=0;i<m2;i++)
{
for(j=0;j<n2;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("second matrix is");
for(i=0;i<m2;i++)
{
for(j=0;j<n2;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
if(n1!=m2)
{
System.out.println("MATRIX MULTIPLICATION NOT POSSIBLE!!!");
}
else
System.out.println("Resultant matrix is");
{
for (i=0;i<m1;i++)
{
for (j=0;j<n2;j++)
{
for(int k=0;k<n1;k++)
{
c[i][j] += a[i][k]*b[k][j];;
}
System.out.print(" "+c[i][j]);
}
System.out.println();
}
}
}
}







