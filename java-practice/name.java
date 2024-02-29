import java.util.*;

public class name{
    public static void myName(String name){
        System.out.printf("your name is: %S \n",name);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String n=sc.nextLine();
       myName(n);
       String m=sc.nextLine();

       myName(m);
    }
}