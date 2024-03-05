// public class subarraysum {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7};
//         int n=arr.length;
//         int currentsum=0;
//         int find=16;
//         for(int i=0;i<n;i++){
//             currentsum=arr[i];
//             if(currentsum==find){
//                 System.out.println("index found at "+ i);
//             }
//             else{

//                 for(int j=i+1;j<n;j++){
//                     currentsum+=arr[j];
//                     if(currentsum==find){
//                         System.out.println("sub array found at index "+i+" and "+ j );
//                         break;
//                     }
//                     }
                
//             }


//         }
//         System.out.println("No sub array found");
//     }
// }

// //TIME COMPLEXITY O(N^2)


public class subarraysum{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int currentsum=arr[0];
        int sum=12;
        int start=0;
        for(int i=1;i<n;i++){
            while(currentsum>sum && start<i-1){
                currentsum-=arr[start];
                start++;
            }
            if(currentsum==sum){
                int p=i-1;
                System.out.println("sum found at index "+start+ " and "+p);
                break;
            }
            if(i<n){
                currentsum+=arr[i];
            }
        }


    }
}

//Time Complexity: O(N)
