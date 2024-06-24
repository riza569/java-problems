
public class merge2arrayss {
    public static void main(String[] args) {
        int arr1[]={1, 4 ,8 ,10};
        int arr2[]={2,3,9};
        merger(arr1,arr2);
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int it:arr2){
            System.out.print(it+" ");
        }
    }
    public static void isgreater(int arr1[],int arr2[],int ele1,int ele2){
        if(arr1[ele1]>arr2[ele2]){
            int temp=arr1[ele1];
            arr1[ele1]=arr2[ele2];
            arr2[ele2]=temp;

        }
    }

    private static void merger(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if(left<n&&right>=n){
                    isgreater(arr1, arr2, left, right-n);
                }
                else if(left>=n){
                    isgreater(arr2, arr2, left-n, right-n);
                }
                else{
                    isgreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if(gap==1)break;
            gap=(gap/2)+(gap%2);
        }
    }
}
