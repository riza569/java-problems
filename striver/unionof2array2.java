import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class unionof2array2 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={3,4,5,6,7,8};
        HashSet<Integer>hs=new HashSet<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        for(int x:hs){
            arr.add(x);
        }
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
