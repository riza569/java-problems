import java.util.ArrayList;

public class duplicates {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2, 2, 4, 7 };
        ArrayList<Integer>result=new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     int index=Math.abs(arr[i])-1;

        //     if(arr[index]<0){
        //         result.add(index+1);
        //     }

        //     arr[index]=arr[index] * -1;
        // }
        
        // for(int x:result){
        //     System.out.println(x);
        // }
        //or
        int n=arr.length;
        for(int i=0;i<n;i++){
            int index=arr[i] % n;
            arr[index]+=n;
        }
        for(int i=0;i<n;i++){
            if(arr[i]/n >=2){
                result.add(i);
            }
        }
        for(int x:result){
            System.out.println(x);
        }
    }                           
}
