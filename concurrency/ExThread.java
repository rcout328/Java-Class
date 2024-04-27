package concurrency;





class MultiThreading extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);  // pauses the thread for 2000 milliseconds (2 seconds)
            }
        } catch (InterruptedException e) {
            System.out.println("A thread was interrupted: " + e.getMessage());
        }
    }
}

public class ExThread {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            MultiThreading m1 = new MultiThreading();
            m1.start();
        }
    }
}
