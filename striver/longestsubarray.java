public class longestsubarray {
    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0)
                    max=Math.max(max,j-i+1 );
            }
        }
        System.out.println(max);
    }
}
