class Mobile{
    int id;
    static String name;
//    static
//    {
//        name="iphone";
//        System.out.println("static block");
//    }
//    public Mobile(){ //this is constructor
//        id=1;
//        System.out.println("constructor called");
//    }

    public static void show1(Mobile obj){
        System.out.println(obj.id+" "+name);
    }
}


public class Static1 {

    public static void main(String[] args) {
       Mobile mob1=new Mobile();
       mob1.id=1;
       mob1.name="iphone";
       Mobile mob2=new Mobile();
       mob2.id=2;
       mob2.name="iphone";
       mob1.name="android"; //this will change both the object cause static variable are shared by all the objects
        System.out.println(mob1.name);
        System.out.println(mob2.name);
        Mobile.show1(mob1);
    }
}
