
public class Arrycpy {
public static void main(String args[])
{char[] i={'a','b','a','r','u','n','i','t','a','z','c','s'};
char[] j=new char[6];
	
System.arraycopy(i, 2, j, 0, 6);
System.out.println(new String(j));

}
}
