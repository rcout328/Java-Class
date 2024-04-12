public class Ex_throwkey {
    static void divide() throws ArithmeticException {
        int x,y,z;
        x = 10;
        y = 0;
        try{
            z = x/y;
            System.out.println("Division" + z);
        }
        catch(ArithmeticException obj){
            System.out.println("Catch block in divide");
            //throw obj;
            throw new ArithmeticException("number cant be zero");
        }
    }
    public static void main(String[] args) {
        try{
            divide();
        }
        catch(ArithmeticException e){
            System.out.println("Caatch block in main");
            System.out.println(e.toString());
        }
        finally{
            System.out.println("bye bye");
        }
    }

}
