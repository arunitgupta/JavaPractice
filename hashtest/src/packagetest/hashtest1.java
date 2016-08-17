package packagetest;

import java.util.HashMap;
import java.util.Map;

public class hashtest1 {
	public static void main(String args[])
	{
HashMap<Integer, String> h1=new HashMap<Integer, String>();
h1.put(2,"Arunit");
h1.put(12,"Ankush");
h1.put(55,"Rahul");
for(Map.Entry m:h1.entrySet())
{System.out.println(m.getKey()+""+m.getValue());}

	}

}
