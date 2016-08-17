package packagetest;
/*interface A
{
void a();
void b();
void c();
void d();
}
abstract class B implements A
{public void c()
	{System.out.println("I'm in C");}}
class M extends B
{public void a()
	{System.out.println("I'm in a");}
public void b()
{System.out.println("I'm in b");}
public void d()
{System.out.println("I'm in d");}
	}
*/
abstract class A
{abstract void a();}
class M extends A
{public void a()
	{System.out.println("sum of 2+2 is:"+(2+2));}}
public class AbstractTest {
	public static void main(String args[])
	{A x=new M();
	x.a();
	//x.b();
	//x.c();
	//x.d();
		
	}

}
