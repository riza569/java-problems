public class mergetwoarrays {
    public static void main(String[] args) {
        int arr1[]={1,4,10,15};
        int arr2[]={2,3,16};
        int n=arr1.length;
        int m=arr2.length;
        merge(arr1,arr2,n,m);
        System.out.println();
        System.out.print("arr1[] ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("arr2[] ");

        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
    }

    private static void merge(int[] arr1, int[] arr2, int n, int m) {
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if(left<n&&right>=n){
                    swapisgreater(arr1,arr2,left,right-n);
                }
                else if(left>=n){
                    swapisgreater(arr2,arr2,left-n,right-n);
                }
                else{
                    swapisgreater(arr1,arr1,left,right);
                    
                }
                left++;
                right++;
            }
            if(gap==1)break;
            gap=(gap/2)+(gap%2);
        }
    }

    private static void swapisgreater(int[] arr1, int[] arr2, int left, int right) {
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
            }
    }
}
