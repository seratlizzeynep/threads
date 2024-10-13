package thhreads;

class BenimRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - Thread çalışıyor: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);  // 0.5 saniye bekletme
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
