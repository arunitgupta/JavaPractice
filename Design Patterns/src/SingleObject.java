
public class SingleObject {
private static SingleObject instance=new SingleObject();
private SingleObject(){}
public static SingleObject getInstance()
{
	return instance;}

public void showMesage()
{
	System.out.println("My Name is Arunit!");}}