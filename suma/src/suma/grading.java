package suma;

public class grading {

	public static void main(String[] args) {
        int marks=50;
		if( marks<=100 && marks>=80) {
			System.out.println("grade:A");
		}
		else if(marks<80 && marks>=60) {
			System.out.println("grade:B");
		}
		else if(marks<60 && marks>=35) {
			System.out.println("grade:c");
		}
		else {
			System.out.println("fail");
		}
	}

}
