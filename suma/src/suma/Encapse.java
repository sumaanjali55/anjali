package suma;

public class Encapse {
	String colour="red";
	int seats=4;
	 String company="BMW";
	public void start() 
	{
		System.out.println("the car has started");
	}
   public void stop() 
{
	System.out.println("the car has stop");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapse ob =new  Encapse();
		System.out.println(ob.colour);
		System.out.println(ob.seats);
		System.out.println(ob.company);
		ob.start();
		ob.stop();
		

	}

}
