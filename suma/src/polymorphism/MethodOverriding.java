package polymorphism;
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal a1 = new Dog();
	        Animal a2 = new Cat();

	        a1.sound();  
	        a2.sound();
	}

}
