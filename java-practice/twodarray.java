import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size");
        int n=sc.nextInt();
        System.out.println("enter col size");
        int m=sc.nextInt();

        int numbers[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the no you want to search");
        int x=sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(numbers[i][j]==x){
                System.out.println(x+" is found at "+ i +","+j);
              
            }
        }
    }

}}
