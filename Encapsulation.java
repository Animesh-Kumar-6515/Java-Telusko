class Human{
    private int age;
    String name;

//    If we want to give some default value we use constructor
    public Human(){
        age=12; //if no age is assigned ,by default 12 is assigned
        System.out.println("Inside constructor");
    }

    public Human(int age,String name){ // we can also use paramitrized constructor to assign the value
        this.age=age;
        this.name=name;
    }

    public void setAge(int age){
//        age=a;
        this.age=age; //we use this when instance variable name is same as local variable
    }

    public int getAge(){
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.name="Animesh";
        obj.setAge(23);
        System.out.println(obj.name+" "+obj.getAge());
        Human obj2=new Human(22,"Annu");
        System.out.println(obj2.name+" "+obj2.getAge());
    }
}
