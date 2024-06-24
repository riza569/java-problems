import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergin {
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{12,18}};
        int n=arr.length;
        List<List<Integer>>ans=merge(arr,n);
        for(List<Integer> it:ans){
            System.out.print("["+it.get(0)+","+it.get(1)+"]");
        }

    }

    private static List<List<Integer>> merge(int[][] arr, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr, new Comparator<int[]>() {
            public  int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });

        for(int i=0;i<n;i++){
            if(ans.isEmpty()||ans.get(ans.size()-1).get(1)<arr[i][0])
            ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            else{
                ans.get(ans.size()-1).set(1,Math.max(arr[i][1],ans.get(ans.size()-1).get(1)));
            }
        }
        return ans;

}
}