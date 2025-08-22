package mult;

public class Example1 {

	public static void main(String[] args) {
		Thread t1=new Thread1();
		t1.start();
//		t1.run();
		Thread t2=new Thread(new Th2());
		t2.start();
//		t2.run();
		
		System.out.println("main end"+Thread.currentThread().getName());
	}
}

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		System.out.println("Thread1"+Thread.currentThread().getName());
	}
}

class Th2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		System.out.println("Thread2"+Thread.currentThread().getName());
	}
}
