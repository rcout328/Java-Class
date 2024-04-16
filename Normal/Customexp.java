
class Invalidexp extends Exception{
    Invalidexp(String s){
        System.out.println("Invalid age"+s);
    }
}
public class Customexp {
    public static void validate(int age)throws Invalidexp{
   
            if(age<18){
                throw new Invalidexp("Age not validate");
            }
            else{
                System.out.println("welcome");
    }}
    public static void main(String[] args)throws Invalidexp{
        try{
        validate(22);
           }
        catch(Invalidexp obj){
        System.out.println(obj.toString());
        }
        System.out.println("Bye Bye");
    }
}
