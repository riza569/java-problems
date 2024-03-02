public class fibonaccirecurs {
    // public static int fibo(int n){
        //     if(n==0)
        //         return 0;
        //     if(n==1||n==2)
        //     return 1;

        //     return fibo(n-1)+fibo(n-2);
        // }
        private static void fibo(int a, int b, int n) {
            if(n==0){
                return;
            }
            int c=a+b;
            System.out.print(c+" ");
            fibo(b,c,n-1);
        }
        public static void main(String[] args) {
            // int limit=7;
            // for(int i=0;i<limit;i++){
                //     System.out.print(fibo(i)+" ");
                //}
                
        int a=0;
        int b=1;
        int n=7;
        System.out.print(a+" "+b+" ");
        fibo(a,b,n-2);
    }
}
    
    