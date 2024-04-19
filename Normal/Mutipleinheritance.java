interface p {
    static final int a = 10;
    abstract void method();
}
interface p1 extends p{
    static final int b = 20;
    abstract void method1();
}

interface p2 extends p{
    static final int c = 30;
    abstract void method2();
}

interface p3 extends p1,p2 {
    static final int d = 40;
    abstract void method2();
}

class Q implements p3{ 
  public void method(){
    System.out.println(a);
  }
  public void method1(){
    System.out.println(b);
  }
  public void method2(){
    System.out.println(c);
  }
  public void method3(){
    System.out.println(d);
  }
}




public  class Mutipleinheritance {
    public static void main(String[] args) {
      Q q = new Q();
      q.method();
      q.method1();
      q.method2();
      q.method3();
    }
}
