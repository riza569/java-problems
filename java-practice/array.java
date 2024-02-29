import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // int marks[]=new int[3];
        // marks[0]=95;
        // marks[1]=93;
        // marks[2]=92;
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }
        System.out.println("enter the size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("enter the no u want to search");
        int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println(x+" is found in index "+i);
            }
        }

    }
}
