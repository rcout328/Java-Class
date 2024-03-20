 class person {
    person(){
        System.out.println("person");
    }
}
class emp extends person {
    emp(){
        System.out.println("emp");
    }
}

class fac extends emp{
    fac(){
        super();
        System.out.println("fac");
    }
}

public class poly2 {
    public static void main(String[] args) {
        fac f1 = new fac();    
    }
}
