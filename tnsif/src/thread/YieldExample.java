package thread;
class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
            Thread.yield();  // Hint to scheduler: let other threads run
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}


public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();
        b.start();

	}

}
