public class missing {
    public static void main(String[] args) {
        int arr[]={0,4,5,8,1,9,7,2,6};
        int n=arr.length;
        int N=n+1;
        int ans=0;
        int newarr[]=new int[N];
      
        for(int i=0;i<n;i++){
            newarr[arr[i]]=1;
        }
        for(int i=0;i<=n;i++){
            if(newarr[i]==0){
                 ans=i;
            }
        }
        System.out.println(ans);
    }
}

//if 1 should be added without zero then make it temp[arr[i]-1]
