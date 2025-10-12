package Exceptionhandlings;

class Sample{
	
	public void show() throws Exception{
		String s=null;
		throw new NullPointerException("NoNullValues");
	}
}
public class ThrowsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample();
	}

}
