public class Loop {
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
            i++;
            System.out.println("Hi"+i);
        }
        int j=5;
        do {
            System.out.println("Do");
            j++;
        }
        while(j<3);
    }
}
