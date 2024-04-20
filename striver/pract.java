import java.util.Arrays;

public class pract {
    public static void main(String[] args) {
        int arr[]={100,102,103,104,105,101,200,3,2,1,4};
        int cnt=1;
        int longest=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]-1){
                cnt++;
                longest=Math.max(longest, cnt);
            }
            else{
                cnt=1;
            }
        }
        System.out.println(longest);
    }
}
