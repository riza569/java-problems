public class shipment {
    public static void main(String[] args) {
        int arr[]={5,4,5,2,3,4,5,6};
        int days=5;
        int limit=calcweight(arr,days);
        System.out.println();
        System.out.println(limit);

    }

    private static int calcweight(int[] arr, int days) {
        int max=0;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
            sum+=arr[i];
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int noofdays=calcdays(arr, mid);
            if(noofdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        for(int i=max;i<=sum;i++){
            int daysreq=calcdays(arr,i);
            if(daysreq<=days)return i;
        }
        return -1;
    }

    private static int calcdays(int[] arr, int weight) {
        int n=arr.length;
        int days=1;
        int load=0;
        for(int i=0;i<n;i++){
            if(arr[i]+load>weight){
                days+=1;
                load=arr[i];

            }
            else{
                load+=arr[i];
            }
        }
        return days;
    }
}
