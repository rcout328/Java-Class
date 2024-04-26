class Table {
    
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}

class Thread1 extends Thread {
    Table t = new Table();
    Thread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    Table t = new Table();
    Thread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

public class ExSync {
    public static void main(String[] args) {
        Table t = new Table();
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        t1.start();
        t2.start();
    }
}
