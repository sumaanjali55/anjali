package suma;

public class Sample {
	String message;
	
	Sample(String msg){
		message=msg;
	System.out.println("this is constuctor:"+ message);
	}
	public void show(){
		System.out.println("this is method,message="+message);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ob =new Sample("SUMA");
	      ob.show();
	      

	}

}
