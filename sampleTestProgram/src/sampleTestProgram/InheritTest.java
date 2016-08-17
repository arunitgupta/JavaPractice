package sampleTestProgram;
class parent{
	int salary = 1000;

parent()
{
	System.out.println("this is parent class");}
}
public class InheritTest extends parent
{
	double salary = 10.12;
	InheritTest(){
	
System.out.println("child class");
}
	public static void main(String args[])
	{
		//InheritTest t =new InheritTest();
		//parent t=new parent();
		InheritTest p=new InheritTest();
		System.out.println("hello, your salary is :"+p.salary);
		System.out.println(+p.salary);
	}

}