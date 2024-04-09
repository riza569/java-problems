import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int arr[]={2,4,5,8,8,6};
        int target=11;
        int []ans=twosum(arr,target);
        System.out.println("index found att "+ans[0]+" and "+ans[1]);
    }

    private static int[] twosum(int[] arr,int target) {
        int n=arr.length;

        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            int otherele=target-arr[i];
            if(!hm.containsKey(otherele)){
                hm.put(arr[i],i);
            }
            else{
                ans[0]=hm.get(otherele);
                ans[1]=i;
                return ans;

            }
        }
        return ans;
    }
}
