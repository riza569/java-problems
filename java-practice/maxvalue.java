import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int max=numbers[0];
        int min=numbers[0];
        
        for(int i=0;i<size;i++){
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            } 
                
            
        }
        System.out.println("Max no "+max+" min no "+min);
    }
}
