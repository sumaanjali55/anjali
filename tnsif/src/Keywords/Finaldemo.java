package Keywords;

public class Finaldemo {
	final int x=10;
	final void display()
	{
		System.out.println("Final Method in parent class");
	}
	void show()
	{
		//x=20; error:cannot change final variable value
		System.out.println("x="+x);
	}
	}
class Child1 extends Finaldemo {
	//void display() {} error:Cannot ovveride final method
}
final class parent{
	void demo()
	{
		System.out.println("Final Class");
	}
}
//class Child2 extends parent{} error:cannot inherit the final class

