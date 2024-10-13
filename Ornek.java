package thhreads;
public class Ornek {
public static void main(String[] args) {
    BenimRunnable runnable1 = new BenimRunnable();
    BenimRunnable runnable2 = new BenimRunnable();
    
    Thread thread1 = new Thread(runnable1);
    Thread thread2 = new Thread(runnable2);
    
    thread1.start();  // Thread 1 başlatılır
    thread2.start();  // Thread 2 başlatılır
}
}