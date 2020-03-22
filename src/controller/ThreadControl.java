package controller;

public class ThreadControl extends Thread{

	static int a = 1;
	static String T = "Thread ==> ";
	private ThreadControl (int a, String T) {
		
		ThreadControl.a = a;
		ThreadControl.T = T; 
	}
	
	static Thread imprime1 = new Thread() {
	
		public void run() {
			a = 1;
			System.out.println(T + a);
		}
	};
	
	static Thread imprime2 = new Thread() {
		
		public void run() {
			a = 2;
			System.out.println(T + a);
		}
	};
	
	static Thread imprime3 = new Thread() {
		
		public void run() {
			a = 3;
			System.out.println(T + a);
		}
	};
	
	static Thread imprime4 = new Thread() {
		
		public void run() {
			a = 4;
			System.out.println(T + a);
		}
	};
	
	static Thread imprime5 = new Thread() {
		
		public void run() {
			a = 5;
			System.out.println(T + a);
		}
	};
	
	public static void main(String[] args) {
			
			imprime1.start();
			imprime2.start();
			imprime3.start();
			imprime4.start();
			imprime5.start();
			
	}
}
