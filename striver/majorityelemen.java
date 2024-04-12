import java.util.HashMap;
import java.util.Map;

public class majorityelemen {

    public static void main(String[] args) {
        int arr[]={3,2,2,3,2,4,3,3,7,3,3,3};
        int n=arr.length;
        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=arr[i];
            }
            else if(ele==arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(ele==arr[i]){
                cnt1++;
            }
        }
        if(cnt1>n/2){
            System.out.println(ele);
        }


        
        

    }
  }
        //HASHING APPROACH
        // HashMap<Integer,Integer>hm=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
           
        // }
        // for(Map.Entry<Integer,Integer>it:hm.entrySet()){
        //     if(it.getValue()>n/2){
        //         System.out.println(it.getKey());
        //     }
        // } 

        //bruteforce approach
        // for(int i=0;i<n;i++){
        //     int cnt=0;
        //     for(int j=0;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             cnt++;
        //         }

        //     }
        //     if(cnt>n/2){
        //         System.out.print(arr[i]);
        //         break;
        //     }


        // }