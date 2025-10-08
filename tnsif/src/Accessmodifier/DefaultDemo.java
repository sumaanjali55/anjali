package Accessmodifier;

class Example{  //Variables,methods with no access modifiers before it ,will be considered as default
	int data=20;
	void show() {
		System.out.println("This is Default method");//these Default variables,methods can be accessed everywhere within in the same pavkage
	}
}

public class DefaultDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Example e=new Example();
			System.out.println(e.data);
			e.show();

	}

}