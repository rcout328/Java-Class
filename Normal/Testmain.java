 class inh {
    int a = 10;
    public void display(){
        System.out.println("Method from the base");
    }
}
class Dervied extends inh {
    public void dervie (){
        System.out.println("Method from dervied");
    }
}
class Testmain{
    public static void main(String[] args) {
        Dervied d1 = new Dervied();
        d1.display();
        d1.dervie();
        System.out.println(d1.a);
    }
}