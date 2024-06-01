
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeintervals {

    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{11,15}};
        List<List<Integer>>ans=merge(arr);
        System.out.println();
        for(List<Integer>it:ans){
            System.out.print("["+it.get(0)+"]"+"["+it.get(1)+"]");
        }
        System.out.println();
}
public static List<List<Integer>>merge(int arr[][]){
    int n=arr.length;
    Arrays.sort(arr,new Comparator<int[]>() {
        public int compare(int a[],int b[]){
            return a[0]-b[0];
        }
    });
    List<List<Integer>>ans=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(ans.isEmpty()||arr[i][0]>ans.get(ans.size()-1).get(1)){
            ans.add(Arrays.asList(arr[i][0],arr[i][1]));
        }
        else{
            ans.get(ans.size()-1).set(1, Math.max(arr[i][1], ans.get(ans.size()-1).get(1)));
        }
    }
    return ans;
}
}