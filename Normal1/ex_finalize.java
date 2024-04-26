public class ex_finalize {
    public static void main(String[] args) {
        ex_finalize obj1 = new ex_finalize();
        obj1 = null;
        System.out.println("Object is going to destroy");
        System.gc();
    }
    protected void finalize(){
        System.out.println("Finalize method called");
    }
}
