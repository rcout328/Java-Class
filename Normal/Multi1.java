

class person {
    String name = "abs";
    person(){
        System.out.println(name);
    }
    public void msg (){
        System.out.println("Welcome to New Lj");
    }
}

class Student  extends person{
    Student(){
        super();
        System.out.println("Student");
    }
    public void printName(){
        super.msg();
        System.out.println("Name"+super.name)
    }
}