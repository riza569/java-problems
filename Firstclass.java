import java.util.*;
class Firstclass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            int n=sc.nextInt();
            if(n>=90){
                System.out.println("Good");
            }
            else if(n<=89 && n>60){
                System.out.println("average");
            }else if(n<=59 && n>=0){
                System.out.println("poor");
            }
            else{
                System.out.println("invalid");
            }
            System.out.println("press 1 to continue or 0");
            ch=sc.nextInt();
        }while(ch==1);
            
    }
}