public class merge2aarray {
    public static void main(String[] args) {
        int arr1[]={1,4,7,10};
        int arr2[]={2,3,5};
        int n=arr1.length;
        int m=arr2.length;
        merge(arr1,arr2,n,m);
        System.out.println();
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("arr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static void merge(int[] arr1, int[] arr2,int n,int m) {
        int arr3[]=new int[n+m];
        int index=0;
        int left=0;
        int right=0;
        while(left<n&&right<m){
            if(arr1[left]<=arr2[right]){
                arr3[index]=arr1[left];
                left++;
                index++;
            }
            else{
                arr3[index]=arr2[right];
                right++;
                index++;
            }
        }
        while(left<n){
            arr3[index++]=arr1[left++];
        }
        while(right<m){
        arr3[index++]=arr2[right++];
        }

        for(int i=0;i<n+m;i++){
            if(i<n)
            arr1[i]=arr3[i];
            else{
                arr2[i-n]=arr3[i];
            }
            
        }
    }

}
