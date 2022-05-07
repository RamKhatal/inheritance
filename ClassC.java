package Pkg1;

public class ClassC extends ClassA
{
    int c=50;
    void dis()
    {
    	System.out.println(c);
    }


	public static void main(String[] args)
	{
		ClassC obj1 =new ClassC();
		obj1.dis();
		obj1.display();
		ClassB obj2 = new ClassB();
				obj2.show();
		obj2.display();
	}
}
