import java.util.Scanner;

public class ascendingorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        boolean isAscending=true;

        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("they are in ascending order");
        }else{
            System.out.println("they are not in ascending order");
        }

    }
}
