
public class PrintLogic implements Runnable {

	String threadName;
	
	public PrintLogic(String threadName){
		
		this.threadName = threadName;
		
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println(threadName + " is printing " + i);
			
		}
		
	}

}
