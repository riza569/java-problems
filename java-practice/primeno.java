public class primeno {
    public static void Prime(int n){
        int flag=0;
        int i;
        for(i=1;i<=n/2;i++){
            if(n%i==0){
                flag++;
            }
        }
        if(flag>1){
            System.out.print(n+" is not a prime number");
            return;
        }else{
            System.out.println(n+" is a prime no");
            return;
        }
    }
    public static void main(String[] args) {
        int a=11;
        Prime(a);
    }
}
