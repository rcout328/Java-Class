public class unary {
    public static void main(String[] args) {
        int a,b,c,sum;

        a = 10;
        b = 5;
        c = 1;

        sum = a + ++b + c++;
        System.out.println(sum);
        System.out.println(c++);
        System.out.println(++b);
    }
}
