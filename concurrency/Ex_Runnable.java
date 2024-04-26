package concurrency;

class MultiThreadingg implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - Iteration: " + i);
                Thread.sleep(2000);  // pauses the thread for 2000 milliseconds (2 seconds)
            }
        } catch (Exception e) {
            System.out.println(  e.toString());
        }
    }
}

public class Ex_Runnable {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            MultiThreading m1 = new MultiThreading();
            Thread t = new Thread(m1);  // Pass the instance of MultiThreading to the Thread constructor
            t.start();
        }
    }
}
