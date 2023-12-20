import java.io.*;
import java.util.*;

class employe
{
int age;
float salary;
String address,phonenumber,name;
void printsalary()
{
System.out.println("Salary : "+salary);
}
}

class officer extends employe
{
String specialization="Data analytics",department="IT";

void officerdetails()
{
System.out.println("Officer Details");
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("Address :"+address);
System.out.println("Phone Number :"+phonenumber);
System.out.println("Specialization :"+specialization);
System.out.println("Department:"+department);
printsalary();
System.out.println();
}
}

class manager extends employe
{
String specialization="Software Development",department="IT";

void managerdetails()
{
System.out.println("Manager Details");
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("Address :"+address);
System.out.println("Phone Number :"+phonenumber);
System.out.println("Specialization :"+specialization);
System.out.println("Department:"+department);
printsalary();
System.out.println();
}
}

class Inheritence
{
public static void main(String args[])
{
officer of=new officer();
manager m=new manager();

of.name="Your name";//Enter name
of.age=20;//Enter age of choice
of.address="Your address";
of.phonenumber="Phone no";
of.salary=7000;//Enter preffered salary

m.name="Your name";//Enter name
m.age=25;//Enter age of choice
m.address="Address";
m.phonenumber="phone";
m.salary=10000;//Enter preffered salary

of.officerdetails();
m.managerdetails();
}
}
