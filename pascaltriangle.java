import java.util.Scanner;

public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int number=1;
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/j;
            }
            System.out.println();
        }
    }
}