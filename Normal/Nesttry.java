public class Nesttry {
    public static void main(String[] args) {
      try{
        int[] a = {1,2,3};
        System.out.println(a[3]);
        try{
            int x = a[1]/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
      }
      catch(ArrayIndexOutOfBoundsException obj){
            System.out.println(obj.toString());
      }}    }

