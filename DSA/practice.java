public class practice {
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int n=arr.length;
    int sum=12;
    int currentsum=arr[0];
    int start=0;
    for(int i=1;i<n;i++){
        
        while(currentsum>sum && start<i-1){
            currentsum-=arr[start];
            start++;
        }
        if(currentsum==sum){
            int p=i-1;
            System.out.println("sum found at index "+start+" and "+p);
            break;
        }
        if(i<n){
            currentsum+=arr[i];
        }
        }
        
        System.out.println("no subarray");
  
}}


    

