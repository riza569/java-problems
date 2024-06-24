public class maxprod {
    public static void main(String[] args) {
        int arr[]={1,-1,2,-3,5,4,-5};
        int n=arr.length;
        int pre=1;
        int suf=1;
        int ans=0;
        for(int i=0;i<n;i++){
            if(pre==0)pre=1;
            if(suf==0)suf=1;
            pre*=arr[i];
            suf*=arr[n-i-1];
            ans=Math.max(ans, Math.max(suf, pre));
        }
        System.out.println();
        System.out.println(ans);
    }  
}
