public class book {
    public static void main(String[] args) {
        int arr[]={25, 46, 28, 49, 24};
        int m=4;
        int minpages=calcmaxpages(arr,m);
        System.out.println();
        System.out.println(minpages);
    }

    private static int calcmaxpages(int[] arr, int m) {
        int n=arr.length;
        int max=0;
        int sum=0;
        if(m>n)return -1;
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
            sum+=arr[i];

        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int student=possible(arr, mid);
            if(student<=m){
                high=mid-1;
            }
            else{low=mid+1;}
        }
        return low;
        
    }

    private static int possible(int[] arr, int pages) {
        int student=1;
        int pagescount=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]+pagescount<=pages){
                pagescount+=arr[i];
            }
            else{
                student++;
                pagescount=arr[i];
            }
        }
        return student;
    }
}
