package sampleTestProgram;

public class overloadingExp {
	void Sum(int a, int b)
	{
		System.out.println("integer sum is:"+a+b);
	}
	void Sum(double c, double d)
	{
		System.out.println("Double sum is:"+c+d);
	}
	public static void main(String args[])
	{
		overloadingExp b =new overloadingExp();
		b.Sum(10, 20);
		b.Sum(10.11,12.22);
	}

}
