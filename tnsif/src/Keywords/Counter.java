package Keywords;

public class Counter {
	static int count=0;//shared by all objects
	Counter(){
		count++;
	}
	static void ShowCount()//can be called without objects creation 
	{
		System.out.println("Objects Created:"+count);
	}

}
