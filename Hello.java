class Hello {
    public static void main(String a[]) {
        System.out.println("Hi this is Animesh");
        int num1=2;
        int num2=2;
        System.out.println("You can write sout to get the System.out.println");
        System.out.println(4+2);
        System.out.println("num1 : "+num1);
        boolean x=num1>num2;
        System.out.println(x);
        // conditional statement
        if(num1>num2){
            System.out.println("Greater");
        } else if (num1==num2) {
            System.out.println("Equal");
        } else{
            System.out.println("Smaller");
        }
        int n=3;
        String result=n%2==0?"even":"odd";
        System.out.println(result);


    }
}