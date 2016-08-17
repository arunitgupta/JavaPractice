package sampleTestProgram;

public class StaticTest {
int id;
String name;
static  String school="UMKC";
StaticTest(int id,String name)
{
	this.id=id;
	this.name=name;
	}
void Display()
{
	System.out.println("Details are: "+id+" "+name+" "+school);
}

public static void main(String args[])
{
	StaticTest s=new StaticTest(101,"Arunit");
	StaticTest s1=new StaticTest(102,"John");
	s.Display();
	s1.Display();
}



}
