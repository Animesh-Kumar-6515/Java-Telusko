class Calculator{
    int a=23;

    public int add(int a,int b){
        System.out.print("Addition ");
        System.out.println(a+b);
        return 0;
    }
    public int addMulti(int n1,int n2){
        return n1+n2;
    }
}

public class Object {

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.add(2,3);
        Calculator calc2=new Calculator();
        int sum=calc.addMulti(3,4);
        System.out.println(sum);
        System.out.println(calc.a);
        calc2.a=14;
        System.out.println(calc2.a);

    }
}
