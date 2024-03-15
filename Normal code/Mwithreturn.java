public class Mwithreturn {
    public static int add(){
        int a,b,c;
        a = 5;
        b = 7;
        c = a+b;
        return c;
    }
    public static void main(String[] args) {
        int Ans;
        Ans = add();
        System.out.println("Ans " +Ans);
    }
}
