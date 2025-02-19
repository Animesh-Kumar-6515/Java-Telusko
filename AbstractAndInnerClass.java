abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Pyling Music....");
    }
}

class Bmw extends Car{ //concrete class
    public void drive(){
        System.out.println("Driving Car");
    }
}


public class AbstractAndInnerClass {
    public static void main(String[] args) {
        Car obj = new Bmw(); // we can make object of only concrete class
        obj.drive();
        obj.playMusic();
    }
}
