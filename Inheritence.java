class A{
    public A(){
        super(); //this is hidden
        System.out.println("In A defalut constructor");
    }
    public A(int x){
        super(); //class A super will call Object class in java
        System.out.println("In A paramitrized constructor");
    }
}

class B extends A{
    public B(){
        super(); //this will call class A
        System.out.println("In B default Constructor");
    }
    public B(int x){
//        super(x); // this will call paramitrized
        this(); //this will call the custructor of the same class
        System.out.println("In B paramitrized Constructor");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        B obj=new B();
        B obj1=new B(5);

    }
}
