
public class alliin1Me {
    public static void sub(){
        int a = 10;
        int b = 2;
        System.out.println("Sub "+(a-b));
    }
    public static void sum(int a,int b){
        System.out.println("Add " +(a+b));
    }
    public static int mul(){
        int a,b,c;
        a = 5;
        b = 7;
        c = a*b;
        return c;
    }
    public static int div(int a,int b){
        return(a/b);
    }
    public static void main(String[] args) {
        sub();
        int a = 10;
        int b = 20;
        int ans;
        int ans1;
        sum(a,b);
        ans= mul();
        ans1 = div(a,b);
        System.out.println("Mul " + ans);
        System.out.println("Div " + ans1);
        


    }
}
