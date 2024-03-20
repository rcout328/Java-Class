public class Wrap{
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a);
        System.out.println(a);

        Integer  b = new Integer(22);
        int q = b.intValue();
        double d = b.doubleValue();
        System.out.println(q);
        System.out.println(d);

    }
}