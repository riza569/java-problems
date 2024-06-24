public class squareroot {
    public static void main(String[] args) {
        int n=36;
        int root=sqroot(n);
        System.out.println();
        System.out.println(root);
        
    
}

    private static int sqroot(int n) {
        int low=  1;
        int high=n;
        while(low<=high){
            long mid=low+(high-low)/2;
            long val=mid*mid;
            if(val<=(long)n){
                low=(int)mid+1;
            }
            else{
                high=(int)mid-1;
            }
        }
        return high;
    }}