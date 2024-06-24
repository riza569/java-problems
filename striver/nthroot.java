public class nthroot {

    public static void main(String[] args) {
        int n=81;
        int m=4;
        int nthsqrt=nthsquare(n,m);
        System.out.println();
        System.out.println(nthsqrt);
       
}

    private static int nthsquare(int n, int m) {
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=fn(mid,m,n);
            if(val==1)return mid;
            else if(val==0)low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    private static int fn(int mid, int m, int n) {
        long ans=1;
        for(int i=1;i<=m;i++){
            ans=ans*mid;
            if(ans>n)
                return 2;
            }
        if(ans==n)return 1;
        return 0;
    }
}