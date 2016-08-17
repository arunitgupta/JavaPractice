package sampleTestProgram;

public class Emp {
int id;
String name;
Address address;
Emp(int id, String name, Address address)
{this.id=id;
this.name=name;
this.address=address;
	}
void display()
{
	System.out.println(id+""+name);
	System.out.println(address.city+""+address.state+""+address.country);
	}
public static void main(String args[])
{
	Address add1=new Address("Springfield","IL","USA");
	Address add2=new Address("Kansas City","MO","USA");

	Emp e1=new Emp(16220919,"Arunit",add1);
	Emp e2=new Emp(16220912,"Roy",add2);
	e1.display();
	e2.display();
}

}
