
public class Arry_compare {
	
public static void main(String args[])
{
int a[]={1,2,2,4,5};
for(int i=0;i<a.length-1;i++)
{
	for(int j=1;j<a.length;j++)
	{
		if (a[i]==a[j])
		{
	System.out.println("Elements matched");
		}
		else
		{
			System.out.println("Elements not matched");
		}
}}

System.out.println("Length of array :"+a.length);
}
}
