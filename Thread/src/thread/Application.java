package thread;

public class Application {
public static void main(String[] args) {
	
	
	Printer printer= new Printer();
	Thread thread= new Thread(printer);
	//thread.setDaemon(false);
	
	thread.start();
	
	//thread.run();
	
	for (int h=0; h<100; h++) {
		System.out.println("Main" +" "+Thread.currentThread().getName()+" "+h);
	}
  } 
}
