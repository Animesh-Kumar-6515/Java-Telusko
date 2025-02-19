interface AB{ //interface contains only the design, implementation is done in the class which extends it.
    int age=44; //this if final and static
    void show();
    void config(); // by default it is public and static
}

class AC implements AB{
    public void show(){
        System.out.println("show");
    }
    public void config(){
        System.out.println("config");
    }
}

public class InterfaceInJava {
    public static void main(String[] args) {
        AB obj;
        obj=new AC();
        obj.show();
        obj.config();
    }
}
