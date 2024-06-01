import java.util.Arrays;

public class merge2arrays {
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
        int left=n-1;
        int right=0;
        while(left>=0&&right<m){
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
                
            }else{break;}

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
