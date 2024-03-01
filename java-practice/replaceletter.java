import java.util.Scanner;

public class replaceletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String result="";
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == 'e'){
                result=result+'i';
            }else{
                result=result+name.charAt(i);
            }
        }
        System.out.println(result);

    }
}
