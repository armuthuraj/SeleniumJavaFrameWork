package javaBasicDemo;

public class ThreadingDemo extends Thread {
	
	public static void main(String[] args) {
		ThreadingDemo demo = new ThreadingDemo();
		demo.start();
		ThreadingDemo demo1 = new ThreadingDemo(); 
		demo1.start();
	}
	
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId()+"Value is :"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}

