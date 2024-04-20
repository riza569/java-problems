import java.util.Arrays;
//brute
// public class consecutiveseq {
//     public static void main(String[] args) {
//         int arr[]={101,5,6,102,18,103,105,67,104};
//         int n=arr.length;
//         int longest=0;
//         for(int i=0;i<n;i++){
//             int x=arr[i];
//             int cnt=1;
import java.util.HashSet;
            
//            while(linearsearch(arr,x+1)){
//             x+=1;
//             cnt+=1;
//            }

//            longest=Math.max(longest,cnt);
//         }
//         System.out.println(longest);
//     }

//     private static boolean linearsearch(int[] arr, int num) {
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==num){
//                 return true;
//             }
//         }
//         return false;
//     }
// }


//better 
//o(nlogn)+o(n)
// public class consecutiveseq{
//     public static void main(String[] args) {
//         int arr[]={101,5,6,102,18,103,105,67,104};
//         int longest=1;
//         int cnt=0;
//         int n=arr.length;
//         int lastsmallest=Integer.MIN_VALUE;
//         //{5,6,18,67,101,102,103,104,105}
//         Arrays.sort(arr);
//         for(int i=0;i<n;i++){
//             if(arr[i]-1==lastsmallest){
//                 lastsmallest=arr[i];
//                 cnt++;
//             }

//             else if(arr[i]!=lastsmallest){
//                 lastsmallest=arr[i];
//                 cnt=1;
//             }
//             longest=Math.max(longest, cnt);
//         }
//         System.out.println(longest);
//     }
// }

public class consecutiveseq {

    public static void main(String[] args) {
        int arr[]={101,5,6,102,18,103,105,67,104};
        int n=arr.length;
        int longest=1;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
    }
        for(int it:set){
            if(!set.contains(it-1)){
                 int cnt=1;
                 int x=it;
                 while(set.contains(x+1)){
                    x=x+1;
                    cnt++;
                 }
                 longest=Math.max(longest,cnt);


            }
        }
        System.out.println(longest);
}}