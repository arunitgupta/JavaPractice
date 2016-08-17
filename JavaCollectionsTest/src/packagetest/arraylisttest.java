package packagetest;

public class arraylisttest {
	public static void main(String args[]){  
		  //Creating user-defined class objects  
		  arraylisttest s1=new arraylisttest(101,"Sonoo",23);  
		  arraylisttest s2=new arraylisttest(102,"Ravi",21);  
		  arraylisttest s3=new arraylisttest(103,"Hanumat",25);  
		      
		  ArrayList<arraylisttest> al=new ArrayList<arraylisttest>();//creating arraylist  
		  al.add(s1);//adding arraylisttestclass object  
		  al.add(s2);  
		  al.add(s3);  
		    
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    arraylisttest st=(arraylisttest)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 }  
}
