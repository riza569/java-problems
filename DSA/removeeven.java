import java.util.Arrays;

public class removeeven {
    public static void main(String[] args) {

        int arr[]={3,2,4,7,10,6,5};
        int index=0,oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddcount++;
            }
        }
        int oddarr[]=new int [oddcount];

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddarr[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(oddarr));      
        
    }
}
