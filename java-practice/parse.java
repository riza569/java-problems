import java.util.Scanner;

public class parse {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      String str[]=new String[size];
        int totlallength=0;
      for(int i=0;i<size;i++){
        str[i]=sc.next();
        totlallength+=str[i].length();
      }
      System.out.println(totlallength);
    }
}
