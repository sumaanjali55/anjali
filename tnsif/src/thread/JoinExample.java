package thread;

class MyThread extends Thread {
public void run() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("Child Thread: " + i);
        try {
            Thread.sleep(500); // just to slow it down
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}


public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    MyThread t = new MyThread();
        t.start();

        try {
            t.join();  // Main thread waits until child thread completes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread runs after child thread completes!");

	}

}
