public class pascaltrianglever2 {
    public static void main(String[] args) {
        int n=5;
        pascaltriangle(n);
    }

    // private static void pascaltriangle(int n) {
    //     for(int col=1;col<=n;col++){
    //         System.out.print(ncr(n-1,col-1)+" ");
    //     }
    //     System.out.println();
    // }

    // private static int ncr(int n, int r) {  
    //     int res=1;
    //     for(int i=0;i<r;i++){
    //         res=res*(n-i);
    //         res=res/(i+1);
    //     }
    //     return res;
    // }
    public static void pascaltriangle(int n){
        int res=1;
        System.out.print(res+" ");
        for(int col=1;col<n;col++){
            res=res*(n-col);
            res=res/col;
            System.out.print(res+" ");
        }
        System.out.println();
    }
}
