class X{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B{ //inner class
        public void config(){
            System.out.println("in config");
        }
    }
}

class C{
    public void show(){
        System.out.println("in C show");
    }
}



public class InnerClass {
    public static void main(String[] args) {
        X obj=new X();
        X.B obj1=obj.new B();
        obj1.config();

        C obj2=new C(){
            public void show(){ // this is called anonymous class
                System.out.println("in new show C");
            }
        };

    }
}
