package thhreads;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KronometreThread kronometre1 = new KronometreThread("Thread 1");
		KronometreThread kronometre2 = new KronometreThread("Thread 2");
		KronometreThread kronometre3 = new KronometreThread("Thread 3");
		kronometre1.start();
		kronometre2.start();
		kronometre3.start();
	}

}
