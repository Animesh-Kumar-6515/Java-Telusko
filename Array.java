class Student{
    int roll;
    String name;
    int marks;
}

public class Array {
    public static void main(String[] args) {
//     simple array
        int arr[]=new int[4];
        arr[0]=4;
        arr[1]=2;
        arr[2]=2;
        arr[3]=3;
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
//         multi dimensional arraya
        int mat[][]=new int[2][2];
        mat[0][0]=2;
        mat[0][1]=3;
        mat[1][0]=4;
        mat[1][1]=5;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }
        // jagged array
        int jagged[][]=new int[3][];
        jagged[0]=new int[3];
        jagged[1]=new int[2];
        jagged[2]=new int[4];
        for(int i=0;i<3;i++){
            for(int j=0;j<jagged[i].length;j++){
                int x=(int)(Math.random()*10);
                jagged[i][j]=x;
                System.out.print(x+" ");
            }
            System.out.print("\n");
        }
//        array of object
        Student st1=new Student();
        st1.roll=1;
        st1.name="Annu";
        st1.marks=90;

        Student st2=new Student();
        st2.name="Animesh";
        st2.roll=2;
        st2.marks=89;

        Student students[]=new Student[2];
        students[0]=st1;
        students[1]=st2;
        System.out.println(students[0].name);

//        character array
        String name=new String("Animesh");  //we are using this syntax is becuase String is a class
        System.out.println("Hello "+name);
//        in heap memory we have a place called "Constant string pool" there "Animesh" will be stored with a location with its address now name will point to that address.
        name=name+" Kumar";
//        here name is pointing to another location which stores "Animesh Kumar" and the original adress still contains "Animesh"


//        StringBuffer
        StringBuffer sb=new StringBuffer("Animesh");
        sb.append(" Kumar");
        System.out.println(sb);
        sb.insert(8,"Jha ");
        System.out.println(sb);



    }
}
