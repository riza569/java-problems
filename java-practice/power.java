import java.util.Scanner;

public class power {
    public static void Powers(int n,int x){
        int i;
        int result=1;
        for(i=1;i<=n;i++){
            result=result*x;
        }
        System.out.println(x+" to the power "+n+" is "+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int n=sc.nextInt();
            Powers(n, x);
        
    }
}
