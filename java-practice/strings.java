import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name1=sc.nextLine();
        String name2=sc.nextLine();
        if(name1.equals(name2)){
            System.out.println("they are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
    
    }
}
