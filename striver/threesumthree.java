import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threesumthree{
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        int n=arr.length;
        List<List<Integer>>ans=triplet(n,arr);
        for(List<Integer>it:ans){
            System.out.print("[");
            for(int ele:it){
                System.out.print(ele+" ");
            }
            System.out.print("]");
        }
        System.out.println();

    }

    private static List<List<Integer>> triplet(int n, int[] arr) {
        Set<List<Integer>>st=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer>hashset=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(arr[i]+arr[j]);
                if(hashset.contains(third)){
                    List<Integer>temp=Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
            List<List<Integer>>ans=new ArrayList<>(st);
            return ans;
    }
}