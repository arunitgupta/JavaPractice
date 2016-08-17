package Factory;

public class FactoryMethodDemo {
	public static void main(String args[]){
ShapeFactory sf=new ShapeFactory();
Shape s=sf.getShape("CIRCLE");
s.draw();

Shape s1=sf.getShape("RECTANGLE");
s1.draw();

Shape s2=sf.getShape("SQUARE");
s2.draw();
}
}