public class factorial {
    public static void fact(int n){
        int fact=1;
        if (n==1){
            System.out.println(fact);
            return;
        }
        else if(n>1)
        {
        for(int i=1;i<=n;i++){

            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    else{
         System.out.println("not possible for neg numbers");
         return;
    }
    }
    public static void main(String[] args) {
        
        int num=4;
        fact(num);
    }
}
