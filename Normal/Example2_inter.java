
// 2 inter person a , b a walk b run method class person walk and run method define call person object metodhs
interface persona{
    abstract void walk(String s);
}
interface personb {
    abstract void run(String s);
}

interface personc extends persona,personb {
    abstract void mix(String s);
}



class person implements personc{
    public void walk(String s){
        System.out.println("Walk " + s);
    }
    public void run(String s){
        System.out.println("RUn " + s);
    }
    public void mix(String s){
        System.out.println("Mix " + s);
    }
}

public class Example2_inter {
    public static void main(String[] args) {
        person k =  new person();
        k.walk("chal");
        k.run("Dod la");
        k.mix("Mix ho gya");
    }
}
