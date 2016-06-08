
public class ThreadExample {

	public static void main(String[] args) {
		
		PrintLogic pl1 = new PrintLogic("Thread A");
		Thread t1 = new Thread(pl1);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		PrintLogic pl2 = new PrintLogic("Thread B");
		Thread t2 = new Thread(pl2);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		PrintLogic pl3 = new PrintLogic("Thread C");
		Thread t3 = new Thread(pl3);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
