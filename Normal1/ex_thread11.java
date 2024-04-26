
class myt1 implements Runnable{
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000); 
            }
        } catch (Exception e) {
            System.out.println( e.toString());
        }
    }
}

class myt2 implements Runnable{
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() );
                Thread.sleep(1000);  
            }
        } catch (Exception e) {
            System.out.println( e.toString());
        }
    }
}

public class ex_thread11 {
    public static void main(String[] args) {
        myt1 m1 = new myt1();
        myt2 m2 = new myt2();
        Thread t1 = new Thread(m1);
        Thread t2  = new Thread(m2);    // Pass the instance of MultiThreading to the Thread constructor
        t1.start(); 
        t2.start(); 

    }
}
