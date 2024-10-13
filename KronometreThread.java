package thhreads;

public class KronometreThread implements Runnable{

	private Thread thread ;
	private String threadName;
	
	public KronometreThread (String threadName2) {
		
		this.threadName= threadName2;
		System.out.println("Olusturuluyor." + threadName2);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Çalıstırılıyor." + threadName);
		
		
			try {
				for (int i = 0; i <= 10; i++) {
					
					System.out.println(threadName + " :"  + i);
				Thread.sleep(1000); // 1 sn beklemeye yarar.
			}
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
  
					System.out.println("Kesildi." + threadName);
			} 
		
			System.out.println("Thread bitti :" + threadName);
			
	

			}
	public void start() {
		System.out.println("Thread nesnesi olusturuluyor.");
		
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
			
		}
		
	}
}
