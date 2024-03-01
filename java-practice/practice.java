public class practice {
    public static void printno(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printno(n-1);
    }
    public static void main(String[] args) {
        printno(5);

    }
}
