import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int third;
        int i;
        System.out.print(first+" "+second+" ");
        if(n>1){
            for(i=2;i<=n;i++){
                third=first+second;
                System.out.print(third+" ");
                first=second;
                second=third;

            }
        }
    }
}
