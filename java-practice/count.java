import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int flag=0;
        int positive=0;
        int negative=0;
        Scanner SC=new Scanner(System.in);
        System.out.println("press 1 to continue & 0 to stop");
        int ch=SC.nextInt();
        while(ch==1){
        System.out.println("enter the number");
        int n=SC.nextInt();
        if(n<0){
            negative++;
        }
        if(n>0){
            positive++;

        }
        else{
            flag++;
        }
        System.out.println("press 1 to continue & 0 to stop");
        ch=SC.nextInt();
    }
            
        System.out.println("the count of zeroes are "+flag);
        System.out.println("the count of positives are "+positive);
        System.out.println("the count of negative are "+negative);

      
    }
}
