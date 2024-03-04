public class missingnumber {
    public static int missingnum(int arr[]){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
        sum=sum-arr[i];
    }
    return sum;
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,6,7};
    int num=missingnum(arr);
    System.out.println(num);
    }
}
    