package Keywords;
class Employee{
	String name;
	Employee(String name){
		this.name=name;
	}
	void display() {
		System.out.println("Name : "+name);
	}
}
public class Thisdemo {
	public static void main(String[] args) {
		Employee e=new Employee("Ramu");
		e.display();
	}

}