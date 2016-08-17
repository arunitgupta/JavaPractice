
public class Stringchk {
	public static void main(String args[])
	{
		String s="Arunit";
		String s1=new String("arunit");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s.toLowerCase());
		System.out.println(s.compareTo(s1));
		System.out.println(s.substring(2,3));
		System.out.println(s.length());
		s.concat("Gupta");
		System.out.println(s);
	
		String s2=s.concat("Gupta");
		System.out.println(s2);

	
	}

	

}
