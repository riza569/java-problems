import java.util.HashMap;
import java.util.Map;

public class numberthatappearonce {
    public static int number(int arr[]){

        //better aprroach1 0(n)+o(n)+o(n)
        //O(M+1)

        // int maxe=0;
        // for(int i=0;i<arr.length;i++){
        //     maxe=Math.max(maxe,arr[i]);
        // }

        // int hash[]=new int[maxe+1];
        // for(int i=0;i<arr.length;i++){
        //     hash[arr[i]]++;
        // }
        // for(int i=1;i<=arr.length;i++){
        //     if(hash[arr[i]]==1){
        //         return arr[i];
        //     }
        // }
        // return -1;



        //bruteforce aprroach o(n^2)
        //SPACE COMPLEXITY 0(1)
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         int flag=0;
    //         for(int j=0;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 flag++;
    //             }
    //         }
    //             if(flag==1){
    //                 System.out.print(arr[i]);
    //                 break;
    //             }
    //     }


    //hashmap approach TIME COMPLEXITY o(nlogm)+o(m)  m-->size of the map
    //SPACE COMPLEXITY O(M) 
    // int n=arr.length;
    // HashMap <Integer,Integer>hm=new HashMap<>();
    // for(int i=0;i<n;i++){
    //     int value=hm.getOrDefault(arr[i], 0);
    //     hm.put(arr[i],value+1);
    // }
    // for(Map.Entry<Integer,Integer>it:hm.entrySet()){
    //     if(it.getValue()==1){
    //         return it.getKey();
    //     }
    // }
    // return -1;

    //optimal approach//o(n)
    int n=arr.length;
    int xor=0;
    for(int i=0;i<n;i++){
        xor=xor^arr[i];
    }
    return xor;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,1,0,0,3};
        System.out.println(number(arr));
    }
}
